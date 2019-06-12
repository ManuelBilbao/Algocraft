package fiuba.algo3.tp2.modelo.Mapa;


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

//    public void moverJugadorArriba(){}
//    public void moverJugadorAbajo(){}
//    public void moverJugadorIzquierda(){}
//    public void moverJugadorDerecha(){}
    public Casillero getCasillero(Integer fila, Integer columna){
        return casilleros[fila][columna];
    }


}
