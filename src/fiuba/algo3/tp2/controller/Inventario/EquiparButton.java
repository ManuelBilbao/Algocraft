package fiuba.algo3.tp2.controller.Inventario;

import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.vista.AlgocraftButton;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class EquiparButton {

    Button boton;
    String herramienta;
    String herramientaEquipada;
    InventarioHerramientaEquipadaBox herramientaEquipadaBox;

    public EquiparButton(int size){

        herramientaEquipada = "hachaDeMadera";
        herramienta = "hachaDeMadera";

        herramientaEquipadaBox = new InventarioHerramientaEquipadaBox(this,size);

        boton = (new AlgocraftButton("equipar",size/2, size/24, size/30)).getVisual();
        boton.setOnAction(e -> {
            this.herramientaEquipada = herramienta;
            herramientaEquipadaBox.actualizar();
        });

    }

    public Button getVisual(){ return boton; }

    public HBox getVisualHerramientaEquipada(){ return herramientaEquipadaBox.getVisual(); }

    public void setHerramienta(String herramienta){ this.herramienta = herramienta;}

    public String getHerramientaEquipada(){ return herramientaEquipada;}




}
