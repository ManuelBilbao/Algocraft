package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.materiales.*;
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
        float durabilidad = hacha.getDurabilidad();

        hacha.golpearMadera(madera);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
        durabilidad -= hacha.getFuerza();
        hacha.golpearMadera(madera);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
    }

    @Test
    public void test03HachaDePiedraGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDePiedra();
        Material piedra = new Piedra();
        float durabilidad = hacha.getDurabilidad();

        hacha.golpearMadera(piedra);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
        durabilidad -= hacha.getFuerza();
        hacha.golpearMadera(piedra);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
    }

    @Test
    public void test04HachaDePiedraGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDePiedra();
        Material metal = new Metal();
        float durabilidad = hacha.getDurabilidad();

        hacha.golpearMadera(metal);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
        durabilidad -= hacha.getFuerza();
        hacha.golpearMadera(metal);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
    }

    @Test
    public void test05HachaDePiedraGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDePiedra();
        Material diamante = new Diamante();
        float durabilidad = hacha.getDurabilidad();

        hacha.golpearMadera(diamante);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
        durabilidad -= hacha.getFuerza();
        hacha.golpearMadera(diamante);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
    }

}