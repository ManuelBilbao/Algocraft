package fiuba.algo3.tp2.modelo.materiales;


import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.materiales.Madera;
import fiuba.algo3.tp2.modelo.materiales.Material;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaterialMaderaTests {
    @Test
    public void Test01seCreaMaderaConDurabilidad10() {
        Material madera = new Madera();
        assertEquals(madera.getDurabilidad(), 10);
    }

    @Test
    public void Test02seGolpeaConHachaDeMaderaYSeReduceSuDurabilidad(){
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMadera();
        Madera bloqueMadera = new Madera();

        assertEquals(bloqueMadera.getDurabilidad(), 10);

        hacha.golpearMadera(bloqueMadera);

        assertEquals(bloqueMadera.getDurabilidad(), 8);
    }
}
