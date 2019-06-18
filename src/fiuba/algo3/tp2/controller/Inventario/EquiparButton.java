package fiuba.algo3.tp2.controller.Inventario;

import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.vista.AlgocraftButton;
import javafx.scene.control.Button;

public class EquiparButton {

    Button boton;
    String herramienta;
    String herramientaEquipada;

    public EquiparButton(int size){

        herramientaEquipada = "hachaDeMadera";
        herramienta = "hachaDeMadera";
        boton = (new AlgocraftButton("equipar",size, size, size)).getVisual();
        boton.setOnAction(e -> { this.herramientaEquipada = herramienta;});

    }

    public Button getVisual(){ return boton;}

    public void setHerramienta(String herramienta){ this.herramienta = herramienta;}

    public String getHerramientaEquipada(){ return herramientaEquipada;}




}
