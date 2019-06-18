package fiuba.algo3.tp2.controller.Inventario;

import fiuba.algo3.tp2.vista.AlgocraftButton;
import fiuba.algo3.tp2.vista.AlgocraftTittle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class InventarioHerramientaEquipadaBox {

    Label title;
    Label herramienta;
    EquiparButton equiparButton;

    public InventarioHerramientaEquipadaBox(EquiparButton equiparButton, int size){

        this.equiparButton = equiparButton;

        title = (new AlgocraftTittle("Herramienta equipada: ",size/2,size/24,size/32)).getVisual();
        herramienta = (new AlgocraftTittle(equiparButton.getHerramientaEquipada(),size/2,size/24,size/32)).getVisual();
        herramienta.setTextFill(Color.web("#85F9F4"));
        title.setTextFill(Color.web("#85F9F4"));
    }

    public void actualizar(){ herramienta.setText(equiparButton.getHerramientaEquipada()); }

    public HBox getVisual(){
        HBox box = new HBox(title,herramienta);
        box.setAlignment(Pos.CENTER);
        return box;
    }
}
