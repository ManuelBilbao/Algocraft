package fiuba.algo3.tp2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaterialDiamanteTests {
    @Test
    public void seCreaDiamanteConDurabilidad100() {
        Material diamante = new Diamante();
        assertEquals(diamante.getDurabilidad(), 100);
    }
}
