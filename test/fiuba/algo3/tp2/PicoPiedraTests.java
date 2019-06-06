package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PicoPiedraTests {

    @Test
    public void test01SeCreaPicoDePiedraConDurabilidad200YFuerza4() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDePiedra();

        assertEquals(pico.getDurabilidad(), 200);
        assertEquals(pico.getFuerza(), 4);
    }
/*
    @Test
    public void test02PicoDePiedraGolpeaBloqueDeMadera() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDePiedra();
        Material madera = new Madera();
        float durabilidad = pico.getDurabilidad();

        pico.golpearMadera(madera);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad());
        durabilidad -= (pico.getFuerza() / 1.5);
        pico.golpearMadera(madera);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad());
    }

    @Test
    public void test03PicoDePiedraGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDePiedra();
        Material piedra = new Piedra();
        float durabilidad = pico.getDurabilidad();

        pico.golpearMadera(piedra);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad());
        durabilidad -= (pico.getFuerza() / 1.5);
        pico.golpearMadera(piedra);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad());
    }

    @Test
    public void test04PicoDePiedraGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDePiedra();
        Material metal = new Metal();
        float durabilidad = pico.getDurabilidad();

        pico.golpearMadera(metal);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad());
        durabilidad -= (pico.getFuerza() / 1.5);
        pico.golpearMadera(metal);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad());
    }

    @Test
    public void test05PicoDePiedraGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDePiedra();
        Material diamante = new Diamante();
        float durabilidad = pico.getDurabilidad();

        pico.golpearMadera(diamante);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad());
        durabilidad -= (pico.getFuerza() / 1.5);
        pico.golpearMadera(diamante);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad());
    }*/

}