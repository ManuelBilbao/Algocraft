package fiuba.algo3.tp2.controller.Crafter;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.construccionDeHerramientas.Mesa;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

public class MesaGridPane {

    public Mesa mesa;
    public GridPane mesaGrid;
    public List<MesaButton> botones = new ArrayList<>();

    public Inventario inventario;
    public CrafterStage crafter;

    int n = 3;
    int size;

    public MesaGridPane(Jugador jugador,CrafterStage crafter, int size){

        this.size = size;
        this.crafter = crafter;

        mesa = new Mesa();
        mesaGrid = new GridPane();
        inventario = jugador.getInventarioMateriales();

        setBotonesTablero();
    }

    private void setBotonesTablero(){

        int k=0;
        for(int i=0 ; i<n; i++){
            for(int j = 0; j<n; j++){
                MesaButton boton = new MesaButton(mesa, inventario, i,j ,size/n, crafter);
                botones.add(k, boton); k++;
                mesaGrid.add(boton.getButton() , i, j);
            }
        }
    }

    public void limpiar(){
        for(int k=0;k<botones.size();k++){ botones.get(k).limpiar(); }
        crafter.setUltimoMaterialSeleccionado("None");
        crafter.updateCantidadMateriales();
        mesa.limpiar();
    }



    public GridPane getVisual(){ return mesaGrid; }
}
