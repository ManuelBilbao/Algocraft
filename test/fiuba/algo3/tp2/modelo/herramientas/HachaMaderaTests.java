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
        float durabilidad = hacha.getDurabilidad();

        hacha.golpearMadera(madera);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
        durabilidad -= hacha.getFuerza();
        hacha.golpearMadera(madera);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
    }

    @Test
    public void test03HachaDeMaderaGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMadera();
        Material piedra = new Piedra();
        float durabilidad = hacha.getDurabilidad();

        hacha.golpearMadera(piedra);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
        durabilidad -= hacha.getFuerza();
        hacha.golpearMadera(piedra);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
    }

    @Test
    public void test04HachaDeMaderaGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMadera();
        Material metal = new Metal();
        float durabilidad = hacha.getDurabilidad();

        hacha.golpearMadera(metal);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
        durabilidad -= hacha.getFuerza();
        hacha.golpearMadera(metal);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
    }

    @Test
    public void test05HachaDeMaderaGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMadera();
        Material diamante = new Diamante();
        float durabilidad = hacha.getDurabilidad();

        hacha.golpearMadera(diamante);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
        durabilidad -= hacha.getFuerza();
        hacha.golpearMadera(diamante);
        assertEquals(durabilidad - hacha.getFuerza(), hacha.getDurabilidad());
    }

}