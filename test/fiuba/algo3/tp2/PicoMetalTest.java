package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PicoMetalTest {



    @Test
    public void seCreaPicoDeMetalConDurabilidad400YFuerza12() {
        Herramienta pico = new PicoMetal();

        assertEquals(pico.getDurabilidad(), 400);
        assertEquals(pico.getFuerza(), 12);
    }


}