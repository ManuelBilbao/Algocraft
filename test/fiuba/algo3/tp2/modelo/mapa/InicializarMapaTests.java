package fiuba.algo3.tp2.modelo.mapa;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.materiales.bloques.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InicializarMapaTests {

    @Test
    public void casilleroCentralOcupadoPorJugador(){
        Jugador jugador = new Jugador();
        Mapa mapa = new Mapa(jugador);

        assertEquals(jugador,mapa.getCasillero(15,15).getContenido());

    }

    @Test
    public void casillerosOcupadosPorMadera(){
        Mapa mapa = new Mapa();
        InicializarMateriales inicializador = new InicializarMateriales();

        inicializador.inicializacionMateriales(mapa.getMapa());

        assertEquals((new Madera()).getDurabilidad(), ((Madera) mapa.getCasillero(1,10).getContenido()).getDurabilidad());
        assertEquals((new Madera()).getDurabilidad(), ((Madera) mapa.getCasillero(1,11).getContenido()).getDurabilidad());
        assertEquals((new Madera()).getDurabilidad(), ((Madera) mapa.getCasillero(1,12).getContenido()).getDurabilidad());
        assertEquals((new Madera()).getDurabilidad(), ((Madera) mapa.getCasillero(1,13).getContenido()).getDurabilidad());
        assertEquals((new Madera()).getDurabilidad(), ((Madera) mapa.getCasillero(1,14).getContenido()).getDurabilidad());


    }


    @Test
    public void casillerosOcupadosPorPiedra(){
        Mapa mapa = new Mapa();
        InicializarMateriales inicializador = new InicializarMateriales();

        inicializador.inicializacionMateriales(mapa.getMapa());

        assertEquals((new Piedra()).getDurabilidad(), ((Piedra) mapa.getCasillero(18,7).getContenido()).getDurabilidad());
        assertEquals((new Piedra()).getDurabilidad(), ((Piedra) mapa.getCasillero(18,8).getContenido()).getDurabilidad());
        assertEquals((new Piedra()).getDurabilidad(), ((Piedra) mapa.getCasillero(18,9).getContenido()).getDurabilidad());
        assertEquals((new Piedra()).getDurabilidad(), ((Piedra) mapa.getCasillero(18,10).getContenido()).getDurabilidad());


    }

    @Test
    public void casillerosOcupadosPorMetal(){
        Mapa mapa = new Mapa();
        InicializarMateriales inicializador = new InicializarMateriales();

        inicializador.inicializacionMateriales(mapa.getMapa());

        assertEquals((new Metal()).getDurabilidad(), ((Metal) mapa.getCasillero(12,0).getContenido()).getDurabilidad());
        assertEquals((new Metal()).getDurabilidad(), ((Metal) mapa.getCasillero(12,1).getContenido()).getDurabilidad());
        assertEquals((new Metal()).getDurabilidad(), ((Metal) mapa.getCasillero(12,2).getContenido()).getDurabilidad());
        assertEquals((new Metal()).getDurabilidad(), ((Metal) mapa.getCasillero(13,0).getContenido()).getDurabilidad());
        assertEquals((new Metal()).getDurabilidad(), ((Metal) mapa.getCasillero(13,1).getContenido()).getDurabilidad());
        assertEquals((new Metal()).getDurabilidad(), ((Metal) mapa.getCasillero(13,2).getContenido()).getDurabilidad());


    }

    @Test
    public void casillerosOcupadosPorDiamante(){
        Mapa mapa = new Mapa();
        InicializarMateriales inicializador = new InicializarMateriales();

        inicializador.inicializacionMateriales(mapa.getMapa());

        assertEquals((new Diamante()).getDurabilidad(), ((Diamante) mapa.getCasillero(16,0).getContenido()).getDurabilidad());
        assertEquals((new Diamante()).getDurabilidad(), ((Diamante) mapa.getCasillero(16,1).getContenido()).getDurabilidad());
        assertEquals((new Diamante()).getDurabilidad(), ((Diamante) mapa.getCasillero(17,0).getContenido()).getDurabilidad());
        assertEquals((new Diamante()).getDurabilidad(), ((Diamante) mapa.getCasillero(17,1).getContenido()).getDurabilidad());

    }

}
