package fiuba.algo3.tp2.modelo.mapa;

import fiuba.algo3.tp2.modelo.materiales.bloques.Diamante;
import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;
import fiuba.algo3.tp2.modelo.materiales.bloques.Metal;
import fiuba.algo3.tp2.modelo.materiales.bloques.Piedra;

import java.util.HashMap;

public class InicializarMateriales {

    private final int DIMENSION_MAPA = 30;
    private final int CANTIDAD_MADERA = 150;
    private final int CANTIDAD_PIEDRA = 100;
    private final int CANTIDAD_METAL = 50;
    private final int CANTIDAD_DIAMANTE = 25;

    public void inicializacionMateriales(HashMap<Posicion, Casillero> casilleros) {
        inicializarDiamante(casilleros);
        inicializarMadera(casilleros);
        inicializarMetal(casilleros);
        inicializarPiedra(casilleros);
    }

    private void inicializarMadera(HashMap<Posicion, Casillero> casilleros){
        int fila;
        int columna;
        int tope = 0;
        while (tope < CANTIDAD_MADERA) {
            fila = (int) (Math.random() * DIMENSION_MAPA) + 1;
            columna = (int) (Math.random() * DIMENSION_MAPA) + 1;
            Posicion posicion = new Posicion(fila, columna);
            if(casilleros.get(posicion).getContenido() == null){
                casilleros.get(posicion).setContenido(new Madera());
                tope++;
            }

        }
    }

    private void inicializarPiedra(HashMap<Posicion, Casillero> casilleros){
        int fila;
        int columna;
        int tope = 0;
        while (tope < CANTIDAD_PIEDRA) {
            fila = (int) (Math.random() * DIMENSION_MAPA) + 1;
            columna = (int) (Math.random() * DIMENSION_MAPA) + 1;
            Posicion posicion = new Posicion(fila, columna);
            if(casilleros.get(posicion).getContenido() == null){
                casilleros.get(posicion).setContenido(new Piedra());
                tope++;
            }
        }
    }


    private void inicializarMetal(HashMap<Posicion, Casillero> casilleros){
        int fila;
        int columna;
        int tope = 0;
        while (tope < CANTIDAD_METAL) {
            fila = (int) (Math.random() * DIMENSION_MAPA) + 1;
            columna = (int) (Math.random() * DIMENSION_MAPA) + 1;
            Posicion posicion = new Posicion(fila, columna);
            if(casilleros.get(posicion).getContenido() == null){
                casilleros.get(posicion).setContenido(new Metal());
                tope++;
            }
        }
    }

    private void inicializarDiamante(HashMap<Posicion, Casillero> casilleros){
        int fila;
        int columna;
        int tope = 0;
        while (tope < CANTIDAD_DIAMANTE) {
            fila = (int) (Math.random() * DIMENSION_MAPA) + 1;
            columna = (int) (Math.random() * DIMENSION_MAPA) + 1;
            Posicion posicion = new Posicion(fila, columna);
            if(casilleros.get(posicion).getContenido() == null){
                casilleros.get(posicion).setContenido(new Diamante());
                tope++;
            }
        }
    }

}
