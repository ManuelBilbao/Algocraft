package fiuba.algo3.tp2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaterialPiedraTests {
    @Test
    public void seCreaPiedraConDurabilidad100() {
        Material piedra = new Piedra();
        assertEquals(piedra.getDurabilidad(), 30);
    }
}
