package fiuba.algo3.tp2.controller.ObjetosDisponibles;

import fiuba.algo3.tp2.controller.Crafter.MesaButton;
import fiuba.algo3.tp2.controller.Crafter.MesaGridPane;
import fiuba.algo3.tp2.modelo.inventario.ElementoNoEstaEnElInventarioException;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;

import java.security.KeyStore;

public class ObjetosDisponiblesButton {

    Button boton;
    Label label;

    Inventario inventario;
    String objeto;


    public ObjetosDisponiblesButton(Inventario inventario, String objeto, double size){

        boton = new Button();
        label = new Label();

        this.inventario = inventario;
        this.objeto = objeto;

        Image imagen = new Image("file:img/"+objeto + ".png",size*0.8,size*0.8,false,false);
        boton.setGraphic(new ImageView(imagen));
        boton.prefHeight(size);
        boton.prefWidth(size);

        setCantidadDeObjetos();

        boton.setOnAction(e -> { setCantidadDeObjetos(); });

        label.setPrefSize(size,size/4);
    }

    public void setCantidadDeObjetos(){

        try{
            label.setText(objeto+ ": " + Integer.toString(inventario.cantidadDe(objeto)));
        }catch (ElementoNoEstaEnElInventarioException e){
            label.setText(objeto+": 0");
        }
        label.setAlignment(Pos.BASELINE_CENTER);
    }

    public VBox getVisual(){
        VBox vBox = new VBox(boton,label);
        return vBox;
    }
}
