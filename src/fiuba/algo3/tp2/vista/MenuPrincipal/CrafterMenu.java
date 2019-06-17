package fiuba.algo3.tp2.vista.MenuPrincipal;

import fiuba.algo3.tp2.vista.Mesa.MesaStage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class CrafterMenu {

    private Button botonCrafter;
    private MesaStage mesaStage;

    public CrafterMenu(){ setCrafterStage(); }

    public Button getVisual(){ return botonCrafter;}

    private void setCrafterStage(){

        Stage window = new Stage();

        mesaStage = new MesaStage();
        BorderPane layout = mesaStage.getVisual();

        Scene scene = new Scene(layout);

        window.setScene(scene);

        botonCrafter = new Button("Crafter");
        botonCrafter.setOnAction(e -> { window.showAndWait(); });
    }
}
