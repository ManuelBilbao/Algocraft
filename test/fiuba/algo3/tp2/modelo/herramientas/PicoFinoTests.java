package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.materiales.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PicoFinoTests {

    @Test
    public void test01SeCreaPicoFinoConDurabilidad1000YFuerza20() {
        Jugador jugador = new Jugador();
        Herramienta picoFino = jugador.construirPicoFino();

        assertEquals(picoFino.getDurabilidad(), 1000);
        assertEquals(picoFino.getFuerza(), 20);
    }

    @Test
    public void test02PicoFinoGolpeaBloqueDeMadera() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoFino();
        Material madera = new Madera();

        pico.golpearMadera(madera);
        assertEquals(1000, pico.getDurabilidad());
        pico.golpearMadera(madera);
        assertEquals(1000, pico.getDurabilidad());
        for (int i = 0; i < 10; i++) {
            pico.golpearMadera(madera);
        }
        assertEquals(1000, pico.getDurabilidad());
    }

    @Test
    public void test03PicoFinoGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoFino();
        Material piedra = new Piedra();

        pico.golpearPiedra(piedra);
        assertEquals(1000, pico.getDurabilidad());
        pico.golpearPiedra(piedra);
        assertEquals(1000, pico.getDurabilidad());
        for (int i = 0; i < 10; i++) {
            pico.golpearPiedra(piedra);
        }
        assertEquals(1000, pico.getDurabilidad());
    }

    @Test
    public void test04PicoFinoGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoFino();
        Material metal = new Metal();

        pico.golpearMetal(metal);
        assertEquals(1000, pico.getDurabilidad());
        pico.golpearMetal(metal);
        assertEquals(1000, pico.getDurabilidad());
        for (int i = 0; i < 10; i++) {
            pico.golpearMetal(metal);
        }
        assertEquals(1000, pico.getDurabilidad());
    }

    @Test
    public void test05PicoFinoGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoFino();
        Material diamante = new Diamante();

        pico.golpearDiamante(diamante);
        assertEquals(900, pico.getDurabilidad());
        pico.golpearDiamante(diamante);
        assertEquals(810, pico.getDurabilidad());
    }

}
