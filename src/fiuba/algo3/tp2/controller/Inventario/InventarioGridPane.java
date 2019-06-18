package fiuba.algo3.tp2.controller.Inventario;

import fiuba.algo3.tp2.controller.Crafter.MesaButton;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.construccionDeHerramientas.Mesa;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class InventarioGridPane {

    public Mesa mesa;
    public GridPane mesaGrid;

    public Inventario inventario;
    public Jugador jugador;
    public String[] herramientas;
    public EquiparButton equiparButton;

    int n = 4;
    int size = 120;

    public InventarioGridPane(String[] herramientas, Jugador jugador, EquiparButton equiparButton){

        mesa = new Mesa();
        mesaGrid = new GridPane();
        inventario = jugador.getInventarioMateriales();
        this.jugador = jugador;
        this.herramientas = herramientas;
        this.equiparButton = equiparButton;

        mesaGrid.setPadding(new Insets(10, 10, 10, 10));
        mesaGrid.setHgap(10);
        mesaGrid.setVgap(10);

        setBotonesTablero();
    }

    private void setBotonesTablero(){

        int k=0;

        for(int i=0; k!=herramientas.length && i<n; i++){
            for(int j = 0; j<n && k!=herramientas.length; j++){
                mesaGrid.add(getBox(herramientas[k]) , j, i);
                k++;
            }
        }
    }

    private VBox getBox(String herramienta) {
        return (new InventarioBox(jugador, herramienta, size, size, size, equiparButton)).getVisual();
    }


    public GridPane getVisual(){ return mesaGrid; }
}
