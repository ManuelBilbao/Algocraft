package fiuba.algo3.tp2.controller.Crafter;

import fiuba.algo3.tp2.controller.ObjetosDisponibles.ObjetosDisponibles;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.construccionDeHerramientas.Mesa;
import fiuba.algo3.tp2.modelo.mapa.Mapa;
import fiuba.algo3.tp2.vista.AlgocraftTittle;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CrafterStage {

    Stage stage;
    int size = 800;
    Jugador jugador;
    String[] materiales = {"madera", "piedra", "metal", "diamante"};


    public CrafterStage(Jugador jugador){

        this.jugador = jugador;

        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Algocraft - Crafter");

        BorderPane layout = new BorderPane();

        layout.setLeft(getMaterialbar(jugador));
        layout.setTop(getTitle());
        layout.setCenter(getMesa(jugador));
        layout.setBottom(getOpcionesHBox());


        Scene scene = new Scene(layout);
        stage.setScene(scene);
    }

    public Stage getStage(){ return stage;}

    private VBox getMaterialbar(Jugador jugador){
        ObjetosDisponibles objetosDisponibles = new ObjetosDisponibles(size/8,materiales,jugador.getInventarioMateriales());
        return objetosDisponibles.getVisualVBox();

    }

    private HBox getTitle(){
        AlgocraftTittle algocraftTittle = new AlgocraftTittle("Crafter",size*0.76,size/10,size/15);
        HBox title = new HBox(algocraftTittle.getVisual());
        title.setAlignment(Pos.CENTER);
        return title;
    }

    private GridPane getMesa(Jugador jugador){
        MesaGridPane mesa = new MesaGridPane(jugador);
        return mesa.getVisual();
    }

    private HBox getOpcionesHBox(){
        return (new OpcionesHBox(stage, jugador)).getVisual();
    }
}
