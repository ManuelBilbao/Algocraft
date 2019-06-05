package fiuba.algo3.tp2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaterialMetalTests {
    @Test
    public void seCreaMetalConDurabilidad50() {
        Material metal = new Metal();
        assertEquals(metal.getDurabilidad(), 50);
    }
}
