package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HachaMetalTests {

    @Test
    public void seCreaHachaDeMetalConDurabilidad400YFuerza10() {
        Herramienta hacha = new HachaMetal();

        assertEquals(hacha.getDurabilidad(), 400);
        assertEquals(hacha.getFuerza(), 10);
    }


}