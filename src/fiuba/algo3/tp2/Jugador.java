package fiuba.algo3.tp2;

public class Jugador {

    private Constructor constructor = new Constructor();

    public Jugador() {

    }

    public Herramienta construirHachaDeMadera() {
        return constructor.construirHachaDeMadera();
    }

    public Herramienta construirHachaDePiedra() {
        return constructor.construirHachaDePiedra();
    }

    public Herramienta construirHachaDeMetal() {
        return constructor.construirHachaDeMetal();
    }

    public Herramienta construirPicoDeMadera() {
        return constructor.construirPicoDeMadera();
    }

    public Herramienta construirPicoDePiedra() {
        return constructor.construirPicoDePiedra();
    }

    public Herramienta construirPicoDeMetal() {
        return constructor.construirPicoDeMetal();
    }

    public Herramienta construirPicoFino() {
        return constructor.construirPicoFino();
    }
}
