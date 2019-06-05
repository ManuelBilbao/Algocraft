package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class PicoMaderaTest {


    @Test
    public void seCreaPicoDeMaderaConDurabilidad100YFuerza2() {
        Herramienta pico = new PicoMadera();

        assertEquals(pico.getDurabilidad(), 100);
        assertEquals(pico.getFuerza(), 2);
    }

}