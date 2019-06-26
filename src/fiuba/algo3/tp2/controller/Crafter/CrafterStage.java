package fiuba.algo3.tp2.controller.Crafter;

import fiuba.algo3.tp2.modelo.Juego;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.construccionDeHerramientas.Mesa;
import fiuba.algo3.tp2.controller.AlgocraftTittle;
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
    int size = 600;
    Jugador jugador;
    MaterialesCrafter materialesCrafter;
    MesaGridPane mesaGridPane;
    String[] materiales = {"madera", "piedra", "metal", "diamante"};
    String materialUltimoSeleccionado = "None";
    Mesa mesa;


    public CrafterStage(Juego juego){

        this.jugador = juego.getJugador();
        mesa = jugador.getMesaDeConstruccion();

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
        materialesCrafter = new MaterialesCrafter(size/6,12,materiales,jugador.getInventarioMateriales(),this);
        return materialesCrafter.getVisual();

    }

    private HBox getTitle(){
        AlgocraftTittle algocraftTittle = new AlgocraftTittle("Crafter",size,size/10,size/15);
        HBox title = new HBox(algocraftTittle.getVisual());
        title.setAlignment(Pos.CENTER);
        return title;
    }

    private GridPane getMesa(Jugador jugador){
        mesaGridPane = new MesaGridPane(jugador,this,(size*3)/4);
        return mesaGridPane.getVisual();
    }

    public void updateCantidadMateriales(){ materialesCrafter.updateCantidadMateriales();}


    public void setUltimoMaterialSeleccionado(String material){ materialUltimoSeleccionado = material; }

    public String getUltimoMaterialSeleccionado(){ return materialUltimoSeleccionado;}

    private HBox getOpcionesHBox(){
        return (new MesaOpcionesHBox(stage, jugador, mesaGridPane)).getVisual();
    }
}
