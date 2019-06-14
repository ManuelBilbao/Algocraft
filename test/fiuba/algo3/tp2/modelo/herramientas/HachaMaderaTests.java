package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.desgastes.Desgaste;
import fiuba.algo3.tp2.modelo.desgastes.DesgasteLinealPorFuerza;
import fiuba.algo3.tp2.modelo.materiales.bloques.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HachaMaderaTests {

    @Test
    public void test01SeCreaHachaDeMaderaConDurabilidad100YFuerza2() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);


        Herramienta hacha = jugador.construirHachaDeMadera();

        assertEquals(100, hacha.getDurabilidad());
        assertEquals(2, hacha.getFuerza());
    }

    @Test
    public void test02HachaDeMaderaGolpeaBloqueDeMadera() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

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
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

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
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

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
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hacha = jugador.construirHachaDeMadera();
        Material diamante = new Diamante();


        hacha.golpearMadera(diamante);
        assertEquals(98, hacha.getDurabilidad());
        hacha.golpearMadera(diamante);
        assertEquals(96, hacha.getDurabilidad());
    }

    @Test
    public void test06SeCreaHachaDeMaderaConDurabilidad100YFuerza2() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Madera material = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,material) ;

        assertEquals(100, hacha.getDurabilidad());
        assertEquals(2, hacha.getFuerza());
    }

    @Test
    public void test07HachaDeMaderaGolpeaBloqueDeMaderaSeDesgastaHacha() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Madera();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        hacha.golpearMadera(bloque);
        assertEquals(98, hacha.getDurabilidad());
        hacha.golpearMadera(bloque);
        assertEquals(96, hacha.getDurabilidad());

    }

    @Test
    public void test08HachaDeMaderaGolpeaBloqueDePiedraSeDesgastaHacha() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Piedra();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        hacha.golpearMadera(bloque);
        assertEquals(98, hacha.getDurabilidad());
        hacha.golpearMadera(bloque);
        assertEquals(96, hacha.getDurabilidad());

    }

    @Test
    public void test09HachaDeMaderaGolpeaBloqueDeMetalSeDesgastaHacha() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Metal();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        hacha.golpearMadera(bloque);
        assertEquals(98, hacha.getDurabilidad());
        hacha.golpearMadera(bloque);
        assertEquals(96, hacha.getDurabilidad());

    }

    @Test
    public void test10HachaDeMaderaGolpeaBloqueDeDiamanteSeDesgastaHacha() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Diamante();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        hacha.golpearMadera(bloque);
        assertEquals(98, hacha.getDurabilidad());
        hacha.golpearMadera(bloque);
        assertEquals(96, hacha.getDurabilidad());

    }

    @Test
    public void test11HachaDeMaderaGolpeaBloqueDeMaderaSeDesgastaMadera() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Madera();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        hacha.golpearMadera(bloque);
        assertEquals(durabilidadInicialBloque-2, bloque.getDurabilidad());
    }

    @Test
    public void test12HachaDeMaderaGolpeaBloqueDePiedraNoSeDesgastaPiedra() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Piedra();
        float durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        hacha.golpearPiedra(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

    @Test
    public void test13HachaDeMaderaGolpeaBloqueMetalNoSeDesgastaMetal() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Metal();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        hacha.golpearMetal(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

    @Test
    public void test14HachaDeMaderaGolpeaBloqueDeDiamanteNoSeDesgastaDiamante() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Diamante();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        hacha.golpearDiamante(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

}