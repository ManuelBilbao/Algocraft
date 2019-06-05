package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PicoMaderaTests {


    @Test
    public void test01SeCreaPicoDeMaderaConDurabilidad100YFuerza2() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDeMadera();

        assertEquals(pico.getDurabilidad(), 100);
        assertEquals(pico.getFuerza(), 2);
    }

}