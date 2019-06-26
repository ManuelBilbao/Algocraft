package fiuba.algo3.tp2.modelo;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.desgastes.NoPoseeDurabilidadException;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.mapa.CasilleroOcupadoException;
import fiuba.algo3.tp2.modelo.mapa.Mapa;
import fiuba.algo3.tp2.modelo.mapa.Posicion;
import fiuba.algo3.tp2.modelo.materiales.bloques.Material;


public class Juego {

    private Jugador jugador;
    private Mapa mapa;

    public Juego() {
        jugador = new Jugador();
        mapa = new Mapa(jugador);
    }

    private void moverJugador(Posicion posicionActual, Posicion posicionNueva) {
        mapa.ocuparCasillero(posicionNueva, this.jugador);
        mapa.liberarCasillero(posicionActual);
        mapa.setPosicionJugador(posicionNueva);
    }

    public void moverJugadorArriba() {
        Posicion posicionJugador = mapa.getPosicionJugador();
        Posicion posicionNueva = posicionJugador.posicionSuperior();
        moverJugador(posicionJugador, posicionNueva);
    }

    public void moverJugadorAbajo() {
        Posicion posicionJugador = mapa.getPosicionJugador();
        Posicion posicionNueva = posicionJugador.posicionInferior();
        moverJugador(posicionJugador, posicionNueva);
    }

    public void moverJugadorIzquieda() {
        Posicion posicionJugador = mapa.getPosicionJugador();
        Posicion posicionNueva = posicionJugador.posicionIzquierda();
        moverJugador(posicionJugador, posicionNueva);
    }

    public void moverJugadorDerecha() {
        Posicion posicionJugador = mapa.getPosicionJugador();
        Posicion posicionNueva = posicionJugador.posicionDerecha();
        moverJugador(posicionJugador, posicionNueva);
    }

    public void golpear(Material bloque, Herramienta herramienta){

            if (bloque.toString() == "Madera") {
                herramienta.golpearMadera(bloque);
            } else if (bloque.toString() == "Piedra") {
                herramienta.golpearPiedra(bloque);
            } else if (bloque.toString() == "Metal") {
                herramienta.golpearMetal(bloque);
            } else if (bloque.toString() == "Diamante") {
                herramienta.golpearDiamante(bloque);
            } else {
            }
    }

    public Material golpearDerecha(Herramienta herramienta){
        Material bloque = (Material) mapa.getCasillero(mapa.getPosicionJugador().posicionDerecha()).getContenido();
        golpear(bloque, herramienta);
        return bloque;

    }


    public Material golpearIzquierda(Herramienta herramienta){
        Material bloque = (Material) mapa.getCasillero(mapa.getPosicionJugador().posicionIzquierda()).getContenido();
        golpear(bloque, herramienta);
        return bloque;
    }


    public Material golpearAbajo(Herramienta herramienta){
        Material bloque = (Material) mapa.getCasillero(mapa.getPosicionJugador().posicionInferior()).getContenido();
        golpear(bloque, herramienta);
        return bloque;
    }


    public Material golpearArriba(Herramienta herramienta){
        Material bloque = (Material) mapa.getCasillero(mapa.getPosicionJugador().posicionSuperior()).getContenido();
        golpear(bloque, herramienta);
        return bloque;
    }


    public Mapa getMapa() {
        return mapa;
    }

    public Jugador getJugador() {
        return jugador;
    }

}
