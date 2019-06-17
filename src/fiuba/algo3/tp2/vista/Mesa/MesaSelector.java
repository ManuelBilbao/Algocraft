package fiuba.algo3.tp2.vista.Mesa;

import fiuba.algo3.tp2.modelo.construccionDeHerramientas.Mesa;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import fiuba.algo3.tp2.vista.AlgocraftPlantilla.LabelTitle;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class MesaSelector {

    Mesa mesa;
    GridPane mesaGrid;

    Inventario inventario;

    int n = 3;

    public MesaSelector(){

        /* BORRAR DESPUES, USADO PARA PRUEBA */
        inventario = new Inventario();
        inventario.agregar("slotVacio", new Button());
        inventario.agregar("madera", new Button());
        inventario.agregar("madera", new Button());
        inventario.agregar("piedra", new Button());
        inventario.agregar("diamante", new Button());
        inventario.agregar("metal", new Button());


        mesa = new Mesa();
        mesaGrid = new GridPane();

        setBotonesTablero();
    }

    private void setBotonesTablero(){

        for(int i=0 ; i<n; i++){
            for(int j = 0; j<n; j++){
                ButtonMesa boton = new ButtonMesa(mesa, inventario, i,j ,150);
                mesaGrid.add(boton.getButton() , i, j);
            }
        }
    }



    public GridPane getVisual(){ return mesaGrid; }

}
