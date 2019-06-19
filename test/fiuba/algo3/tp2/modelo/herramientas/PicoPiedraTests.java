package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.desgastes.DesgastePorFuerzaDivididoUnoComaCinco;
import fiuba.algo3.tp2.modelo.materiales.bloques.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PicoPiedraTests {

    @Test
    public void test01SeCreaPicoDePiedraConDurabilidad200YFuerza4() {
        Jugador jugador = new Jugador();

        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construir();

        assertEquals(pico.getDurabilidad(), 200);
        assertEquals(pico.getFuerza(), 4);


    }

    @Test
    public void test02PicoDePiedraGolpeaBloqueDeMadera() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);
        Herramienta pico = jugador.construir();
        Material madera = new Madera();
        float durabilidad = pico.getDurabilidad();

        pico.golpearMadera(madera);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad(), 0.00001);
        durabilidad -= (pico.getFuerza() / 1.5);
        pico.golpearMadera(madera);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad(), 0.00001);
    }

    @Test
    public void test03PicoDePiedraGolpeaBloqueDePiedra() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construir();
        Material piedra = new Piedra();
        float durabilidad = pico.getDurabilidad();

        pico.golpearMadera(piedra);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad(), 0.00001);
        durabilidad -= (pico.getFuerza() / 1.5);
        pico.golpearMadera(piedra);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad(), 0.00001);
    }

    @Test
    public void test04PicoDePiedraGolpeaBloqueDeMetal() {
        Jugador jugador = new Jugador();

        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construir();
        Material metal = new Metal();
        float durabilidad = pico.getDurabilidad();

        pico.golpearMadera(metal);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad(), 0.00001);
        durabilidad -= (pico.getFuerza() / 1.5);
        pico.golpearMadera(metal);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad(), 0.00001);
    }

    @Test
    public void test05PicoDePiedraGolpeaBloqueDeDiamante() {
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,2);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta pico = jugador.construir();
        Material diamante = new Diamante();
        float durabilidad = pico.getDurabilidad();

        pico.golpearMadera(diamante);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad(), 0.00001);
        durabilidad -= (pico.getFuerza() / 1.5);
        pico.golpearMadera(diamante);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad(), 0.00001);
    }


    @Test
    public void test06SeCreaPicoDePiedraConDurabilidad400YFuerza10() {

        int fuerza = 10;
        int durabilidad = 400;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra material = new fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra();
        DesgastePorFuerzaDivididoUnoComaCinco desgaste = new DesgastePorFuerzaDivididoUnoComaCinco(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,material) ;

        assertEquals(400, pico.getDurabilidad());
        assertEquals(10, pico.getFuerza());
    }

    @Test
    public void test07PicoDePiedraGolpeaBloqueDeMaderaSeDesgastaPico() {

        int fuerza = 3;
        int durabilidad = 400;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Piedra();
        DesgastePorFuerzaDivididoUnoComaCinco desgaste = new DesgastePorFuerzaDivididoUnoComaCinco(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,metalHerramienta) ;

        pico.golpearMadera(bloque);
        assertEquals(398, pico.getDurabilidad());
        pico.golpearMadera(bloque);
        assertEquals(396, pico.getDurabilidad());

    }

    @Test
    public void test08PicoDePiedraGolpeaBloqueDePiedraSeDesgastaPico() {

        int fuerza = 6;
        int durabilidad = 400;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Piedra();
        DesgastePorFuerzaDivididoUnoComaCinco desgaste = new DesgastePorFuerzaDivididoUnoComaCinco(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,metalHerramienta) ;

        pico.golpearMadera(bloque);
        assertEquals(396, pico.getDurabilidad());
        pico.golpearMadera(bloque);
        assertEquals(392, pico.getDurabilidad());

    }

    @Test
    public void test09PicoDePiedraGolpeaBloqueDeMetalSeDesgastaPico() {

        int fuerza = 3;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Piedra();
        DesgastePorFuerzaDivididoUnoComaCinco desgaste = new DesgastePorFuerzaDivididoUnoComaCinco(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,metalHerramienta) ;

        pico.golpearMadera(bloque);
        assertEquals(98, pico.getDurabilidad());
        pico.golpearMadera(bloque);
        assertEquals(96, pico.getDurabilidad());

    }

    @Test
    public void test10PicoDePiedralGolpeaBloqueDeDiamanteSeDesgastaPico() {

        int fuerza = 3;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Diamante();
        DesgastePorFuerzaDivididoUnoComaCinco desgaste = new DesgastePorFuerzaDivididoUnoComaCinco(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,metalHerramienta) ;

        pico.golpearMadera(bloque);
        assertEquals(98, pico.getDurabilidad());
        pico.golpearMadera(bloque);
        assertEquals(96, pico.getDurabilidad());

    }

    @Test
    public void test11PicoDePiedraGolpeaBloqueDeMaderaNoSeDesgastaMadera() {

        int fuerza = 6;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material maderaHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Madera();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgastePorFuerzaDivididoUnoComaCinco desgaste = new DesgastePorFuerzaDivididoUnoComaCinco(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,maderaHerramienta) ;

        pico.golpearMadera(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

    @Test
    public void test12PicoDePiedraGolpeaBloqueDePiedraSeDesgastaPiedra() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Metal();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Piedra();
        float durabilidadInicialBloque = bloque.getDurabilidad();
        DesgastePorFuerzaDivididoUnoComaCinco desgaste = new DesgastePorFuerzaDivididoUnoComaCinco(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,metalHerramienta) ;

        pico.golpearPiedra(bloque);
        assertEquals(durabilidadInicialBloque-fuerza, bloque.getDurabilidad());
    }

    @Test
    public void test13PicoDePiedraGolpeaBloqueMetalSeDesgastaMetal() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Metal();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgastePorFuerzaDivididoUnoComaCinco desgaste = new DesgastePorFuerzaDivididoUnoComaCinco(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,metalHerramienta) ;

        pico.golpearMetal(bloque);
        assertEquals(durabilidadInicialBloque-fuerza, bloque.getDurabilidad());
    }

    @Test
    public void test14PicoDePiedraGolpeaBloqueDeDiamanteNoSeDesgastaDiamante() {

        int fuerza = 2;
        int durabilidad = 100;

        fiuba.algo3.tp2.modelo.materiales.herramientas.Material metalHerramienta = new fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra();
        fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque = new fiuba.algo3.tp2.modelo.materiales.bloques.Diamante();
        int durabilidadInicialBloque = bloque.getDurabilidad();
        DesgastePorFuerzaDivididoUnoComaCinco desgaste = new DesgastePorFuerzaDivididoUnoComaCinco(durabilidad, fuerza);
        Herramienta pico = new Pico(fuerza, durabilidad,desgaste,metalHerramienta) ;

        pico.golpearDiamante(bloque);
        assertEquals(durabilidadInicialBloque, bloque.getDurabilidad());
    }

}