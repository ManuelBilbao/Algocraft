package fiuba.algo3.tp2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaterialMaderaTests {
    @Test
    public void seCreaMaderaConDurabilidad10() {
        Material madera = new Madera();
        assertEquals(madera.getDurabilidad(), 10);
    }
}
