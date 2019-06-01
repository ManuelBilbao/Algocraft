package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void seCreaHachaDeMaderaConDurabilidad100YFuerza2() {
        Herramienta hacha = new Hacha();

        assertEquals(hacha.getDurabilidad(), 100);
        assertEquals(hacha.getFuerza(), 2);
    }

    @Test
    public void seCreaPicoDeMaderaConDurabilidad100YFuerza2() {
        Herramienta pico = new Pico();

        assertEquals(pico.getDurabilidad(), 100);
        assertEquals(pico.getFuerza(), 2);
    }
}