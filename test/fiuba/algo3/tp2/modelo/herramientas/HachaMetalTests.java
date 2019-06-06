package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.materiales.*;
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

    @Test
    public void test02HachaDeMetalGolpeaBloqueDeMadera() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMetal();
        Material madera = new Madera();
        float durabilidad = hacha.getDurabilidad();

        hacha.golpearMadera(madera);
        assertEquals(durabilidad - (hacha.getFuerza() / 2), hacha.getDurabilidad());
    }

    @Test
    public void test03HachaDeMetalGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMetal();
        Material piedra = new Piedra();
        float durabilidad = hacha.getDurabilidad();

        hacha.golpearMadera(piedra);
        assertEquals(durabilidad - (hacha.getFuerza() / 2), hacha.getDurabilidad());
        durabilidad -= (hacha.getFuerza() / 2);
        hacha.golpearMadera(piedra);
        assertEquals(durabilidad - (hacha.getFuerza() / 2), hacha.getDurabilidad());
    }

    @Test
    public void test04HachaDeMetalGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMetal();
        Material metal = new Metal();
        float durabilidad = hacha.getDurabilidad();

        hacha.golpearMadera(metal);
        assertEquals(durabilidad - (hacha.getFuerza() / 2), hacha.getDurabilidad());
        durabilidad -= (hacha.getFuerza() / 2);
        hacha.golpearMadera(metal);
        assertEquals(durabilidad - (hacha.getFuerza() / 2), hacha.getDurabilidad());
    }

    @Test
    public void test05HachaDeMetalGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMetal();
        Material diamante = new Diamante();
        float durabilidad = hacha.getDurabilidad();

        hacha.golpearMadera(diamante);
        assertEquals(durabilidad - (hacha.getFuerza() / 2), hacha.getDurabilidad());
        durabilidad -= (hacha.getFuerza() / 2);
        hacha.golpearMadera(diamante);
        assertEquals(durabilidad - (hacha.getFuerza() / 2), hacha.getDurabilidad());
    }

}