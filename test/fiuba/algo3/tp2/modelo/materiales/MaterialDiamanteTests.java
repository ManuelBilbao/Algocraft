package fiuba.algo3.tp2.modelo.materiales;


import fiuba.algo3.tp2.modelo.materiales.bloques.Diamante;
import fiuba.algo3.tp2.modelo.materiales.bloques.Material;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaterialDiamanteTests {
    @Test
    public void seCreaDiamanteConDurabilidad100() {
        Material diamante = new Diamante();
        assertEquals(diamante.getDurabilidad(), 100);
    }
}
