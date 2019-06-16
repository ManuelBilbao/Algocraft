package fiuba.algo3.tp2;

import fiuba.algo3.tp2.modelo.Juego;
import fiuba.algo3.tp2.modelo.mapa.Mapa;
import fiuba.algo3.tp2.modelo.mapa.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JuegoTests {

    @Test
    public void test01JuegoSeInicializaConJugadorEnElCentro() {
        Juego juego = new Juego();
        Mapa mapa = juego.getMapa();
        Posicion posicionJugador = mapa.getPosicionJugador();

        assertEquals(15, posicionJugador.getFila());
        assertEquals(15, posicionJugador.getColumna());
    }

    @Test
    public void test02JugadorSeMueveHaciaArriba() {
        Juego juego = new Juego();
        Mapa mapa = juego.getMapa();

        juego.moverJugadorArriba();
        assertEquals(14, mapa.getPosicionJugador().getFila());
        assertEquals(15, mapa.getPosicionJugador().getColumna());

        juego.moverJugadorArriba();
        assertEquals(13, mapa.getPosicionJugador().getFila());
        assertEquals(15, mapa.getPosicionJugador().getColumna());
    }

    @Test
    public void test03JugadorSeMueveHaciaAbajo() {
        Juego juego = new Juego();
        Mapa mapa = juego.getMapa();

        juego.moverJugadorAbajo();
        assertEquals(16, mapa.getPosicionJugador().getFila());
        assertEquals(15, mapa.getPosicionJugador().getColumna());
        juego.moverJugadorAbajo();
        assertEquals(17, mapa.getPosicionJugador().getFila());
        assertEquals(15, mapa.getPosicionJugador().getColumna());
    }

    @Test
    public void test04JugadorSeMueveHaciaLaIzquierda() {
        Juego juego = new Juego();
        Mapa mapa = juego.getMapa();

        juego.moverJugadorIzquieda();
        assertEquals(15, mapa.getPosicionJugador().getFila());
        assertEquals(14, mapa.getPosicionJugador().getColumna());
        juego.moverJugadorIzquieda();
        assertEquals(15, mapa.getPosicionJugador().getFila());
        assertEquals(13, mapa.getPosicionJugador().getColumna());
    }

    @Test
    public void test05JugadorSeMueveHaciaLaDerecha() {
        Juego juego = new Juego();
        Mapa mapa = juego.getMapa();

        juego.moverJugadorDerecha();
        assertEquals(15, mapa.getPosicionJugador().getFila());
        assertEquals(16, mapa.getPosicionJugador().getColumna());
        juego.moverJugadorDerecha();
        assertEquals(15, mapa.getPosicionJugador().getFila());
        assertEquals(17, mapa.getPosicionJugador().getColumna());
    }

    @Test
    public void test06JugadorSeMueve2Arriba3Izquierda1Abajo2Derecha() {
        Juego juego = new Juego();
        Mapa mapa = juego.getMapa();

        juego.moverJugadorArriba();
        juego.moverJugadorArriba();
        juego.moverJugadorIzquieda();
        juego.moverJugadorIzquieda();
        juego.moverJugadorIzquieda();
        juego.moverJugadorAbajo();
        juego.moverJugadorDerecha();
        juego.moverJugadorDerecha();

        assertEquals(14, mapa.getPosicionJugador().getFila());
        assertEquals(14, mapa.getPosicionJugador().getColumna());
    }

}
