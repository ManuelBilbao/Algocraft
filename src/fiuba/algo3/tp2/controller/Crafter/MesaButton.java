package fiuba.algo3.tp2.controller.Crafter;

import fiuba.algo3.tp2.controller.AlertStage;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.construccionDeHerramientas.Mesa;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.inventario.ElementoNoEstaEnElInventarioException;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import fiuba.algo3.tp2.modelo.mapa.CasilleroOcupadoException;
import fiuba.algo3.tp2.modelo.materiales.bloques.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.HashMap;

public class MesaButton {

    Button boton;
    int fila;
    int col;
    int  size;
    Inventario inventario;
    String material="None";
    String materialAnterior="None";
    CrafterStage crafter;
    Mesa mesa;
    HashMap<String, Material> objetoMaterialMapa;

    public MesaButton(Jugador jugador, int fila, int columna, int size, CrafterStage crafter){

        this.fila = fila;
        this.col = columna;
        this.size = size;
        this.inventario = jugador.getInventarioMateriales();
        this.crafter = crafter;
        this.mesa = jugador.getMesaDeConstruccion();

        ponerElementos();

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
                        mesa.posicionar(objetoMaterialMapa.get(material), columna, fila);
                        materialAnterior=material;
                    } else {
                        materialAnterior = "None";
                    }
                }catch (CasilleroOcupadoException e1){
                    mesa.getCasillero(fila,columna).liberar();
                    mesa.posicionar(objetoMaterialMapa.get(material), columna, fila);
                    inventario.agregar(materialAnterior, inventario.getElemento(materialAnterior));
                    materialAnterior=material;
                }
                crafter.updateCantidadMateriales();

            }

        });
    }

    public void limpiar(){

        Image imagen = new Image( "slotVacio.png",size,size,false,false);
        boton.setGraphic(new ImageView(imagen));

        if(!materialAnterior.equals("None")){ inventario.agregar(materialAnterior, inventario.getElemento(material)); }

        material = "None";
        materialAnterior = "None";
    }

    public void limpiarLuegoDeCrearHerramienta(){

        Image imagen = new Image( "slotVacio.png",size,size,false,false);
        boton.setGraphic(new ImageView(imagen));
        material = "None";
        materialAnterior = "None";
    }

    private void ponerElementos() {
        objetoMaterialMapa = new HashMap<>();
        objetoMaterialMapa.put ("metal",new Metal());
        objetoMaterialMapa.put ("madera",new Madera());
        objetoMaterialMapa.put ("piedra",new Piedra());
        objetoMaterialMapa.put ("diamante",new Diamante());
    }

    public Button getButton() { return boton; }

}
