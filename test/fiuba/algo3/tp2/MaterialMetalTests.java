package fiuba.algo3.tp2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaterialMetalTests {
    @Test
    public void test01SeCreaMetalConDurabilidad50() {
        Material metal = new Metal();
        assertEquals(metal.getDurabilidad(), 50);
    }

    @Test
    public void test02SeGolpeaPiedraConHachaYNoSeReduceDurabilidad() {
        Jugador jugador = new Jugador();
        Herramienta picoDeMadera = jugador.construirPicoDeMadera();
        Material metal = new Metal();
        int durabilidadInicial = metal.getDurabilidad();


        picoDeMadera.golpearMetal(metal);
        assertEquals(metal.getDurabilidad(), durabilidadInicial);
    }
}