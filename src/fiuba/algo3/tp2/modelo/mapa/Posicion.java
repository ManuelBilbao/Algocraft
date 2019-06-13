package fiuba.algo3.tp2.modelo.mapa;

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
        fila--;
    }

    public void moverAbajo(){
        fila++;
    }

    @Override
    public boolean equals(Object obj) {
        Posicion posicion = (Posicion)obj;
        return this.fila == posicion.getFila() && this.columna == posicion.getColumna();
    }

    @Override
    public int hashCode() {
        String hash = String.valueOf(fila) + String.valueOf(columna);
        return Integer.parseInt(hash);
    }

    public void moverDerecha(){
        columna++;
    }

    public void moverIzquierda(){
        columna--;
    }

    public Posicion posicionSuperior() {
        return new Posicion(fila - 1, columna);
    }

    public Posicion posicionInferior() {
        return new Posicion(fila + 1, columna);
    }

    public Posicion posicionIzquierda() {
        return new Posicion(fila, columna - 1);
    }

    public Posicion posicionDerecha() {
        return new Posicion(fila, columna + 1);
    }
}
