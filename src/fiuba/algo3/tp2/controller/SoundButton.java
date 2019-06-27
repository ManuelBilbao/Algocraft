package fiuba.algo3.tp2.controller;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.MediaPlayer;


public class SoundButton {

    Button boton;
    Boolean encendido;

    public SoundButton(double alto, double ancho, double size, String imagen){
        Image prendido = new Image("file:img/"+imagen+".png",size*3,size*3,false,false);
        this.boton = new Button();
        encendido = true;

        boton.setGraphic(new ImageView(prendido));
    }

    public Button getVisual(){
        return boton;
    }

    public void apagar(double size, String imagen, Object object){
        Image apagado = new Image("file:img/"+imagen+".png",size*3,size*3,false,false);
        encendido = false;
        boton.setGraphic(new ImageView(apagado));
//        mediaPlayer.stop();
    }

    public void prender(double size, String imagen, Object object){
        Image prendido = new Image("file:img/"+imagen+".png",size*3,size*3,false,false);
        boton.setGraphic(new ImageView(prendido));
        encendido = true;
//        mediaPlayer.play();
    }

    public Boolean prendido(){
        return encendido;
    }
}
