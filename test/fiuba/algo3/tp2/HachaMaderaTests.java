package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HachaMaderaTests {

    @Test
    public void test01SeCreaHachaDeMaderaConDurabilidad100YFuerza2() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMadera();

        assertEquals(hacha.getDurabilidad(), 100);
        assertEquals(hacha.getFuerza(), 2);
    }


}