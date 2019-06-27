package fiuba.algo3.tp2.controller;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class SoundButton {

    Button boton;
    Boolean encendido;

    public SoundButton( double size, String imagen, Boolean encendido){
        Image prendido = new Image("file:img/"+imagen+".png",size*3,size*3,false,false);
        this.boton = new Button();
        this.encendido = encendido;

        boton.setGraphic(new ImageView(prendido));
    }

    public Button getVisual(){
        return boton;
    }

    public void apagar(double size, String imagen){
        Image apagado = new Image("file:img/"+imagen+".png",size*3,size*3,false,false);
        this.encendido = false;
        boton.setGraphic(new ImageView(apagado));
    }

    public void prender(double size, String imagen){
        Image prendido = new Image("file:img/"+imagen+".png",size*3,size*3,false,false);
        boton.setGraphic(new ImageView(prendido));
        this.encendido = true;
    }

    public Boolean prendido(){
        return encendido;
    }
}
