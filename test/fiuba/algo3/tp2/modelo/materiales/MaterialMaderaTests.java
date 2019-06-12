package fiuba.algo3.tp2.modelo.materiales;


import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;
import fiuba.algo3.tp2.modelo.materiales.bloques.Material;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaterialMaderaTests {
    @Test
    public void test01seCreaMaderaConDurabilidad10() {
        Material madera = new Madera();
        assertEquals(madera.getDurabilidad(), 10);
    }

    @Test
    public void test02seGolpeaConHachaDeMaderaYSeReduceSuDurabilidad(){
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hacha = jugador.construirHachaDeMadera();
        Madera bloqueMadera = new Madera();

        assertEquals(bloqueMadera.getDurabilidad(), 10);

        hacha.golpearMadera(bloqueMadera);

        assertEquals(bloqueMadera.getDurabilidad(), 8);
    }
}
