package fiuba.algo3.tp2.controller.Crafter;

import fiuba.algo3.tp2.controller.CloseButton;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.construccionDeHerramientas.Mesa;
import fiuba.algo3.tp2.vista.AlgocraftButton;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class OpcionesHBox {

    public int size = 50;

    public HBox opciones;

    public Button crearHerramienta;
    public Button limpiar;
    public Button cerrar;

    public Mesa mesa;

    public OpcionesHBox(Stage stage, Jugador jugador){

        mesa = jugador.getMesaDeConstruccion();

        opciones = new HBox();

        crearHerramienta = (new AlgocraftButton("crear herramienta",size,size,size/2)).getVisual();

        limpiar = (new AlgocraftButton("limpiar",size,size,size/2)).getVisual();
        limpiar.setOnAction(e -> { mesa.limpiar(); });

        cerrar = (new CloseButton(size,size,size/2, stage)).getVisual();

    }

    public HBox getVisual(){
        opciones.getChildren().addAll(crearHerramienta,limpiar,cerrar);
        return opciones;
    }
}
