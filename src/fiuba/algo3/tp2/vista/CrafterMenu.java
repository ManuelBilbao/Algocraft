package fiuba.algo3.tp2.vista;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CrafterMenu {

    private Button botonCrafter;
    private Stage crafterStage;

    public CrafterMenu(){ setCrafterStage(); }

    public Button getVisual(){ return botonCrafter;}

    private void setCrafterStage(){

        crafterStage = new Stage();
        crafterStage.setTitle("Algocraft - Crafter");
        botonCrafter = new Button("Crafter");
        botonCrafter.setOnAction(e -> { crafterStage.show(); });
    }
}
