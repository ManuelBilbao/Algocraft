package fiuba.algo3.tp2;

import fiuba.algo3.tp2.modelo.Juego;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.desgastes.DesgasteLinealPorFuerza;
import fiuba.algo3.tp2.modelo.herramientas.Hacha;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.mapa.Mapa;
import fiuba.algo3.tp2.modelo.mapa.Posicion;
import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;
import fiuba.algo3.tp2.modelo.materiales.bloques.Material;
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


    @Test
    public void test07JugadorGolpeaHaciaLaDerecha() {
        Juego juego = new Juego();
        Mapa mapa = juego.getMapa();
        Material madera = new Madera();

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Madera material = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,material) ;
        mapa.ocuparCasillero(new Posicion(15,16),madera);

        juego.golpearDerecha(hacha);

        assertEquals(8, madera.getDurabilidad());
    }

    @Test
    public void test08JugadorGolpeaHaciaLaIzquierda() {
        Juego juego = new Juego();
        Mapa mapa = juego.getMapa();
        Material madera = new Madera();

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Madera material = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,material) ;
        mapa.ocuparCasillero(new Posicion(15,14),madera);

        juego.golpearIzquierda(hacha);

        assertEquals(8, madera.getDurabilidad());
    }

    @Test
    public void test09JugadorGolpeaHaciaArriba() {
        Juego juego = new Juego();
        Mapa mapa = juego.getMapa();
        Material madera = new Madera();

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Madera material = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,material) ;
        mapa.ocuparCasillero(new Posicion(14,15),madera);

        juego.golpearArriba(hacha);

        assertEquals(8, madera.getDurabilidad());
    }

    @Test
    public void test10JugadorGolpeaHaciaAbajo() {
        Juego juego = new Juego();
        Mapa mapa = juego.getMapa();
        Material madera = new Madera();

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Madera material = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,material) ;
        mapa.ocuparCasillero(new Posicion(16,15),madera);

        juego.golpearAbajo(hacha);

        assertEquals(8, madera.getDurabilidad());
    }





}
