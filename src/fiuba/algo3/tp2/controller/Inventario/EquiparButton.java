package fiuba.algo3.tp2.controller.Inventario;

import fiuba.algo3.tp2.controller.AlertStage;
import fiuba.algo3.tp2.controller.AlgocraftButton;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class EquiparButton {

    Button boton;
    String herramienta;
    String herramientaEquipada;
    InventarioHerramientaEquipadaBox herramientaEquipadaBox;

    public EquiparButton(int size){

        herramientaEquipada = "-";
        herramienta = "-";

        herramientaEquipadaBox = new InventarioHerramientaEquipadaBox(this,size);

        boton = (new AlgocraftButton("equipar",size/2, size/24, size/30)).getVisual();
        boton.setOnAction(e -> {
            this.herramientaEquipada = herramienta;
            herramientaEquipadaBox.actualizar();
            (new AlertStage()).display("Algocraft - Mensaje",herramienta + " equipada exitosamente." );

        });

    }

    public Button getVisual(){ return boton; }

    public HBox getVisualHerramientaEquipada(){ return herramientaEquipadaBox.getVisual(); }

    public void setHerramienta(String herramienta){ this.herramienta = herramienta;}

    public String getHerramientaEquipada(){ return herramientaEquipada;}




}
