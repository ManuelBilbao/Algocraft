package fiuba.algo3.tp2;


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
        int fuerzaHacha = hacha.getFuerza();
        Madera bloqueMadera = new Madera();
        int durabilidadInicial = bloqueMadera.getDurabilidad();

        assertEquals(bloqueMadera.getDurabilidad(), 10);

        hacha.golpearMadera(bloqueMadera);

        assertEquals(bloqueMadera.getDurabilidad(), durabilidadInicial - fuerzaHacha);
    }
}
