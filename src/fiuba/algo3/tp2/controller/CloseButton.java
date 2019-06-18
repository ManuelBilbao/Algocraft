package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.vista.AlgocraftButton;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CloseButton {

    Button boton;

    public CloseButton(int ancho, int altura, int size, Stage stage){
        boton = (new AlgocraftButton("cerrar",size, size, size)).getVisual();
        boton.setOnAction(e -> { stage.close(); });
    }

    public Button getVisual(){
        return boton;
    }
}
