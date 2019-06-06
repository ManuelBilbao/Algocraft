package fiuba.algo3.tp2.modelo;

import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.materiales.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneralTests {

    @Test
    public void test01HerramientasGolpeanMadera() {
        Jugador jugador = new Jugador();
        Herramienta hachaMadera = jugador.construirHachaDeMadera();
        Herramienta hachaPiedra = jugador.construirHachaDePiedra();
        Herramienta hachaMetal = jugador.construirHachaDeMetal();
        Herramienta picoMadera = jugador.construirPicoDeMadera();
        Herramienta picoPiedra = jugador.construirPicoDePiedra();
        Herramienta picoMetal = jugador.construirPicoDeMetal();
        Herramienta picoFino = jugador.construirPicoFino();

        Material madera = new Madera();
        Material piedra = new Piedra();
        Material metal = new Metal();
        Material diamante = new Diamante();

        float durabilidadHachaMadera = hachaMadera.getDurabilidad();
        float durabilidadHachaPiedra = hachaPiedra.getDurabilidad();
        float durabilidadHachaMetal= hachaMetal.getDurabilidad();
        float durabilidadPicoMadera = picoMadera.getDurabilidad();
        float durabilidadPicoPiedra = picoPiedra.getDurabilidad();
        float durabilidadPicoMetal= picoMetal.getDurabilidad();
        float durabilidadPicoFino= picoFino.getDurabilidad();

        float durabilidadMadera = madera.getDurabilidad();
        float durabilidadPiedra = piedra.getDurabilidad();
        float durabilidadMetal = metal.getDurabilidad();
        float durabilidadDiamante = diamante.getDurabilidad();

        // Hachas desgastan madera y se desgastan
        hachaMadera.golpearMadera(madera);
        assertEquals(durabilidadMadera - hachaMadera.getFuerza(), madera.getDurabilidad());
        assertEquals(durabilidadHachaMadera - hachaMadera.getFuerza(), hachaMadera.getDurabilidad());

        durabilidadMadera = madera.getDurabilidad();
        hachaPiedra.golpearMadera(madera);
        assertEquals(durabilidadMadera - hachaPiedra.getFuerza(), madera.getDurabilidad());
        assertEquals(durabilidadHachaPiedra - hachaPiedra.getFuerza(), hachaPiedra.getDurabilidad());

        madera = new Madera();
        durabilidadMadera = madera.getDurabilidad();
        hachaMetal.golpearMadera(madera);
        assertEquals(durabilidadMadera - hachaMetal.getFuerza(), madera.getDurabilidad());
        assertEquals(durabilidadHachaMetal - hachaMetal.getFuerza() / 2, hachaMetal.getDurabilidad());

        // Picos y pico fino no rompen la madera pero los picos se desgastan
        madera = new Madera();
        durabilidadMadera = madera.getDurabilidad();

        picoMadera.golpearMadera(madera);
        assertEquals(durabilidadMadera, madera.getDurabilidad());
        assertEquals(durabilidadPicoMadera - picoMadera.getFuerza(), picoMadera.getDurabilidad());

        picoPiedra.golpearMadera(madera);
        assertEquals(durabilidadMadera, madera.getDurabilidad());
//        assertEquals(durabilidadPicoPiedra - picoPiedra.getFuerza() / 1.5, picoPiedra.getDurabilidad());

        picoMetal.golpearMadera(madera);
        assertEquals(durabilidadMadera, madera.getDurabilidad());
        assertEquals(durabilidadPicoMetal, picoMetal.getDurabilidad()); // Se desgasta al decimo golpe

        picoFino.golpearMadera(madera);
        assertEquals(durabilidadMadera, madera.getDurabilidad());
        assertEquals(durabilidadPicoFino, picoFino.getDurabilidad());
    }

    @Test
    public void test02HerramientasGolpeanPiedra() {
        Jugador jugador = new Jugador();
        Herramienta hachaMadera = jugador.construirHachaDeMadera();
        Herramienta hachaPiedra = jugador.construirHachaDePiedra();
        Herramienta hachaMetal = jugador.construirHachaDeMetal();
        Herramienta picoMadera = jugador.construirPicoDeMadera();
        Herramienta picoPiedra = jugador.construirPicoDePiedra();
        Herramienta picoMetal = jugador.construirPicoDeMetal();
        Herramienta picoFino = jugador.construirPicoFino();

        Material piedra = new Piedra();
        float durabilidadPiedra = piedra.getDurabilidad();

        float durabilidadHachaMadera = hachaMadera.getDurabilidad();
        float durabilidadHachaPiedra = hachaPiedra.getDurabilidad();
        float durabilidadHachaMetal= hachaMetal.getDurabilidad();
        float durabilidadPicoMadera = picoMadera.getDurabilidad();
        float durabilidadPicoPiedra = picoPiedra.getDurabilidad();
        float durabilidadPicoMetal= picoMetal.getDurabilidad();
        float durabilidadPicoFino= picoFino.getDurabilidad();

        // Picos desgastan piedra y se desgastan
        picoMadera.golpearPiedra(piedra);
        assertEquals(durabilidadPiedra - picoMadera.getFuerza(), piedra.getDurabilidad());
        assertEquals(durabilidadPicoMadera - picoMadera.getFuerza(), picoMadera.getDurabilidad());

        durabilidadPiedra = piedra.getDurabilidad();
        picoPiedra.golpearPiedra(piedra);
        assertEquals(durabilidadPiedra - picoPiedra.getFuerza(), piedra.getDurabilidad());
//        assertEquals(durabilidadPicoPiedra - picoPiedra.getFuerza() / 1.5, picoPiedra.getDurabilidad());

        durabilidadPiedra = piedra.getDurabilidad();
        picoMetal.golpearPiedra(piedra);
        assertEquals(durabilidadPiedra - picoMetal.getFuerza(), piedra.getDurabilidad());
        assertEquals(durabilidadPicoMetal, picoMetal.getDurabilidad());

        // Hachas y pico fino no desgastan piedra pero a ellos si
        durabilidadPiedra = piedra.getDurabilidad();
        hachaMadera.golpearPiedra(piedra);
        assertEquals(durabilidadPiedra, piedra.getDurabilidad());
        assertEquals(durabilidadHachaMadera - hachaMadera.getFuerza(), hachaMadera.getDurabilidad());

        hachaPiedra.golpearPiedra(piedra);
        assertEquals(durabilidadPiedra, piedra.getDurabilidad());
        assertEquals(durabilidadHachaPiedra - hachaPiedra.getFuerza(), hachaPiedra.getDurabilidad());

        hachaMetal.golpearPiedra(piedra);
        assertEquals(durabilidadPiedra, piedra.getDurabilidad());
        assertEquals(durabilidadHachaMetal - hachaMetal.getFuerza() / 2, hachaMetal.getDurabilidad());

        picoFino.golpearPiedra(piedra);
        assertEquals(durabilidadPiedra, piedra.getDurabilidad());
        assertEquals(durabilidadPicoFino, picoFino.getDurabilidad());
    }

    @Test
    public void test03HerramientasGolpeanMetal() {
        Jugador jugador = new Jugador();
        Herramienta hachaMadera = jugador.construirHachaDeMadera();
        Herramienta hachaPiedra = jugador.construirHachaDePiedra();
        Herramienta hachaMetal = jugador.construirHachaDeMetal();
        Herramienta picoMadera = jugador.construirPicoDeMadera();
        Herramienta picoPiedra = jugador.construirPicoDePiedra();
        Herramienta picoMetal = jugador.construirPicoDeMetal();
        Herramienta picoFino = jugador.construirPicoFino();

        Material metal = new Metal();
        float durabilidadMetal = metal.getDurabilidad();

        float durabilidadHachaMadera = hachaMadera.getDurabilidad();
        float durabilidadHachaPiedra = hachaPiedra.getDurabilidad();
        float durabilidadHachaMetal= hachaMetal.getDurabilidad();
        float durabilidadPicoMadera = picoMadera.getDurabilidad();
        float durabilidadPicoPiedra = picoPiedra.getDurabilidad();
        float durabilidadPicoMetal= picoMetal.getDurabilidad();
        float durabilidadPicoFino= picoFino.getDurabilidad();

        // Pico de piedra golpea metal y ambos se desgastan
        picoPiedra.golpearMetal(metal);
        assertEquals(durabilidadMetal - picoPiedra.getFuerza(), metal.getDurabilidad());
        assertEquals(durabilidadPicoPiedra - picoPiedra.getFuerza() / 1.5, picoPiedra.getDurabilidad(), 0.00001);

        // Las demas herramientas se desgastan pero no al metal (salvo el picofino que no se desgasta)
        durabilidadMetal = metal.getDurabilidad();
        hachaMadera.golpearMetal(metal);
        assertEquals(durabilidadMetal, metal.getDurabilidad());
        assertEquals(durabilidadHachaMadera - hachaMadera.getFuerza(), hachaMadera.getDurabilidad());

        hachaPiedra.golpearMetal(metal);
        assertEquals(durabilidadMetal, metal.getDurabilidad());
        assertEquals(durabilidadHachaPiedra - hachaPiedra.getFuerza(), hachaPiedra.getDurabilidad());

        hachaMetal.golpearMetal(metal);
        assertEquals(durabilidadMetal, metal.getDurabilidad());
        assertEquals(durabilidadHachaMetal - hachaMetal.getFuerza() / 2, hachaMetal.getDurabilidad());

        picoMadera.golpearMetal(metal);
        assertEquals(durabilidadMetal, metal.getDurabilidad());
        assertEquals(durabilidadPicoMadera - picoMadera.getFuerza(), picoMadera.getDurabilidad());

        picoMetal.golpearMetal(metal);
        assertEquals(durabilidadMetal, metal.getDurabilidad());
        assertEquals(durabilidadPicoMetal, picoMetal.getDurabilidad());

        picoFino.golpearMetal(metal);
        assertEquals(durabilidadMetal, metal.getDurabilidad());
        assertEquals(durabilidadPicoFino, durabilidadPicoFino);
    }

    @Test
    public void test04HerramientasGolpeanDiamante() {
        Jugador jugador = new Jugador();
        Herramienta hachaMadera = jugador.construirHachaDeMadera();
        Herramienta hachaPiedra = jugador.construirHachaDePiedra();
        Herramienta hachaMetal = jugador.construirHachaDeMetal();
        Herramienta picoMadera = jugador.construirPicoDeMadera();
        Herramienta picoPiedra = jugador.construirPicoDePiedra();
        Herramienta picoMetal = jugador.construirPicoDeMetal();
        Herramienta picoFino = jugador.construirPicoFino();

        Material diamante = new Diamante();
        float durabilidadDiamante = diamante.getDurabilidad();

        float durabilidadHachaMadera = hachaMadera.getDurabilidad();
        float durabilidadHachaPiedra = hachaPiedra.getDurabilidad();
        float durabilidadHachaMetal= hachaMetal.getDurabilidad();
        float durabilidadPicoMadera = picoMadera.getDurabilidad();
        float durabilidadPicoPiedra = picoPiedra.getDurabilidad();
        float durabilidadPicoMetal= picoMetal.getDurabilidad();
        float durabilidadPicoFino= picoFino.getDurabilidad();

        // Pico fino golpea diamante y ambos se desgastan
        picoFino.golpearDiamante(diamante);
        assertEquals(durabilidadDiamante - picoFino.getFuerza(), diamante.getDurabilidad());
        assertEquals(durabilidadPicoFino - durabilidadPicoFino * 0.1, picoFino.getDurabilidad());

        // Demas herramientas golpean diamante sin desgastarlo pero ellas si
        durabilidadDiamante = diamante.getDurabilidad();
        hachaMadera.golpearDiamante(diamante);
        assertEquals(durabilidadDiamante, diamante.getDurabilidad());
        assertEquals(durabilidadHachaMadera - hachaMadera.getFuerza(), hachaMadera.getDurabilidad());

        hachaPiedra.golpearDiamante(diamante);
        assertEquals(durabilidadDiamante, diamante.getDurabilidad());
        assertEquals(durabilidadHachaPiedra - hachaPiedra.getFuerza(), hachaPiedra.getDurabilidad());

        hachaMetal.golpearDiamante(diamante);
        assertEquals(durabilidadDiamante, diamante.getDurabilidad());
        assertEquals(durabilidadHachaMetal - hachaMetal.getFuerza() / 2, hachaMetal.getDurabilidad());

        picoMadera.golpearDiamante(diamante);
        assertEquals(durabilidadDiamante, diamante.getDurabilidad());
        assertEquals(durabilidadPicoMadera - picoMadera.getFuerza(), picoMadera.getDurabilidad());

        picoPiedra.golpearDiamante(diamante);
        assertEquals(durabilidadDiamante, diamante.getDurabilidad());
        assertEquals(durabilidadPicoPiedra - picoPiedra.getFuerza() / 1.5, picoPiedra.getDurabilidad(), 0.00001);

        picoMetal.golpearDiamante(diamante);
        assertEquals(durabilidadDiamante, diamante.getDurabilidad());
        assertEquals(durabilidadPicoMetal, picoMetal.getDurabilidad());
    }

}
