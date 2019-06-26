package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.controller.Crafter.CrafterStage;
import fiuba.algo3.tp2.controller.Inventario.InventarioStage;
import fiuba.algo3.tp2.controller.ObjetosDisponibles.ObjetosDisponibles;
import fiuba.algo3.tp2.modelo.Juego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class MenuPrincipal {

    String[] materiales = {"madera", "piedra", "metal", "diamante"};
    VBox menuInicial;
    InventarioStage inventarioStage;
    CrafterStage craferStage;
    ObjetosDisponibles objetosDisponibles;

    public MenuPrincipal(Juego juego, double ancho, double alto){

        menuInicial = new VBox();
        objetosDisponibles = new ObjetosDisponibles(ancho/3/4, alto/7,materiales,juego);

        Button buttonCrafter = (new AlgocraftButton("Crafter",ancho/3,alto/3,alto/6 )).getVisual();
        craferStage =  new CrafterStage(juego);
        buttonCrafter.setOnAction(e -> {
            craferStage.getStage().showAndWait();
            objetosDisponibles.updateCantidadDeMateriales();
        });

        Button buttonInventario = (new AlgocraftButton("Inventario",ancho/3,alto/3, alto/6 )).getVisual();
        inventarioStage =  new InventarioStage(juego) ;
        buttonInventario.setOnAction(e -> { inventarioStage.getStage().showAndWait(); });

        menuInicial.getChildren().addAll(buttonCrafter, buttonInventario, objetosDisponibles.getVisualHBox());

        menuInicial.setAlignment(Pos.BOTTOM_CENTER);
        menuInicial.setSpacing(10);

    }

    public String getHerramientaEquipada(){
        return inventarioStage.getHerramientaEquipada();
    }
    public void desequiparHerramienta(){ inventarioStage.desequiparHerramienta();}


    public void update(){
        craferStage.updateCantidadMateriales();
        objetosDisponibles.updateCantidadDeMateriales();
    }
    public VBox getVisual(){
        menuInicial.setPadding(new Insets(30, 30, 20, 20));
        return menuInicial;}
}
