package fiuba.algo3.tp2.modelo;

import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.materiales.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneralTests {

    @Test
    public void test01PruebaGeneralDeFuncionamientoDelModelo() {
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

        // Prueba durabilidad de madera y desgaste de hachas
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

        // Pico fino desgasta diamante
        picoFino.golpearDiamante(diamante);
        assertEquals(durabilidadDiamante - picoFino.getFuerza(), diamante.getDurabilidad());
        assertEquals(durabilidadPicoFino - durabilidadPicoFino * 0.1, picoFino.getDurabilidad());
    }

}
