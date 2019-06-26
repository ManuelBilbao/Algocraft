package fiuba.algo3.tp2.controller;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class SoundButton {

    Button boton;

    public SoundButton(double alto, double ancho, double size){

        this.boton = new Button();

        Image prendido = new Image("file:img/speaker.png",size*3,size*3,false,false);
        boton.setGraphic(new ImageView(prendido));
    }

    public Button getVisual(){
        return boton;
    }
}
