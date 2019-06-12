package fiuba.algo3.tp2.modelo.Mapa;

public class Posicion {
    private int fila;
    private int columna;

    public Posicion(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila(){ return fila; };

    public int getColumna(){ return columna; };

    public void moverArriba(){
        fila = fila-1;
    }

    public void moverAbajo(){
        fila = fila+1;
    }

    public void moverDerecha(){
        columna = columna+1;
    }

    public void moverIzquierda(){
        columna = columna-1;
    }
}
