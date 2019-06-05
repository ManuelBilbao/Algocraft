package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HachaMetalTest {

    @Test
    public void seCreaHachaDeMetalConDurabilidad400YFuerza10() {
        Herramienta hacha = new HachaMetal();

        assertEquals(hacha.getDurabilidad(), 400);
        assertEquals(hacha.getFuerza(), 10);
    }


}