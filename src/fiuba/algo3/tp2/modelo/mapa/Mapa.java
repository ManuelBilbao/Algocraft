package fiuba.algo3.tp2.modelo.mapa;


import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.materiales.bloques.Diamante;
import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;
import fiuba.algo3.tp2.modelo.materiales.bloques.Metal;
import fiuba.algo3.tp2.modelo.materiales.bloques.Piedra;

import java.util.HashMap;

public class Mapa {

    private HashMap<Posicion, Casillero> casilleros = new HashMap<>();
    private Posicion posicionJugador;

    public Mapa(){
        for (int fila = 0; fila <= 30; fila++) {
            for(int col = 0; col<=30; col++){
                casilleros.put(new Posicion(fila, col), new Casillero());
            }
        }
    }

    public Mapa(Jugador jugador) {
        for (int fila = 0; fila <= 30; fila++) {
            for(int col = 0; col<=30; col++){
                casilleros.put(new Posicion(fila, col), new Casillero());
            }
        }

        this.posicionJugador = new Posicion(15, 15);
        ocuparCasillero(new Posicion(15, 15), jugador);
        InicializarMateriales inicializador = new InicializarMateriales();
        inicializador.inicializacionMateriales(casilleros);
    }

    public Casillero getCasillero(Integer fila, Integer columna){
        return casilleros.get(new Posicion(fila, columna));
    }

    public Casillero getCasillero(Posicion posicion) {
        return casilleros.get(posicion);
    }

    public Posicion getPosicionJugador() {
        return posicionJugador;
    }


    public void setPosicionJugador(Posicion posicionNueva) {
        this.posicionJugador = posicionNueva;
    }

    public void liberarCasillero(Posicion posicion) {
        casilleros.get(posicion).liberar();
    }

    public void ocuparCasillero(Posicion posicion, Object elemento) {
        casilleros.get(posicion).setContenido(elemento);
    }

}
