package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HachaPiedraTest {


    @Test
    public void seCreaHachaDePiedraConDurabilidad200YFuerza5() {
        Herramienta hacha = new HachaPiedra();

        assertEquals(hacha.getDurabilidad(), 200);
        assertEquals(hacha.getFuerza(), 5);
    }

}