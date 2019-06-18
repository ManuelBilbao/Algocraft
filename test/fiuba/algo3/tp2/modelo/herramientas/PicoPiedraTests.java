package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.Jugador;
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

        Herramienta pico = jugador.construirPicoDePiedra();

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
        Herramienta pico = jugador.construirPicoDePiedra();
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

        Herramienta pico = jugador.construirPicoDePiedra();
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

        Herramienta pico = jugador.construirPicoDePiedra();
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

        Herramienta pico = jugador.construirPicoDePiedra();
        Material diamante = new Diamante();
        float durabilidad = pico.getDurabilidad();

        pico.golpearMadera(diamante);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad(), 0.00001);
        durabilidad -= (pico.getFuerza() / 1.5);
        pico.golpearMadera(diamante);
        assertEquals(durabilidad - (pico.getFuerza() / 1.5), pico.getDurabilidad(), 0.00001);
    }

}