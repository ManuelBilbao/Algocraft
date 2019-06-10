package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.materiales.bloques.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HachaPiedraTests {


    @Test
    public void test01SeCreaHachaDePiedraConDurabilidad200YFuerza5() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDePiedra();

        assertEquals(hacha.getDurabilidad(), 200);
        assertEquals(hacha.getFuerza(), 5);
    }

    @Test
    public void test02HachaDePiedraGolpeaBloqueDeMadera() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDePiedra();
        Material madera = new Madera();


        hacha.golpearMadera(madera);
        assertEquals(195, hacha.getDurabilidad());
        hacha.golpearMadera(madera);
        assertEquals(190, hacha.getDurabilidad());
    }

    @Test
    public void test03HachaDePiedraGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDePiedra();
        Material piedra = new Piedra();

        hacha.golpearMadera(piedra);
        assertEquals(195, hacha.getDurabilidad());
        hacha.golpearMadera(piedra);
        assertEquals(190, hacha.getDurabilidad());
    }

    @Test
    public void test04HachaDePiedraGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDePiedra();
        Material metal = new Metal();

        hacha.golpearMadera(metal);
        assertEquals(195, hacha.getDurabilidad());
        hacha.golpearMadera(metal);
        assertEquals(190, hacha.getDurabilidad());
    }

    @Test
    public void test05HachaDePiedraGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDePiedra();
        Material diamante = new Diamante();

        hacha.golpearMadera(diamante);
        assertEquals(195, hacha.getDurabilidad());
        hacha.golpearMadera(diamante);
        assertEquals(190, hacha.getDurabilidad());
    }

}