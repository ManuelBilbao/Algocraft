package fiuba.algo3.tp2.controller.Crafter;

import fiuba.algo3.tp2.controller.CloseButton;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.construccionDeHerramientas.Mesa;
import fiuba.algo3.tp2.vista.AlgocraftButton;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class OpcionesHBox {

    public int size = 600;

    public HBox opciones;

    public Button crearHerramienta;
    public Button limpiar;
    public Button cerrar;

    public Mesa mesa;

    public OpcionesHBox(Stage stage, Jugador jugador, MesaGridPane mesaGridPane){

        mesa = jugador.getMesaDeConstruccion();

        opciones = new HBox();

        crearHerramienta = (new AlgocraftButton("crear herramienta",size/3,size/8,size/10)).getVisual();

        limpiar = (new AlgocraftButton("limpiar",size/4,size/16,size/24)).getVisual();
        limpiar.setOnAction(e -> {
            mesaGridPane.limpiar();
            mesa.limpiar();
        });

        cerrar = (new CloseButton(size/4,size/16,size/24, stage)).getVisual();

    }

    public HBox getVisual(){
        opciones.getChildren().addAll(crearHerramienta,limpiar,cerrar);
        return opciones;
    }
}
