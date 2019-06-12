package fiuba.algo3.tp2.modelo;

import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.materiales.bloques.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneralTests {

    @Test
    public void test01HerramientasGolpeanMadera() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hachaMadera = jugador.construirHachaDeMadera();

        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hachaPiedra = jugador.construirHachaDePiedra();

        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hachaMetal = jugador.construirHachaDeMetal();

        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoMadera = jugador.construirPicoDeMadera();

        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoPiedra = jugador.construirPicoDePiedra();

        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoMetal = jugador.construirPicoDeMetal();

        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoFino = jugador.construirPicoFino();

        Material madera = new Madera();
        Material piedra = new Piedra();
        Material metal = new Metal();
        Material diamante = new Diamante();



        // Hachas desgastan madera y se desgastan
        hachaMadera.golpearMadera(madera);
        assertEquals(8, madera.getDurabilidad());
        assertEquals(98, hachaMadera.getDurabilidad());

        hachaPiedra.golpearMadera(madera);
        assertEquals(3, madera.getDurabilidad());
        assertEquals(195, hachaPiedra.getDurabilidad());

        madera = new Madera();
        hachaMetal.golpearMadera(madera);
        assertEquals(0, madera.getDurabilidad());
        assertEquals(395, hachaMetal.getDurabilidad());

        // Picos y pico fino no rompen la madera pero los picos se desgastan
        madera = new Madera();

        picoMadera.golpearMadera(madera);
        assertEquals(10, madera.getDurabilidad());
        assertEquals(98, picoMadera.getDurabilidad());

        picoPiedra.golpearMadera(madera);
        assertEquals(10, madera.getDurabilidad());
//        assertEquals(durabilidadPicoPiedra - picoPiedra.getFuerza() / 1.5, picoPiedra.getDurabilidad());

        picoMetal.golpearMadera(madera);
        assertEquals(10, madera.getDurabilidad());
        assertEquals(400, picoMetal.getDurabilidad()); // Se desgasta al decimo golpe

        picoFino.golpearMadera(madera);
        assertEquals(10, madera.getDurabilidad());
        assertEquals(1000, picoFino.getDurabilidad());
    }

    @Test
    public void test02HerramientasGolpeanPiedra() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hachaMadera = jugador.construirHachaDeMadera();

        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hachaPiedra = jugador.construirHachaDePiedra();

        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hachaMetal = jugador.construirHachaDeMetal();

        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoMadera = jugador.construirPicoDeMadera();

        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoPiedra = jugador.construirPicoDePiedra();

        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoMetal = jugador.construirPicoDeMetal();

        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoFino = jugador.construirPicoFino();

        Material piedra = new Piedra();

        // Picos desgastan piedra y se desgastan
        picoMadera.golpearPiedra(piedra);
        assertEquals(28, piedra.getDurabilidad());
        assertEquals(98, picoMadera.getDurabilidad());

        picoPiedra.golpearPiedra(piedra);
        assertEquals(24, piedra.getDurabilidad());
