package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.materiales.bloques.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HachaMetalTests {

    @Test
    public void test01SeCreaHachaDeMetalConDurabilidad400YFuerza10() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hacha = jugador.construirHachaDeMetal();

        assertEquals(hacha.getDurabilidad(), 400);
        assertEquals(hacha.getFuerza(), 10);
    }

    @Test
    public void test02HachaDeMetalGolpeaBloqueDeMadera() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hacha = jugador.construirHachaDeMetal();
        Material madera = new Madera();

        hacha.golpearMadera(madera);
        assertEquals(395, hacha.getDurabilidad());
    }

    @Test
    public void test03HachaDeMetalGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hacha = jugador.construirHachaDeMetal();
        Material piedra = new Piedra();

        hacha.golpearMadera(piedra);
        assertEquals(395, hacha.getDurabilidad());
        hacha.golpearMadera(piedra);
        assertEquals(390, hacha.getDurabilidad());
    }

    @Test
    public void test04HachaDeMetalGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hacha = jugador.construirHachaDeMetal();
        Material metal = new Metal();

        hacha.golpearMadera(metal);
        assertEquals(395, hacha.getDurabilidad());
        hacha.golpearMadera(metal);
        assertEquals(390, hacha.getDurabilidad());
    }

    @Test
    public void test05HachaDeMetalGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hacha = jugador.construirHachaDeMetal();
        Material diamante = new Diamante();

        hacha.golpearMadera(diamante);
        assertEquals(395, hacha.getDurabilidad());
        hacha.golpearMadera(diamante);
        assertEquals(390, hacha.getDurabilidad());
    }

}