package fiuba.algo3.tp2.controller.Inventario;

import fiuba.algo3.tp2.controller.CloseButton;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InventarioOpcionesBox {


    Button closeButtom;
    Button equiparButton;
    HBox herramientaEquipadaBox;



    public InventarioOpcionesBox(Stage stage, EquiparButton equiparButton, int size){

        this.equiparButton = equiparButton.getVisual();
        herramientaEquipadaBox = equiparButton.getVisualHerramientaEquipada();
        closeButtom =((new CloseButton(size/2,size/24,size/30,stage)).getVisual());
    }


    public VBox getVisual(){
        HBox hbox = new HBox(equiparButton,closeButtom);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        VBox vbox = new VBox(herramientaEquipadaBox, hbox);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(20);
        return vbox;
    }

}
