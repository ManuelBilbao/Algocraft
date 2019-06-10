package fiuba.algo3.tp2.modelo.materiales;


import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.materiales.Material;
import fiuba.algo3.tp2.modelo.materiales.Metal;
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


        picoDeMadera.golpearMetal(metal);
        assertEquals(metal.getDurabilidad(), 50);

        picoDeMadera.golpearMetal(metal);
        assertEquals(metal.getDurabilidad(), 50);
    }
}