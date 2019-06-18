package fiuba.algo3.tp2.controller.Crafter;

import fiuba.algo3.tp2.controller.AlertStage;
import fiuba.algo3.tp2.modelo.construccionDeHerramientas.Mesa;
import fiuba.algo3.tp2.modelo.inventario.ElementoNoEstaEnElInventarioException;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MesaButton {
    Button boton;
    int fila;
    int col;
    int  size;
    Inventario inventario;
    Mesa mesa;
    String material;
    Object object;
    String[] materiales= {"slotVacio", "madera", "piedra", "metal", "diamante"};
    int i = 1;

    public MesaButton(Mesa mesa, Inventario inventario, int fila, int columna, int size){

        this.fila = fila;
        this.col = columna;
        this.size = size;
        this.inventario = inventario;

        boton = new Button();

        Image imagenInicial = new Image("slotVacio.png", size, size, false, false);
        boton.setGraphic(new ImageView(imagenInicial));

        boton.setOnAction(e -> {

            material = materiales[i%5];

            try {
                inventario.cantidadDe(material);
            } catch (ElementoNoEstaEnElInventarioException e1) {
                if(!material.equals("slotVacio")) {
                    AlertStage alertStage = new AlertStage();
                    alertStage.display("Algocraft - mensaje", "No posee " + material + " en inventario.");
                    material = "slotVacio";
                }
            }

            i++;

            Image imagen = new Image(material + ".png", size, size, false, false);
            boton.setGraphic(new ImageView(imagen));

        });
    }

    public void limpiar(){

        mesa.limpiar();

    }


    public Button getButton() { return boton; }

}
