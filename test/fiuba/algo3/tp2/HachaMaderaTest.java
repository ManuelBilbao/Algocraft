package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HachaMaderaTest {

    @Test
    public void seCreaHachaDeMaderaConDurabilidad100YFuerza2() {
        Herramienta hacha = new HachaMadera();

        assertEquals(hacha.getDurabilidad(), 100);
        assertEquals(hacha.getFuerza(), 2);
    }


}