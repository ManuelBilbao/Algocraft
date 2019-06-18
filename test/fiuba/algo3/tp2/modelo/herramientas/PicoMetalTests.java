package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.desgastes.DesgasteAbrupto;
import fiuba.algo3.tp2.modelo.desgastes.DesgasteMitadDeFuerza;
import fiuba.algo3.tp2.modelo.desgastes.DesgastePorFuerzaDivididoUnoComaCinco;
import fiuba.algo3.tp2.modelo.materiales.bloques.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PicoMetalTests {



    @Test
    public void test01SeCreaPicoDeMetalConDurabilidad400YFuerza12() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construirPicoDeMetal();

        assertEquals(pico.getDurabilidad(), 400);
        assertEquals(pico.getFuerza(), 12);
    }

    @Test
    public void test02PicoDeMetalGolpeaBloqueDeMadera() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);


        Herramienta pico = jugador.construirPicoDeMetal();
        Material madera = new Madera();

        pico.golpearMadera(madera);
        assertEquals(400, pico.getDurabilidad());
        pico.golpearMadera(madera);
        assertEquals(400, pico.getDurabilidad());
        for (int i = 3; i <= 9; i++) {
            pico.golpearMadera(madera);
        }
        assertEquals(400, pico.getDurabilidad());
        pico.golpearMadera(madera);
        assertEquals(0, pico.getDurabilidad());
    }

    @Test
    public void test03PicoDeMetalGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construirPicoDeMetal();
        Material piedra = new Piedra();

        pico.golpearPiedra(piedra);
        assertEquals(400, pico.getDurabilidad());
        pico.golpearPiedra(piedra);
        assertEquals(400, pico.getDurabilidad());
        pico.golpearPiedra(piedra);
        assertEquals(400, pico.getDurabilidad());
    }

    @Test
    public void test04PicoDeMetalGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construirPicoDeMetal();
        Material metal = new Metal();

        pico.golpearMetal(metal);
        assertEquals(400, pico.getDurabilidad());
        pico.golpearMetal(metal);
        assertEquals(400, pico.getDurabilidad());
        for (int i = 3; i <= 9; i++) {
            pico.golpearMetal(metal);
        }
        assertEquals(400, pico.getDurabilidad());
        pico.golpearMetal(metal);
        assertEquals(0, pico.getDurabilidad());
    }

    @Test
    public void test05PicoDeMetalGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construirPicoDeMetal();
        Material diamante = new Diamante();

        pico.golpearDiamante(diamante);
        assertEquals(400, pico.getDurabilidad());
        pico.golpearDiamante(diamante);
        assertEquals(400, pico.getDurabilidad());
        for (int i = 3; i <= 9; i++) {
            pico.golpearDiamante(diamante);
        }
        assertEquals(400, pico.getDurabilidad());
        pico.golpearDiamante(diamante);
        assertEquals(0, pico.getDurabilidad());
    }

    @Test
    public void test06SeCreaPicoDeMetalConDurabilidad400YFuerza10() {

        int fuerza = 10;
        int durabilidad = 400;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Metal material = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        DesgasteAbrupto desgaste = new DesgasteAbrupto(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,material) ;

        assertEquals(400, pico.getDurabilidad());
        assertEquals(10, pico.getFuerza());
    }

    @Test
    public void test07PicoDeMetalGolpeaBloqueDeMaderaSeDesgastaPico() {

        int fuerza = 3;
        int durabilidad = 400;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Madera();
        DesgasteAbrupto desgaste = new DesgasteAbrupto(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,metalHerramienta) ;

        pico.golpearMadera(bloque);
        assertEquals(400, pico.getDurabilidad());
        pico.golpearMadera(bloque);
        assertEquals(400, pico.getDurabilidad());

    }

    @Test
    public void test08PicoDeMetalGolpeaBloqueDePiedraSeDesgastaPico() {

        int fuerza = 6;
        int durabilidad = 400;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Piedra();
        DesgasteAbrupto desgaste = new DesgasteAbrupto(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,metalHerramienta) ;

        pico.golpearMadera(bloque);
        assertEquals(400, pico.getDurabilidad());
        pico.golpearMadera(bloque);
        assertEquals(400, pico.getDurabilidad());

    }

    @Test
    public void test09PicoDeMetalGolpeaBloqueDeMetalSeDesgastaPico() {

        int fuerza = 3;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Metal();
        DesgasteAbrupto desgaste = new DesgasteAbrupto(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,metalHerramienta) ;

        pico.golpearMadera(bloque);
        assertEquals(100, pico.getDurabilidad());
        pico.golpearMadera(bloque);
        assertEquals(100, pico.getDurabilidad());

    }

    @Test
    public void test10PicoDeMetalGolpeaBloqueDeDiamanteSeDesgastaPico() {

        int fuerza = 3;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Diamante();
        DesgasteAbrupto desgaste = new DesgasteAbrupto(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,metalHerramienta) ;

        pico.golpearMadera(bloque);
        assertEquals(100, pico.getDurabilidad());
        pico.golpearMadera(bloque);
        assertEquals(100, pico.getDurabilidad());

    }

    @Test
    public void test11PicoDeMetalGolpeaBloqueDeMaderaNoSeDesgastaMadera() {

        int fuerza = 6;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Madera();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteAbrupto desgaste = new DesgasteAbrupto(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        pico.golpearMadera(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

    @Test
    public void test12PicoDeMetalGolpeaBloqueDePiedraSeDesgastaPiedra() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Piedra();
        float durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteAbrupto desgaste = new DesgasteAbrupto(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,metalHerramienta) ;

        pico.golpearPiedra(bloque);
        assertEquals(durabilidadInicialBloque-fuerza, bloque.getDurabilidad());
    }

    @Test
    public void test13PicoDeMetalGolpeaBloqueMetalNoSeDesgastaMetal() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Metal();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteAbrupto desgaste = new DesgasteAbrupto(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,metalHerramienta) ;

        pico.golpearMetal(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

    @Test
    public void test14PicoDeMetalGolpeaBloqueDeDiamanteNoSeDesgastaDiamante() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Diamante();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteAbrupto desgaste = new DesgasteAbrupto(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,metalHerramienta) ;

        pico.golpearDiamante(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

}