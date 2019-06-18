package fiuba.algo3.tp2.controller.Inventario;

import fiuba.algo3.tp2.controller.CloseButton;
import fiuba.algo3.tp2.vista.AlgocraftButton;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class InventarioOpcionesBox {

    int size = 50;

    HBox box;


    public InventarioOpcionesBox(Stage stage, EquiparButton equiparButton){

        box = new HBox();

        box.getChildren().add((equiparButton.getVisual()));
        box.getChildren().add((new CloseButton(size,size,size,stage)).getVisual());
    }


    public HBox getVisual(){
        box.setAlignment(Pos.CENTER);
        return box;
    }

}
