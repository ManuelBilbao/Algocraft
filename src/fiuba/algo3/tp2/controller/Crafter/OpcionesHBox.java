package fiuba.algo3.tp2.controller.Crafter;

import fiuba.algo3.tp2.controller.CloseButton;
import fiuba.algo3.tp2.modelo.Constructor;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.construccionDeHerramientas.ImposibleConstruirHerramientaException;
import fiuba.algo3.tp2.modelo.construccionDeHerramientas.Mesa;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.vista.AlgocraftButton;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.HashMap;

public class OpcionesHBox {

    public int size = 600;

    public HBox opciones;

    public Button crearHerramienta;
    public Button limpiar;
    public Button cerrar;

    public Mesa mesa;
    public Jugador jugador;
    public  MesaGridPane mesaGridPane;
    Stage stage;

    public OpcionesHBox(Stage stage, Jugador jugador, MesaGridPane mesaGridPane) {

        this.mesaGridPane = mesaGridPane;
        this.stage = stage;
        mesa = jugador.getMesaDeConstruccion();
        this.jugador=jugador;
        opciones = new HBox();

        setLimpiarButton();
        setCerrarButton();
        setconstruirHerramientaButton();
    }

    private void setLimpiarButton(){
        limpiar = (new AlgocraftButton("limpiar", size / 4, size / 16, size / 32)).getVisual();
        limpiar.setOnAction(e -> {
            mesaGridPane.limpiar();
            mesa.limpiar();
        });
    }

    private   void setCerrarButton(){
        cerrar = (new CloseButton(size / 4, size / 16, size / 32, stage)).getVisual();
    }

    private void setconstruirHerramientaButton() {

        crearHerramienta = (new AlgocraftButton("crear herramienta", size / 2, size / 16, size / 32)).getVisual();
        crearHerramienta.setOnAction(e -> {
            construirHerramienta();
        });
    }

    private void construirHerramienta(){

        Constructor constructor = new Constructor();
        Herramienta herramienta = null;

        String[] herramientas = {"hachaDeMadera", "hachaDeMetal", "hachaDePiedra","picoDeMadera", "picoDeMetal", "picoDePiedra", "picoFino"};
        HashMap <String,Herramienta> esEstructuraValida;
        int n = herramientas.length;

        esEstructuraValida = new HashMap<>();

        /*
                    VER
         */
        /*

        esEstructuraValida.put(herramientas[0], jugador.construirHachaDeMadera());
        esEstructuraValida.put(herramientas[1], jugador.construirHachaDePiedra());
        esEstructuraValida.put(herramientas[2], jugador.construirHachaDeMetal());
        esEstructuraValida.put(herramientas[3], jugador.construirPicoDeMadera());
        esEstructuraValida.put(herramientas[4], jugador.construirPicoDePiedra());
        esEstructuraValida.put(herramientas[5], jugador.construirPicoDeMetal());
        esEstructuraValida.put(herramientas[6], jugador.construirPicoFino());


         */
        boolean seCrea = false;
        for(int i =0; i<n; i++){
            Herramienta resultadoConstruccion = esEstructuraValida.get(herramientas[i]);
            if(resultadoConstruccion != null){
                jugador.getInventarioHerramientas().agregar(herramientas[i], resultadoConstruccion);
                seCrea = true;
                mesaGridPane.limpiarLuegoDeCrearHerramienta();
                /*crafter.updateCantidadMateriales();
                crear AlgocraftAlertBox*/
            }
        }

        if  (!seCrea){
            /* Falta crear AlgocraftAlertBox*/
        }
    }

    public HBox getVisual() {
        opciones.getChildren().addAll(crearHerramienta, limpiar, cerrar);
        opciones.setAlignment(Pos.CENTER);
        return opciones;
    }

}
