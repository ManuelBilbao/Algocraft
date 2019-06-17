package fiuba.algo3.tp2.vista.Mesa;

import fiuba.algo3.tp2.modelo.construccionDeHerramientas.Mesa;
import fiuba.algo3.tp2.modelo.inventario.ElementoNoEstaEnElInventarioException;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import fiuba.algo3.tp2.vista.AlgocraftPlantilla.AlertStage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ButtonMesa {

    Button boton;
    int fila;
    int col;
    Object object;
    String[] materiales= {"slotVacio", "madera", "piedra", "metal", "diamante"};
    int i = 1;

    public ButtonMesa(Mesa mesa, Inventario inventario,int fila, int columna, int tamanio){

        this.fila = fila;
        this.col = columna;

        boton = new Button();

        Image imagenInicial = new Image("slotVacio.png", tamanio, tamanio, false, false);
        boton.setGraphic(new ImageView(imagenInicial));

        boton.setOnAction(e -> {

            String material = materiales[i%5];

            if(material!="slotVacio") {

                try {
                    inventario.cantidadDe(material);
                } catch (ElementoNoEstaEnElInventarioException e1) {
                    AlertStage alertStage = new AlertStage();
                    alertStage.display("Algocraft - mensaje", "No posee " + material + " en inventario.");
                    material = "slotVacio";
                }
            }
            Image imagen = new Image(material + ".png", tamanio, tamanio, false, false);
            boton.setGraphic(new ImageView(imagen));
            i++;

        });
    }

    public Button getButton() { return boton; }

}
