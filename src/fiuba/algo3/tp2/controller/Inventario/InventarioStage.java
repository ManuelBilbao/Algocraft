package fiuba.algo3.tp2.controller.Inventario;

import fiuba.algo3.tp2.controller.Crafter.MesaGridPane;
import fiuba.algo3.tp2.controller.Crafter.OpcionesHBox;
import fiuba.algo3.tp2.controller.ObjetosDisponibles.ObjetosDisponibles;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.vista.AlgocraftTittle;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class InventarioStage {

    Stage stage;
    int size = 800;
    Jugador jugador;
    String[] herramientas = {"hachaDeMadera", "hachaDeMetal", "hachaDePiedra", "hachaDeDiamante","picoDeMadera", "picoDeMetal", "picoDePiedra", "picoDeDiamante", "picoFino"};


    public InventarioStage(Jugador jugador){

        this.jugador = jugador;

        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Algocraft - Inventario");

        BorderPane layout = new BorderPane();

        EquiparButton equiparButton = new EquiparButton(50);

        layout.setTop(getTitle());
        layout.setCenter(getInventarioGridPane(equiparButton));
        layout.setBottom(getInventaroOpcionesBox(equiparButton));


        Scene scene = new Scene(layout);
        stage.setScene(scene);
    }

    public Stage getStage(){ return stage;}


    private HBox getTitle(){
        AlgocraftTittle algocraftTittle = new AlgocraftTittle("Inventario",size*0.76,size/10,size/15);
        HBox title = new HBox(algocraftTittle.getVisual());
        title.setAlignment(Pos.CENTER);
        return title;
    }

    private GridPane getInventarioGridPane(EquiparButton equiparButton){
        InventarioGridPane inventario = new InventarioGridPane(herramientas,jugador,equiparButton);
        return inventario.getVisual();
    }

    private HBox getInventaroOpcionesBox(EquiparButton equiparButton){
        InventarioOpcionesBox box = new InventarioOpcionesBox(stage, equiparButton);
        return box.getVisual();
    }

}
