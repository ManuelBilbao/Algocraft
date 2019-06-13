package fiuba.algo3.tp2.modelo.mapa;

import fiuba.algo3.tp2.modelo.materiales.bloques.Diamante;
import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;
import fiuba.algo3.tp2.modelo.materiales.bloques.Metal;
import fiuba.algo3.tp2.modelo.materiales.bloques.Piedra;

import java.util.HashMap;

public class InicializarMateriales {


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
        while (tope < 200) {
            fila = (int) (Math.random() * 30) + 1;
            columna = (int) (Math.random() * 30) + 1;
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
        while (tope < 150) {
            fila = (int) (Math.random() * 30) + 1;
            columna = (int) (Math.random() * 30) + 1;
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
        while (tope < 100) {
            fila = (int) (Math.random() * 30) + 1;
            columna = (int) (Math.random() * 30) + 1;
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
        while (tope < 50) {
            fila = (int) (Math.random() * 30) + 1;
            columna = (int) (Math.random() * 30) + 1;
            Posicion posicion = new Posicion(fila, columna);
            if(casilleros.get(posicion).getContenido() == null){
                casilleros.get(posicion).setContenido(new Diamante());
                tope++;
            }
        }
    }

}
