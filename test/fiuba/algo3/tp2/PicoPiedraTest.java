package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PicoPiedraTest {

    @Test
    public void seCreaPicoDePiedraConDurabilidad200YFuerza4() {
        Herramienta pico = new PicoPiedra();

        assertEquals(pico.getDurabilidad(), 200);
        assertEquals(pico.getFuerza(), 4);
    }

}