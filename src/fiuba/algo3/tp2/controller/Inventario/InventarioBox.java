package fiuba.algo3.tp2.controller.Inventario;

import fiuba.algo3.tp2.controller.AlertStage;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.controller.AlgocraftTittle;
import fiuba.algo3.tp2.modelo.inventario.ElementoNoEstaEnElInventarioException;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class InventarioBox {

    Button boton;
    Label nombreLabel;
    Label cantidadLabel;
    int cantDeHerramienta = 0;
    Jugador jugador;
    int size;
    String herramienta;

    public InventarioBox(Jugador jugador,String herramienta, int fila, int columna, int size, EquiparButton equiparButton){

        this.jugador = jugador;
        this.size = size;
        this.herramienta = herramienta;

        try{ cantDeHerramienta = jugador.getInventarioHerramientas().cantidadDe(herramienta);
        }catch (ElementoNoEstaEnElInventarioException el){}

        boton = new Button();
        nombreLabel = (new AlgocraftTittle(herramienta,size*1.2,size/5,size/10)).getVisual();
        cantidadLabel = (new AlgocraftTittle("CANTIDAD: "+ cantDeHerramienta,size*1.2,size/5,size/10)).getVisual();

        Image imagenInicial = new Image("file:img/"+herramienta+".png", size, size, false, false);
        boton.setGraphic(new ImageView(imagenInicial));

        boton.setOnAction(e -> {
            if(cantDeHerramienta>0){
                equiparButton.setHerramienta(herramienta);
            } else {
                (new AlertStage()).display("Algocraft - Mensaje", "No posee " + herramienta + ".");
            }
        });

}


    public VBox getVisual() {
        VBox box = new VBox();
        box.getChildren().addAll(nombreLabel,boton,cantidadLabel);
        box.setAlignment(Pos.CENTER);
        return box;
    }

}
