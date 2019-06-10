package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.materiales.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HachaMaderaTests {

    @Test
    public void test01SeCreaHachaDeMaderaConDurabilidad100YFuerza2() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMadera();

        assertEquals(100, hacha.getDurabilidad());
        assertEquals(2, hacha.getFuerza());
    }

    @Test
    public void test02HachaDeMaderaGolpeaBloqueDeMadera() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMadera();
        Material madera = new Madera();

        hacha.golpearMadera(madera);
        assertEquals(98, hacha.getDurabilidad());
        hacha.golpearMadera(madera);
        assertEquals(96, hacha.getDurabilidad());
    }

    @Test
    public void test03HachaDeMaderaGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMadera();
        Material piedra = new Piedra();

        hacha.golpearMadera(piedra);
        assertEquals(98, hacha.getDurabilidad());
        hacha.golpearMadera(piedra);
        assertEquals(96, hacha.getDurabilidad());
    }

    @Test
    public void test04HachaDeMaderaGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMadera();
        Material metal = new Metal();


        hacha.golpearMadera(metal);
        assertEquals(98, hacha.getDurabilidad());
        hacha.golpearMadera(metal);
        assertEquals(96, hacha.getDurabilidad());
    }

    @Test
    public void test05HachaDeMaderaGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMadera();
        Material diamante = new Diamante();


        hacha.golpearMadera(diamante);
        assertEquals(98, hacha.getDurabilidad());
        hacha.golpearMadera(diamante);
        assertEquals(96, hacha.getDurabilidad());
    }

}