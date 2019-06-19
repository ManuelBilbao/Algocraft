package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.desgastes.DesgasteLinealPorFuerza;
import fiuba.algo3.tp2.modelo.materiales.bloques.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PicoMaderaTests {


    @Test
    public void test01SeCreaPicoDeMaderaConDurabilidad100YFuerza2() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construir();

        assertEquals(pico.getDurabilidad(), 100);
        assertEquals(pico.getFuerza(), 2);
    }

    @Test
    public void test02PicoDeMaderaGolpeaBloqueDeMadera() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construir();
        Material madera = new Madera();

        pico.golpearMadera(madera);
        assertEquals(98, pico.getDurabilidad());
        pico.golpearMadera(madera);
        assertEquals(96, pico.getDurabilidad());
    }

    @Test
    public void test03PicoDeMaderaGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construir();
        Material piedra = new Piedra();

        pico.golpearMadera(piedra);
        assertEquals(98, pico.getDurabilidad());
        pico.golpearMadera(piedra);
        assertEquals(96, pico.getDurabilidad());
    }

    @Test
    public void test04PicoDeMaderaGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construir();
        Material metal = new Metal();

        pico.golpearMadera(metal);
        assertEquals(98, pico.getDurabilidad());
        pico.golpearMadera(metal);
        assertEquals(96, pico.getDurabilidad());
    }

    @Test
    public void test05PicoDeMaderaGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construir();
        Material diamante = new Diamante();

        pico.golpearMadera(diamante);
        assertEquals(98, pico.getDurabilidad());
        pico.golpearMadera(diamante);
        assertEquals(96, pico.getDurabilidad());
    }
    @Test
    public void test06SeCreaPicoDeMaderaConDurabilidad100YFuerza2() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Madera material = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,material) ;

        assertEquals(100, pico.getDurabilidad());
        assertEquals(2, pico.getFuerza());
    }

    @Test
    public void test07PicoDeMaderaGolpeaBloqueDeMaderaSeDesgastaPico() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Madera();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        pico.golpearMadera(bloque);
        assertEquals(98, pico.getDurabilidad());
        pico.golpearMadera(bloque);
        assertEquals(96, pico.getDurabilidad());

    }

    @Test
    public void test08PicoDeMaderaGolpeaBloqueDePiedraSeDesgastaPico() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Piedra();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        pico.golpearMadera(bloque);
        assertEquals(98, pico.getDurabilidad());
        pico.golpearMadera(bloque);
        assertEquals(96, pico.getDurabilidad());

    }

    @Test
    public void test09PicoDeMaderaGolpeaBloqueDeMetalSeDesgastaPico() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Metal();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        pico.golpearMadera(bloque);
        assertEquals(98, pico.getDurabilidad());
        pico.golpearMadera(bloque);
        assertEquals(96, pico.getDurabilidad());

    }

    @Test
    public void test10HachaDeMaderaGolpeaBloqueDeDiamanteSeDesgastaHacha() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Diamante();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        pico.golpearMadera(bloque);
        assertEquals(98, pico.getDurabilidad());
        pico.golpearMadera(bloque);
        assertEquals(96, pico.getDurabilidad());

    }

    @Test
    public void test11HachaDeMaderaGolpeaBloqueDeMaderaNoSeDesgastaMadera() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Madera();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        pico.golpearMadera(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

    @Test
    public void test12PicoDeMaderaGolpeaBloqueDePiedraSeDesgastaPiedra() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Piedra();
        float durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        pico.golpearPiedra(bloque);
        assertEquals(durabilidadInicialBloque-fuerza, bloque.getDurabilidad());
    }

    @Test
    public void test13PicoDeMaderaGolpeaBloqueDiamanteNoSeDesgastaMetal() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Metal();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        pico.golpearMetal(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

    @Test
    public void test14PicoDeMaderaGolpeaBloqueDeDiamanteNoSeDesgastaDiamante() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Madera();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Diamante();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        pico.golpearDiamante(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }


}