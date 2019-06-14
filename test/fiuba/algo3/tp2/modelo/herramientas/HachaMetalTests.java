package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.desgastes.DesgasteMitadDeFuerza;
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

    @Test
    public void test06SeCreaHachaDeMetalConDurabilidad400YFuerza10() {

        int fuerza = 10;
        int durabilidad = 400;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Metal material = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        DesgasteMitadDeFuerza desgaste = new DesgasteMitadDeFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,material) ;

        assertEquals(400, hacha.getDurabilidad());
        assertEquals(10, hacha.getFuerza());
    }

    @Test
    public void test07HachaDeMetalGolpeaBloqueDeMaderaSeDesgastaHacha() {

        int fuerza = 4;
        int durabilidad = 400;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Madera();
        DesgasteMitadDeFuerza desgaste = new DesgasteMitadDeFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,metalHerramienta) ;

        hacha.golpearMadera(bloque);
        assertEquals(398, hacha.getDurabilidad());
        hacha.golpearMadera(bloque);
        assertEquals(396, hacha.getDurabilidad());

    }

    @Test
    public void test08HachaDeMetalGolpeaBloqueDePiedraSeDesgastaHacha() {

        int fuerza = 4;
        int durabilidad = 400;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Piedra();
        DesgasteMitadDeFuerza desgaste = new DesgasteMitadDeFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,metalHerramienta) ;

        hacha.golpearMadera(bloque);
        assertEquals(398, hacha.getDurabilidad());
        hacha.golpearMadera(bloque);
        assertEquals(396, hacha.getDurabilidad());

    }

    @Test
    public void test09HachaDeMetalGolpeaBloqueDeMetalSeDesgastaHacha() {

        int fuerza = 4;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Metal();
        DesgasteMitadDeFuerza desgaste = new DesgasteMitadDeFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,metalHerramienta) ;

        hacha.golpearMadera(bloque);
        assertEquals(98, hacha.getDurabilidad());
        hacha.golpearMadera(bloque);
        assertEquals(96, hacha.getDurabilidad());

    }

    @Test
    public void test10HachaDeMetalGolpeaBloqueDeDiamanteSeDesgastaHacha() {

        int fuerza = 6;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Diamante();
        DesgasteMitadDeFuerza desgaste = new DesgasteMitadDeFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,metalHerramienta) ;

        hacha.golpearMadera(bloque);
        assertEquals(97, hacha.getDurabilidad());
        hacha.golpearMadera(bloque);
        assertEquals(94, hacha.getDurabilidad());

    }

    @Test
    public void test11HachaDeMetalGolpeaBloqueDeMaderaSeDesgastaMadera() {

        int fuerza = 6;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Madera();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteMitadDeFuerza desgaste = new DesgasteMitadDeFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        hacha.golpearMadera(bloque);
        assertEquals(durabilidadInicialBloque-fuerza, bloque.getDurabilidad());
    }

    @Test
    public void test12HachaDeMetalGolpeaBloqueDePiedraNoSeDesgastaPiedra() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Piedra();
        float durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteMitadDeFuerza desgaste = new DesgasteMitadDeFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,metalHerramienta) ;

        hacha.golpearPiedra(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

    @Test
    public void test13HachaDeMetalGolpeaBloqueMetalNoSeDesgastaMetal() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Metal();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteMitadDeFuerza desgaste = new DesgasteMitadDeFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,metalHerramienta) ;

        hacha.golpearMetal(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

    @Test
    public void test14HachaDeMetalGolpeaBloqueDeDiamanteNoSeDesgastaDiamante() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Diamante();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteMitadDeFuerza desgaste = new DesgasteMitadDeFuerza(durabilidad, fuerza);
        Herramienta hacha = new Hacha(fuerza, durabilidad,desgaste,metalHerramienta) ;

        hacha.golpearDiamante(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

}