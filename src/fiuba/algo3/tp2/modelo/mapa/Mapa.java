package fiuba.algo3.tp2.modelo.mapa;


import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.materiales.bloques.Diamante;
import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;
import fiuba.algo3.tp2.modelo.materiales.bloques.Metal;
import fiuba.algo3.tp2.modelo.materiales.bloques.Piedra;

import java.util.HashMap;

public class Mapa {

    int n =  30;
    int m =  30;

    private HashMap<Posicion, Casillero> casilleros = new HashMap<>();
    private Posicion posicionJugador;

    public Mapa(){
        for (int fila = 0; fila <= n; fila++) {
            for(int col = 0; col<=m; col++){
                casilleros.put(new Posicion(fila, col), new Casillero());
            }
        }
    }

    public Mapa(Jugador jugador) {

        for (int fila = 0; fila <= n; fila++) {
            for(int col = 0; col<=m; col++){
                casilleros.put(new Posicion(fila, col), new Casillero());
            }
        }

        this.posicionJugador = new Posicion(n/2, m/2);
        ocuparCasillero(new Posicion(n/2, m/2), jugador);
        InicializarMateriales inicializador = new InicializarMateriales();
        inicializador.inicializacionMateriales(casilleros);
    }

    public Casillero getCasillero(Integer fila, Integer columna){
        return casilleros.get(new Posicion(fila, columna));
    }

    public Casillero getCasillero(Posicion posicion) {
        return casilleros.get(posicion);
    }

    public Posicion getPosicionJugador() {
        return posicionJugador;
    }

    public void setPosicionJugador(Posicion posicionNueva) {
        this.posicionJugador = posicionNueva;
    }

    public void liberarCasillero(Posicion posicion) {
        casilleros.get(posicion).liberar();
    }

    public void ocuparCasillero(Posicion posicion, Object elemento) {
        casilleros.get(posicion).ocupar(elemento);
    }

    public int getAlto(){ return m;}

    public int getAncho(){return n;}

}
