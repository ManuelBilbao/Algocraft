package fiuba.algo3.tp2.vista.Mesa;

import fiuba.algo3.tp2.modelo.materiales.bloques.Material;
import fiuba.algo3.tp2.vista.AlgocraftPlantilla.LabelTitle;
import fiuba.algo3.tp2.vista.MenuPrincipal.MaterialesDisponiblesMenu;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class MesaStage {
    BorderPane mesaStage;
    MesaSelector mesaSelector;


    public MesaStage(){

        mesaStage = new BorderPane();

        mesaSelector= new MesaSelector();
        mesaStage.setCenter(mesaSelector.getVisual());

        LabelTitle title = new LabelTitle("Crafter", 500, 50, 50);
        mesaStage.setTop(title.getVisual());

    }

    public BorderPane getVisual(){ return mesaStage;}

}
