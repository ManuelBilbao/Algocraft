package fiuba.algo3.tp2.controller.Crafter;

import fiuba.algo3.tp2.controller.AlertStage;
import fiuba.algo3.tp2.modelo.construccionDeHerramientas.Mesa;
import fiuba.algo3.tp2.modelo.inventario.ElementoNoEstaEnElInventarioException;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import fiuba.algo3.tp2.modelo.mapa.CasilleroOcupadoException;
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
    String material="None";
    String materialAnterior="None";

    public MesaButton(Mesa mesa, Inventario inventario, int fila, int columna, int size, CrafterStage crafter){

        this.fila = fila;
        this.col = columna;
        this.size = size;
        this.inventario = inventario;

        boton = new Button();

        Image imagenInicial = new Image("slotVacio.png", size, size, false, false);
        boton.setGraphic(new ImageView(imagenInicial));

        boton.setOnAction(e -> {

            material = crafter.getUltimoMaterialSeleccionado();

            if(!material.equals("None")) {

                try{
                    if(inventario.cantidadDe(material)>0) {

                        Image imagen = new Image(material + ".png", size, size, false, false);
                        boton.setGraphic(new ImageView(imagen));

                        inventario.sacar(material, inventario.getElemento(material));
                        mesa.posicionar(material, fila, columna);
                    }
                }catch (CasilleroOcupadoException e1){
                    mesa.getCasillero(fila,columna).liberar();
                    mesa.posicionar(material, fila, columna);
                    inventario.agregar(materialAnterior, inventario.getElemento(materialAnterior));
                }
                crafter.updateCantidadMateriales();

            }

            materialAnterior = material;

        });
    }


    public Button getButton() { return boton; }

}
