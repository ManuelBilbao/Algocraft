package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PicoPiedraTests {

    @Test
    public void test01SeCreaPicoDePiedraConDurabilidad200YFuerza4() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDePiedra();

        assertEquals(pico.getDurabilidad(), 200);
        assertEquals(pico.getFuerza(), 4);
    }

}