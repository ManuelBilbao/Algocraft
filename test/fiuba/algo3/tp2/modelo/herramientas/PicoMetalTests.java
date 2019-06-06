package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.materiales.*;
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
        float durabilidad = pico.getDurabilidad();

        pico.golpearMadera(madera);
        assertEquals(durabilidad, pico.getDurabilidad());
        pico.golpearMadera(madera);
        assertEquals(durabilidad, pico.getDurabilidad());
        for (int i = 3; i <= 9; i++) {
            pico.golpearMadera(madera);
        }
        assertEquals(durabilidad, pico.getDurabilidad());
        pico.golpearMadera(madera);
        assertEquals(0, pico.getDurabilidad());
    }

    @Test
    public void test03PicoDeMetalGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDeMetal();
        Material piedra = new Piedra();
        float durabilidad = pico.getDurabilidad();

        pico.golpearPiedra(piedra);
        assertEquals(durabilidad, pico.getDurabilidad());
        pico.golpearPiedra(piedra);
        assertEquals(durabilidad, pico.getDurabilidad());
        for (int i = 3; i <= 9; i++) {
            pico.golpearPiedra(piedra);
        }
        assertEquals(durabilidad, pico.getDurabilidad());
        pico.golpearPiedra(piedra);
        assertEquals(0, pico.getDurabilidad());
    }

    @Test
    public void test04PicoDeMetalGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDeMetal();
        Material metal = new Metal();
        float durabilidad = pico.getDurabilidad();

        pico.golpearMetal(metal);
        assertEquals(durabilidad, pico.getDurabilidad());
        pico.golpearMetal(metal);
        assertEquals(durabilidad, pico.getDurabilidad());
        for (int i = 3; i <= 9; i++) {
            pico.golpearMetal(metal);
        }
        assertEquals(durabilidad, pico.getDurabilidad());
        pico.golpearMetal(metal);
        assertEquals(0, pico.getDurabilidad());
    }

    @Test
    public void test05PicoDeMetalGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDeMetal();
        Material diamante = new Diamante();
        float durabilidad = pico.getDurabilidad();

        pico.golpearDiamante(diamante);
        assertEquals(durabilidad, pico.getDurabilidad());
        pico.golpearDiamante(diamante);
        assertEquals(durabilidad, pico.getDurabilidad());
        for (int i = 3; i <= 9; i++) {
            pico.golpearDiamante(diamante);
        }
        assertEquals(durabilidad, pico.getDurabilidad());
        pico.golpearDiamante(diamante);
        assertEquals(0, pico.getDurabilidad());
    }

}