//        assertEquals(durabilidadPicoPiedra - picoPiedra.getFuerza() / 1.5, picoPiedra.getDurabilidad());

        picoMetal.golpearPiedra(piedra);
        assertEquals(12, piedra.getDurabilidad());
        assertEquals(400, picoMetal.getDurabilidad());

        // Hachas y pico fino no desgastan piedra pero a ellos si
        hachaMadera.golpearPiedra(piedra);
        assertEquals(12, piedra.getDurabilidad());
        assertEquals(98, hachaMadera.getDurabilidad());

        hachaPiedra.golpearPiedra(piedra);
        assertEquals(12, piedra.getDurabilidad());
        assertEquals(195, hachaPiedra.getDurabilidad());

        hachaMetal.golpearPiedra(piedra);
        assertEquals(12, piedra.getDurabilidad());
        assertEquals(395, hachaMetal.getDurabilidad());

        picoFino.golpearPiedra(piedra);
        assertEquals(12, piedra.getDurabilidad());
        assertEquals(1000, picoFino.getDurabilidad());
    }

    @Test
    public void test03HerramientasGolpeanMetal() {
        Jugador jugador = new Jugador();

        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hachaMadera = jugador.construirHachaDeMadera();

        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hachaPiedra = jugador.construirHachaDePiedra();

        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hachaMetal = jugador.construirHachaDeMetal();

        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoMadera = jugador.construirPicoDeMadera();

        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoPiedra = jugador.construirPicoDePiedra();

        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoMetal = jugador.construirPicoDeMetal();

        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoFino = jugador.construirPicoFino();

        Material metal = new Metal();
        float durabilidadPicoPiedra = picoPiedra.getDurabilidad();

        // Pico de piedra golpea metal y ambos se desgastan
        picoPiedra.golpearMetal(metal);
        assertEquals(46, metal.getDurabilidad());
        assertEquals(durabilidadPicoPiedra - picoPiedra.getFuerza() / 1.5, picoPiedra.getDurabilidad(), 0.00001);

        // Las demas herramientas se desgastan pero no al metal (salvo el picofino que no se desgasta)
        hachaMadera.golpearMetal(metal);
        assertEquals(46, metal.getDurabilidad());
        assertEquals(98, hachaMadera.getDurabilidad());

        hachaPiedra.golpearMetal(metal);
        assertEquals(46, metal.getDurabilidad());
        assertEquals(195, hachaPiedra.getDurabilidad());

        hachaMetal.golpearMetal(metal);
        assertEquals(46, metal.getDurabilidad());
        assertEquals(395, hachaMetal.getDurabilidad());

        picoMadera.golpearMetal(metal);
        assertEquals(46, metal.getDurabilidad());
        assertEquals(98, picoMadera.getDurabilidad());

        picoMetal.golpearMetal(metal);
        assertEquals(46, metal.getDurabilidad());
        assertEquals(400, picoMetal.getDurabilidad());

        picoFino.golpearMetal(metal);
        assertEquals(46, metal.getDurabilidad());
        assertEquals(1000, picoFino.getDurabilidad());
    }

    @Test
    public void test04HerramientasGolpeanDiamante() {
        Jugador jugador = new Jugador();

        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hachaMadera = jugador.construirHachaDeMadera();

        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hachaPiedra = jugador.construirHachaDePiedra();

        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hachaMetal = jugador.construirHachaDeMetal();

        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoMadera = jugador.construirPicoDeMadera();

        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoPiedra = jugador.construirPicoDePiedra();

        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoMetal = jugador.construirPicoDeMetal();

        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,2);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta picoFino = jugador.construirPicoFino();

        Material diamante = new Diamante();

        float durabilidadPicoPiedra = picoPiedra.getDurabilidad();

        // Pico fino golpea diamante y ambos se desgastan
        picoFino.golpearDiamante(diamante);
        assertEquals(80, diamante.getDurabilidad());
        assertEquals(900, picoFino.getDurabilidad());

        // Demas herramientas golpean diamante sin desgastarlo pero ellas si
        hachaMadera.golpearDiamante(diamante);
        assertEquals(80, diamante.getDurabilidad());
        assertEquals(98, hachaMadera.getDurabilidad());

        hachaPiedra.golpearDiamante(diamante);
        assertEquals(80, diamante.getDurabilidad());
        assertEquals(195, hachaPiedra.getDurabilidad());

        hachaMetal.golpearDiamante(diamante);
        assertEquals(80, diamante.getDurabilidad());
        assertEquals(395, hachaMetal.getDurabilidad());

        picoMadera.golpearDiamante(diamante);
        assertEquals(80, diamante.getDurabilidad());
        assertEquals(98, picoMadera.getDurabilidad());

        picoPiedra.golpearDiamante(diamante);
        assertEquals(80, diamante.getDurabilidad());
        assertEquals(durabilidadPicoPiedra - picoPiedra.getFuerza() / 1.5, picoPiedra.getDurabilidad(), 0.00001);

        picoMetal.golpearDiamante(diamante);
        assertEquals(80, diamante.getDurabilidad());
        assertEquals(400, picoMetal.getDurabilidad());
    }

}
