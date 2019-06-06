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
        float durabilidad = pico.getDurabilidad();

        pico.golpearMadera(madera);
        assertEquals(durabilidad, pico.getDurabilidad());
        pico.golpearMadera(madera);
        assertEquals(durabilidad, pico.getDurabilidad());
        for (int i = 0; i < 10; i++) {
            pico.golpearMadera(madera);
        }
        assertEquals(durabilidad, pico.getDurabilidad());
    }

    @Test
    public void test03PicoFinoGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoFino();
        Material piedra = new Piedra();
        float durabilidad = pico.getDurabilidad();

        pico.golpearPiedra(piedra);
        assertEquals(durabilidad, pico.getDurabilidad());
        pico.golpearPiedra(piedra);
        assertEquals(durabilidad, pico.getDurabilidad());
        for (int i = 0; i < 10; i++) {
            pico.golpearPiedra(piedra);
        }
        assertEquals(durabilidad, pico.getDurabilidad());
    }

    @Test
    public void test04PicoFinoGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoFino();
        Material metal = new Metal();
        float durabilidad = pico.getDurabilidad();

        pico.golpearMetal(metal);
        assertEquals(durabilidad, pico.getDurabilidad());
        pico.golpearMetal(metal);
        assertEquals(durabilidad, pico.getDurabilidad());
        for (int i = 0; i < 10; i++) {
            pico.golpearMetal(metal);
        }
        assertEquals(durabilidad, pico.getDurabilidad());
    }

    @Test
    public void test05PicoFinoGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoFino();
        Material diamante = new Diamante();
        float durabilidad = pico.getDurabilidad();

        pico.golpearDiamante(diamante);
        assertEquals(durabilidad - durabilidad * 0.1, pico.getDurabilidad());
        durabilidad -= durabilidad * 0.1;
        pico.golpearDiamante(diamante);
        assertEquals(durabilidad - durabilidad * 0.1, pico.getDurabilidad());
    }

}
