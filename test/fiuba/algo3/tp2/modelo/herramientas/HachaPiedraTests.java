package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.desgastes.DesgasteLinealPorFuerza;
import fiuba.algo3.tp2.modelo.materiales.bloques.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HachaPiedraTests {


    @Test
    public void test01SeCreaHachaDePiedraConDurabilidad200YFuerza5() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hacha = jugador.construirHachaDePiedra();

        assertEquals(hacha.getDurabilidad(), 200);
        assertEquals(hacha.getFuerza(), 5);
    }

    @Test
    public void test02HachaDePiedraGolpeaBloqueDeMadera() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

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
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

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
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

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
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hacha = jugador.construirHachaDePiedra();
        Material diamante = new Diamante();

        hacha.golpearMadera(diamante);
        assertEquals(195, hacha.getDurabilidad());
        hacha.golpearMadera(diamante);
        assertEquals(190, hacha.getDurabilidad());
    }

    @Test
    public void test06SeCreaHachaDePiedraConDurabilidad100YFuerza2Unitaria() {

        int fuerza = 10;
        int durabilidad = 400;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material material = new fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,material) ;

        assertEquals(400, hacha.getDurabilidad());
        assertEquals(10, hacha.getFuerza());
    }

    @Test
    public void test07HachaDePiedraGolpeaBloqueDeMaderaSeDesgastaHacha() {

        int fuerza = 4;
        int durabilidad = 400;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Madera();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,metalHerramienta) ;

        hacha.golpearMadera(bloque);
        assertEquals(396, hacha.getDurabilidad());
        hacha.golpearMadera(bloque);
        assertEquals(392, hacha.getDurabilidad());

    }

    @Test
    public void test08HachaDePiedraGolpeaBloqueDePiedraSeDesgastaHacha() {

        int fuerza = 4;
        int durabilidad = 400;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Piedra();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,metalHerramienta) ;

        hacha.golpearMadera(bloque);
        assertEquals(396, hacha.getDurabilidad());
        hacha.golpearMadera(bloque);
        assertEquals(392, hacha.getDurabilidad());

    }

    @Test
    public void test09HachaDePiedraGolpeaBloqueDeMetalSeDesgastaHacha() {

        int fuerza = 4;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material piedraHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Metal();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,piedraHerramienta) ;

        hacha.golpearMadera(bloque);
        assertEquals(96, hacha.getDurabilidad());
        hacha.golpearMadera(bloque);
        assertEquals(92, hacha.getDurabilidad());

    }

    @Test
    public void test10HachaDePiedraGolpeaBloqueDeDiamanteSeDesgastaHacha() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material piedraHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Diamante();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,piedraHerramienta) ;

        hacha.golpearMadera(bloque);
        assertEquals(98, hacha.getDurabilidad());
        hacha.golpearMadera(bloque);
        assertEquals(96, hacha.getDurabilidad());

    }

    @Test
    public void test11HachaDePiedraGolpeaBloqueDeMaderaSeDesgastaMadera() {

        int fuerza = 6;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material piedraHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Madera();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,piedraHerramienta) ;

        hacha.golpearMadera(bloque);
        assertEquals(durabilidadInicialBloque-fuerza, bloque.getDurabilidad());
    }

    @Test
    public void test12HachaDePiedraGolpeaBloqueDePiedraNoSeDesgastaPiedra() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material piedraHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Piedra();
        float durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,piedraHerramienta) ;

        hacha.golpearPiedra(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

    @Test
    public void test13HachaDePidralGolpeaBloqueMetalNoSeDesgastaMetal() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material piedraHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Metal();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,piedraHerramienta) ;

        hacha.golpearMetal(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

    @Test
    public void test14HachaDePiedraGolpeaBloqueDeDiamanteNoSeDesgastaDiamante() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material piedraHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Diamante();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,piedraHerramienta) ;

        hacha.golpearDiamante(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }
}