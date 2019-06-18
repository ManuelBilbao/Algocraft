package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.controller.Crafter.CrafterStage;
import fiuba.algo3.tp2.controller.Inventario.InventarioStage;
import fiuba.algo3.tp2.controller.ObjetosDisponibles.ObjetosDisponibles;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.vista.AlgocraftButton;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MenuPrincipal {

    String[] materiales = {"madera", "piedra", "metal", "diamante"};
    HBox menuInicial;

    public MenuPrincipal(Jugador jugador){

        int size = 80;

        menuInicial = new HBox();
        Button inventario = new Button("Inventario");

        ObjetosDisponibles objetosDisponibles = new ObjetosDisponibles(size,materiales,jugador.getInventarioMateriales());

        Button buttonCrafter = (new AlgocraftButton("Crafter",size/4,size*1.65,size/4 )).getVisual();
        Stage stageCrafter =  (new CrafterStage(jugador)).getStage() ;
        buttonCrafter.setOnAction(e -> { stageCrafter.showAndWait(); });

        Button buttonInventario = (new AlgocraftButton("Inventario",size/4,size*1.65,size/4 )).getVisual();
        Stage inventarioStage =  (new InventarioStage(jugador)).getStage() ;
        buttonInventario.setOnAction(e -> { inventarioStage.showAndWait(); });

        menuInicial.getChildren().addAll(objetosDisponibles.getVisualHBox(), buttonCrafter, buttonInventario);

        menuInicial.setAlignment(Pos.CENTER);

    }

    public HBox getVisual(){ return menuInicial;}
}
