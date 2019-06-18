package fiuba.algo3.tp2;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.mapa.CasilleroOcupadoException;
import fiuba.algo3.tp2.modelo.mapa.Mapa;
import fiuba.algo3.tp2.modelo.mapa.Posicion;

public class Juego {

    private Jugador jugador;
    private Mapa mapa;

    public Juego() {
        jugador = new Jugador();
        mapa = new Mapa(jugador);
    }

    private void moverJugador(Posicion posicionActual, Posicion posicionNueva) {
        try {
            mapa.ocuparCasillero(posicionNueva, this.jugador);
            mapa.liberarCasillero(posicionActual);
            mapa.setPosicionJugador(posicionNueva);
        } catch (CasilleroOcupadoException e) {
            System.out.println("Casillero ocupado!");
        }
    }

    public void moverJugadorArriba() {
        Posicion posicionJugador = mapa.getPosicionJugador();
        Posicion posicionNueva = posicionJugador.posicionSuperior();
        moverJugador(posicionJugador, posicionNueva);
    }

    public void moverJugadorAbajo() {
        Posicion posicionJugador = mapa.getPosicionJugador();
        Posicion posicionNueva = posicionJugador.posicionInferior();
        moverJugador(posicionJugador, posicionNueva);
    }

    public void moverJugadorIzquieda() {
        Posicion posicionJugador = mapa.getPosicionJugador();
        Posicion posicionNueva = posicionJugador.posicionIzquierda();
        moverJugador(posicionJugador, posicionNueva);
    }

    public void moverJugadorDerecha() {
        Posicion posicionJugador = mapa.getPosicionJugador();
        Posicion posicionNueva = posicionJugador.posicionDerecha();
        moverJugador(posicionJugador, posicionNueva);
    }

    public Mapa getMapa() {
        return mapa;
    }

}
