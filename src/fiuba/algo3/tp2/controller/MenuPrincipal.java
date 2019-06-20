package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.controller.Crafter.CrafterStage;
import fiuba.algo3.tp2.controller.Inventario.InventarioStage;
import fiuba.algo3.tp2.controller.ObjetosDisponibles.ObjetosDisponibles;
import fiuba.algo3.tp2.modelo.Jugador;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MenuPrincipal {

    String[] materiales = {"madera", "piedra", "metal", "diamante"};
    HBox menuInicial;

    public MenuPrincipal(Jugador jugador){

        int size = 800;

        menuInicial = new HBox();
        Button inventario = new Button("Inventario");

        ObjetosDisponibles objetosDisponibles = new ObjetosDisponibles(size/8,24,materiales,jugador.getInventarioMateriales());

        Button buttonCrafter = (new AlgocraftButton("Crafter",size/3,size/16,size/24 )).getVisual();
        Stage stageCrafter =  (new CrafterStage(jugador)).getStage() ;
        buttonCrafter.setOnAction(e -> {
            stageCrafter.showAndWait();
            objetosDisponibles.updateCantidadDeMateriales();
        });

        Button buttonInventario = (new AlgocraftButton("Inventario",size/3,size/16,size/24 )).getVisual();
        Stage inventarioStage =  (new InventarioStage(jugador)).getStage() ;
        buttonInventario.setOnAction(e -> { inventarioStage.showAndWait(); });

        menuInicial.getChildren().addAll(objetosDisponibles.getVisualHBox(), buttonCrafter, buttonInventario);

        menuInicial.setAlignment(Pos.CENTER);
        menuInicial.setSpacing(30);

    }

    public HBox getVisual(){ return menuInicial;}
}
