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

    @Test
    public void test02PicoDeMaderaGolpeaBloqueDeMadera() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDeMadera();
        Material madera = new Madera();
        float durabilidad = pico.getDurabilidad();

        pico.golpearMadera(madera);
        assertEquals(durabilidad - pico.getFuerza(), pico.getDurabilidad());
        durabilidad -= pico.getFuerza();
        pico.golpearMadera(madera);
        assertEquals(durabilidad - pico.getFuerza(), pico.getDurabilidad());
    }

    @Test
    public void test03PicoDeMaderaGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDeMadera();
        Material piedra = new Piedra();
        float durabilidad = pico.getDurabilidad();

        pico.golpearMadera(piedra);
        assertEquals(durabilidad - pico.getFuerza(), pico.getDurabilidad());
        durabilidad -= pico.getFuerza();
        pico.golpearMadera(piedra);
        assertEquals(durabilidad - pico.getFuerza(), pico.getDurabilidad());
    }

    @Test
    public void test04PicoDeMaderaGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDeMadera();
        Material metal = new Metal();
        float durabilidad = pico.getDurabilidad();

        pico.golpearMadera(metal);
        assertEquals(durabilidad - pico.getFuerza(), pico.getDurabilidad());
        durabilidad -= pico.getFuerza();
        pico.golpearMadera(metal);
        assertEquals(durabilidad - pico.getFuerza(), pico.getDurabilidad());
    }

    @Test
    public void test05PicoDeMaderaGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        Herramienta pico = jugador.construirPicoDeMadera();
        Material diamante = new Diamante();
        float durabilidad = pico.getDurabilidad();

        pico.golpearMadera(diamante);
        assertEquals(durabilidad - pico.getFuerza(), pico.getDurabilidad());
        durabilidad -= pico.getFuerza();
        pico.golpearMadera(diamante);
        assertEquals(durabilidad - pico.getFuerza(), pico.getDurabilidad());
    }

}