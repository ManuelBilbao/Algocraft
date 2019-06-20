package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.controller.Crafter.CrafterStage;
import fiuba.algo3.tp2.controller.Inventario.InventarioStage;
import fiuba.algo3.tp2.controller.ObjetosDisponibles.ObjetosDisponibles;
import fiuba.algo3.tp2.modelo.Jugador;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuPrincipal {

    String[] materiales = {"madera", "piedra", "metal", "diamante"};
    VBox menuInicial;

    public MenuPrincipal(Jugador jugador, double ancho, double alto){

        menuInicial = new VBox();
        Button inventario = new Button("Inventario");

        ObjetosDisponibles objetosDisponibles = new ObjetosDisponibles(ancho/3/4, alto/7,materiales,jugador.getInventarioMateriales());

        Button buttonCrafter = (new AlgocraftButton("Crafter",ancho/3,alto/3,alto/6 )).getVisual();
        Stage stageCrafter =  (new CrafterStage(jugador)).getStage() ;
        buttonCrafter.setOnAction(e -> {
            stageCrafter.showAndWait();
            objetosDisponibles.updateCantidadDeMateriales();
        });

        Button buttonInventario = (new AlgocraftButton("Inventario",ancho/3,alto/3, alto/6 )).getVisual();
        Stage inventarioStage =  (new InventarioStage(jugador)).getStage() ;
        buttonInventario.setOnAction(e -> { inventarioStage.showAndWait(); });

        menuInicial.getChildren().addAll(buttonCrafter, buttonInventario, objetosDisponibles.getVisualHBox());

        menuInicial.setAlignment(Pos.BOTTOM_CENTER);
        menuInicial.setSpacing(10);

    }

    public VBox getVisual(){
        menuInicial.setPadding(new Insets(30, 30, 20, 20));
        return menuInicial;}
}
