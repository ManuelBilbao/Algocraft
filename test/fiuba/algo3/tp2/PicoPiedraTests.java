package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PicoPiedraTests {

    @Test
    public void seCreaPicoDePiedraConDurabilidad200YFuerza4() {
        Herramienta pico = new PicoPiedra();

        assertEquals(pico.getDurabilidad(), 200);
        assertEquals(pico.getFuerza(), 4);
    }

}