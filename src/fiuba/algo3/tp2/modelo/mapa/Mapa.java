package fiuba.algo3.tp2.modelo.mapa;


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

    public Casillero getCasillero(Integer fila, Integer columna){
        return casilleros[fila][columna];
    }

    public Casillero getCasillero(Posicion posicion) {
        return casilleros[posicion.getFila()][posicion.getColumna()];
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



    public void inicializacionMateriales() {
        inicializarDiamante();
        inicializarMadera();
        inicializarMetal();
        inicializarPiedra();
    }


    public void inicializarMadera(){
        int fila = 0;
        int columna = 0;
        int tope = 0;
        while (tope < 200) {
            fila = (int) (Math.random() * 30) + 1;
            columna = (int) (Math.random() * 30) + 1;
            if (casilleros[fila][columna].getContenido() == null) {
                casilleros[fila][columna].ocupar("madera");
                tope++;
            }

        }
    }

    public void inicializarPiedra(){
        int fila = 0;
        int columna = 0;
        int tope = 0;
        while (tope < 150) {
            fila = (int) (Math.random() * 30) + 1;
            columna = (int) (Math.random() * 30) + 1;
            if (casilleros[fila][columna].getContenido() == null) {
                casilleros[fila][columna].ocupar("piedra");
                tope++;
            }

        }
    }


    public void inicializarMetal(){
        int fila = 0;
        int columna = 0;
        int tope = 0;
        while (tope < 100) {
            fila = (int) (Math.random() * 30) + 1;
            columna = (int) (Math.random() * 30) + 1;
            if (casilleros[fila][columna].getContenido() == null) {
                casilleros[fila][columna].ocupar("metal");
                tope++;
            }

        }
    }

    public void inicializarDiamante(){
        int fila = 0;
        int columna = 0;
        int tope = 0;
        while (tope < 50) {
            fila = (int) (Math.random() * 30) + 1;
            columna = (int) (Math.random() * 30) + 1;
            if (casilleros[fila][columna].getContenido() == null) {
                casilleros[fila][columna].ocupar("diamante");
                tope++;
            }

        }
    }

}
