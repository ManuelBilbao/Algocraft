package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HachaMetalTests {

    @Test
    public void test01SeCreaHachaDeMetalConDurabilidad400YFuerza10() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMetal();

        assertEquals(hacha.getDurabilidad(), 400);
        assertEquals(hacha.getFuerza(), 10);
    }


}