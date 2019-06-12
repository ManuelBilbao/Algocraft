package fiuba.algo3.tp2.modelo.Mapa;


import fiuba.algo3.tp2.modelo.Jugador;

public class Mapa {

    private final Casillero[][] casilleros = new Casillero[31][31];
    private Posicion posicionJugador;

    public Mapa(){
        for (int fila = 0; fila <= 30; fila++) {
            for(int col = 0; col<=30; col++){
                this.casilleros[fila][col] = new Casillero(fila,col);
            }
        }
    }

    public Mapa(Jugador jugador) {
        for (int fila = 0; fila <= 30; fila++) {
            for(int col = 0; col<=30; col++){
                this.casilleros[fila][col] = new Casillero(fila,col);
            }
        }

        this.casilleros[15][15].ocupar(jugador);
        this.posicionJugador = new Posicion(15, 15);
    }

    //    public void moverJugadorArriba(){}
//    public void moverJugadorAbajo(){}
//    public void moverJugadorIzquierda(){}
//    public void moverJugadorDerecha(){}
    public Casillero getCasillero(Integer fila, Integer columna){
        return casilleros[fila][columna];
    }

    public Posicion getPosicionJugador() {
        return posicionJugador;
    }

    public void setPosicionJugador(Posicion posicionNueva) {
        this.posicionJugador = posicionNueva;
    }

    public void liberarCasillero(Posicion posicion) {
        casilleros[posicion.getFila()][posicion.getColumna()].liberar();
    }

    public void ocuparCasillero(Posicion posicion, Jugador jugador) {
        casilleros[posicion.getFila()][posicion.getColumna()].ocupar(jugador);
    }
}
