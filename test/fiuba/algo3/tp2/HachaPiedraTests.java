package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HachaPiedraTests {


    @Test
    public void seCreaHachaDePiedraConDurabilidad200YFuerza5() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDePiedra();

        assertEquals(hacha.getDurabilidad(), 200);
        assertEquals(hacha.getFuerza(), 5);
    }

}