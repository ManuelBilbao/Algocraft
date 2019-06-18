package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.materiales.bloques.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PicoFinoTests {

    @Test
    public void test01SeCreaPicoFinoConDurabilidad1000YFuerza20() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),1,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta picoFino = jugador.construirPicoFino();

        assertEquals(picoFino.getDurabilidad(), 1000);
        assertEquals(picoFino.getFuerza(), 20);
    }

    @Test
    public void test02PicoFinoGolpeaBloqueDeMadera() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),1,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construirPicoFino();
        Material madera = new Madera();

        pico.golpearMadera(madera);
        assertEquals(1000, pico.getDurabilidad());
        pico.golpearMadera(madera);
        assertEquals(1000, pico.getDurabilidad());
        for (int i = 0; i < 10; i++) {
            pico.golpearMadera(madera);
        }
        assertEquals(1000, pico.getDurabilidad());
    }

    @Test
    public void test03PicoFinoGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),1,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construirPicoFino();
        Material piedra = new Piedra();

        pico.golpearPiedra(piedra);
        assertEquals(1000, pico.getDurabilidad());
        pico.golpearPiedra(piedra);
        assertEquals(1000, pico.getDurabilidad());
        for (int i = 0; i < 10; i++) {
            pico.golpearPiedra(piedra);
        }
        assertEquals(1000, pico.getDurabilidad());
    }

    @Test
    public void test04PicoFinoGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),1,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construirPicoFino();
        Material metal = new Metal();

        pico.golpearMetal(metal);
        assertEquals(1000, pico.getDurabilidad());
        pico.golpearMetal(metal);
        assertEquals(1000, pico.getDurabilidad());
        for (int i = 0; i < 10; i++) {
            pico.golpearMetal(metal);
        }
        assertEquals(1000, pico.getDurabilidad());
    }

    @Test
    public void test05PicoFinoGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),1,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construirPicoFino();
        Material diamante = new Diamante();

        pico.golpearDiamante(diamante);
        assertEquals(900, pico.getDurabilidad());
        pico.golpearDiamante(diamante);
        assertEquals(810, pico.getDurabilidad());
    }


    @Test
    public void test06SeCreaPicoFinoConDurabilidad1000YFuerza20() {

        Piedra material = new Piedra();
        Herramienta pico = new PicoFino() ;

        assertEquals(1000, pico.getDurabilidad());
        assertEquals(20, pico.getFuerza());
    }

    @Test
    public void test07PicoFinoGolpeaBloqueDeMaderaSeDesgastaPico() {

        Piedra bloque = new Piedra();
        Herramienta pico = new PicoFino() ;

        pico.golpearMadera(bloque);
        assertEquals(1000, pico.getDurabilidad());
        pico.golpearMadera(bloque);
        assertEquals(1000, pico.getDurabilidad());
        for (int i = 0; i < 10; i++) {
            pico.golpearMadera(bloque);
        }
        assertEquals(1000, pico.getDurabilidad());

    }

    @Test
    public void test08PicoFinoGolpeaBloqueDePiedraSeDesgastaPico() {

        Piedra bloque = new Piedra();
        Herramienta pico = new PicoFino() ;

        pico.golpearPiedra(bloque);
        assertEquals(1000, pico.getDurabilidad());
        pico.golpearPiedra(bloque);
        assertEquals(1000, pico.getDurabilidad());
        for (int i = 0; i < 10; i++) {
            pico.golpearPiedra(bloque);
        }
        assertEquals(1000, pico.getDurabilidad());

    }

    @Test
    public void test09PicoFinoGolpeaBloqueDeMetalSeDesgastaPico() {

        Metal bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Metal();
        Herramienta pico = new PicoFino() ;

        pico.golpearMetal(bloque);
        assertEquals(1000, pico.getDurabilidad());
        pico.golpearMetal(bloque);
        assertEquals(1000, pico.getDurabilidad());
        for (int i = 0; i < 10; i++) {
            pico.golpearMetal(bloque);
        }
        assertEquals(1000, pico.getDurabilidad());

    }

    @Test
    public void test10PicoFinoGolpeaBloqueDeDiamanteSeDesgastaPico() {

        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Diamante();
        Herramienta pico = new PicoFino() ;

        Material diamante = new Diamante();

        pico.golpearDiamante(diamante);
        assertEquals(900, pico.getDurabilidad());
        pico.golpearDiamante(diamante);
        assertEquals(810, pico.getDurabilidad());

    }

    @Test
    public void test11PicoFinoGolpeaBloqueDeMaderaNoSeDesgastaMadera() {

        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Madera();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        Herramienta pico = new PicoFino() ;

        pico.golpearMadera(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

    @Test
    public void test12PicoFinoGolpeaBloqueDePiedraSeDesgastaPiedra() {



        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Piedra();
        float durabilidadInicialBloque = bloque.getDurabilidad();
        Herramienta pico = new PicoFino() ;
        ;

        pico.golpearPiedra(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

    @Test
    public void test13PicoFinoGolpeaBloqueMetalSeDesgastaMetal() {

        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Metal();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        Herramienta pico = new PicoFino() ;

        pico.golpearMetal(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

    @Test
    public void test14PicoFinoGolpeaBloqueDeDiamanteNoSeDesgastaDiamante() {

        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Diamante();
        int durabilidadInicialBloque = bloque.getDurabilidad();

        Herramienta pico = new PicoFino() ;

        pico.golpearDiamante(bloque);
        assertEquals(durabilidadInicialBloque-pico.getFuerza(), bloque.getDurabilidad());
    }

}
