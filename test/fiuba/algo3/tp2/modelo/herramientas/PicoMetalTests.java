package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.materiales.bloques.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PicoMetalTests {



    @Test
    public void test01SeCreaPicoDeMetalConDurabilidad400YFuerza12() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDeMetal();

        assertEquals(pico.getDurabilidad(), 400);
        assertEquals(pico.getFuerza(), 12);
    }

    @Test
    public void test02PicoDeMetalGolpeaBloqueDeMadera() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDeMetal();
        Material madera = new Madera();

        pico.golpearMadera(madera);
        assertEquals(400, pico.getDurabilidad());
        pico.golpearMadera(madera);
        assertEquals(400, pico.getDurabilidad());
        for (int i = 3; i <= 9; i++) {
            pico.golpearMadera(madera);
        }
        assertEquals(400, pico.getDurabilidad());
        pico.golpearMadera(madera);
        assertEquals(0, pico.getDurabilidad());
    }

    @Test
    public void test03PicoDeMetalGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDeMetal();
        Material piedra = new Piedra();

        pico.golpearPiedra(piedra);
        assertEquals(400, pico.getDurabilidad());
        pico.golpearPiedra(piedra);
        assertEquals(400, pico.getDurabilidad());
        pico.golpearPiedra(piedra);
        assertEquals(400, pico.getDurabilidad());
    }

    @Test
    public void test04PicoDeMetalGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDeMetal();
        Material metal = new Metal();

        pico.golpearMetal(metal);
        assertEquals(400, pico.getDurabilidad());
        pico.golpearMetal(metal);
        assertEquals(400, pico.getDurabilidad());
        for (int i = 3; i <= 9; i++) {
            pico.golpearMetal(metal);
        }
        assertEquals(400, pico.getDurabilidad());
        pico.golpearMetal(metal);
        assertEquals(0, pico.getDurabilidad());
    }

    @Test
    public void test05PicoDeMetalGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDeMetal();
        Material diamante = new Diamante();

        pico.golpearDiamante(diamante);
        assertEquals(400, pico.getDurabilidad());
        pico.golpearDiamante(diamante);
        assertEquals(400, pico.getDurabilidad());
        for (int i = 3; i <= 9; i++) {
            pico.golpearDiamante(diamante);
        }
        assertEquals(400, pico.getDurabilidad());
        pico.golpearDiamante(diamante);
        assertEquals(0, pico.getDurabilidad());
    }

}