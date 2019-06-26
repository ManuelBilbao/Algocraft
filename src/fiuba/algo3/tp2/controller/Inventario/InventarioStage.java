package fiuba.algo3.tp2.controller.Inventario;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.controller.AlgocraftTittle;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.inventario.ElementoNoEstaEnElInventarioException;
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
    int size = 600;

    Jugador jugador;
    String[] herramientas = {"hachaDeMadera", "hachaDeMetal", "hachaDePiedra","picoDeMadera", "picoDeMetal", "picoDePiedra", "picoFino"};

    EquiparButton equiparButton;

    public InventarioStage(Jugador jugador){

        this.jugador = jugador;

        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Algocraft - Inventario");

        BorderPane layout = new BorderPane();

        equiparButton = new EquiparButton(size);

        layout.setTop(getTitle());
        layout.setCenter(getInventarioGridPane(equiparButton));
        layout.setBottom(getInventaroOpcionesBox(equiparButton));


        Scene scene = new Scene(layout);
        stage.setScene(scene);

        stage.setOnShown(e->{layout.setCenter(getInventarioGridPane(equiparButton)); });
    }

    public Stage getStage(){ return stage;}

    public Herramienta getHerramientaEquipada(){
        Herramienta h = null;
        try{
            h = (Herramienta) jugador.getInventarioHerramientas().getElemento(equiparButton.getHerramientaEquipada());
        } catch (NullPointerException e){
            return null;
        }

        return h;
    }


    private HBox getTitle(){
        AlgocraftTittle algocraftTittle = new AlgocraftTittle("Inventario",size,size/10,size/15);
        HBox title = new HBox(algocraftTittle.getVisual());
        title.setAlignment(Pos.CENTER);
        return title;
    }

    private GridPane getInventarioGridPane(EquiparButton equiparButton){
        InventarioGridPane inventario = new InventarioGridPane(herramientas,jugador,equiparButton);
        return inventario.getVisual();
    }

    private VBox getInventaroOpcionesBox(EquiparButton equiparButton){
        InventarioOpcionesBox box = new InventarioOpcionesBox(stage, equiparButton,size);
        return box.getVisual();
    }

}
