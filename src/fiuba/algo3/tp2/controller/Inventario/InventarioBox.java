package fiuba.algo3.tp2.controller.Inventario;

import fiuba.algo3.tp2.controller.AlertStage;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.construccionDeHerramientas.Mesa;
import fiuba.algo3.tp2.modelo.inventario.ElementoNoEstaEnElInventarioException;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import fiuba.algo3.tp2.vista.AlgocraftTittle;
import javafx.geometry.Pos;
import javafx.scene.SnapshotResult;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.time.format.SignStyle;

public class InventarioBox {

    Button boton;
    Label label;
    Boolean disponible = true;


    public InventarioBox(Jugador jugador,String herramienta, int fila, int columna, int size, EquiparButton equiparButton){

        boton = new Button();
        label = (new AlgocraftTittle(herramienta,size*1.2,size/5,size/10)).getVisual();

        Image imagenInicial = new Image(herramienta+".png", size, size, false, false);
        boton.setGraphic(new ImageView(imagenInicial));

        boton.setOnAction(e -> { equiparButton.setHerramienta(herramienta); });

}


    public VBox getVisual() {
        VBox box = new VBox();
        box.getChildren().addAll(label,boton);
        box.setAlignment(Pos.CENTER);
        return box;
    }

}
