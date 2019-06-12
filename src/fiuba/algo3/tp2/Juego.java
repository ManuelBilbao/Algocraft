package fiuba.algo3.tp2;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.Mapa.Casillero;
import fiuba.algo3.tp2.modelo.Mapa.CasilleroOcupadoException;
import fiuba.algo3.tp2.modelo.Mapa.Mapa;
import fiuba.algo3.tp2.modelo.Mapa.Posicion;

public class Juego {

    private Jugador jugador;
    private Mapa mapa;

    public Juego() {
        jugador = new Jugador();
        mapa = new Mapa(jugador);
    }

    public void moverJugadorArriba() {
        Posicion posicionJugador = mapa.getPosicionJugador();
        Casillero casilleroActual = mapa.getCasillero(posicionJugador);
        posicionJugador.moverArriba();
        Casillero casilleroNuevo = mapa.getCasillero(posicionJugador);
        try {
            casilleroNuevo.ocupar(jugador);
            casilleroActual.liberar();
        } catch (CasilleroOcupadoException e) {
            return;
        }
    }

}
