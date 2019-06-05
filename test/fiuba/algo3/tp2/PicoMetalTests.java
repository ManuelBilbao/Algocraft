package fiuba.algo3.tp2;

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


}