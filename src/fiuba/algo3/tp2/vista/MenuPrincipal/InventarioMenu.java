package fiuba.algo3.tp2.vista.MenuPrincipal;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InventarioMenu {

    private Button botonInventario;
    private Stage inventarioStage;

    public InventarioMenu(){ setInventarioModule(); }

    public Button getVisual(){ return botonInventario;}

    private void setInventarioModule(){
        inventarioStage = new Stage();
        inventarioStage.setTitle("Algocraft - Inventario");
        botonInventario = new Button("Inventario");
        botonInventario.setOnAction(e -> { inventarioStage.show(); });
    }

}