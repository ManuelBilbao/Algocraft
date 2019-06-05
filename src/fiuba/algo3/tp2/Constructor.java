package fiuba.algo3.tp2;

public class Constructor {

    private final int FUERZA_HACHA_MADERA = 2;
    private final int DURABILIDAD_HACHA_MADERA = 100;
    private final int FUERZA_HACHA_PIEDRA = 5;
    private final int DURABILIDAD_HACHA_PIEDRA = 200;
    private final int FUERZA_HACHA_METAL = 10;
    private final int DURABILIDAD_HACHA_METAL = 400;
    private final int FUERZA_PICO_MADERA = 2;
    private final int DURABILIDAD_PICO_MADERA = 100;
    private final int FUERZA_PICO_PIEDRA = 4;
    private final int DURABILIDAD_PICO_PIEDRA = 200;
    private final int FUERZA_PICO_METAL = 12;
    private final int DURABILIDAD_PICO_METAL = 400;

    public Constructor() {

    }

    private Hacha construirHacha(int fuerza, int durabilidad) {
        Hacha hacha = new Hacha(fuerza, durabilidad);
        return hacha;
    }

    private Pico construirPico(int fuerza, int durabilidad) {
        Pico pico = new Pico(fuerza, durabilidad);
        return pico;
    }

    public Herramienta construirHachaDeMadera() {
        return construirHacha(FUERZA_HACHA_MADERA, DURABILIDAD_HACHA_MADERA);
    }

    public Herramienta construirHachaDePiedra() {
        return construirHacha(FUERZA_HACHA_PIEDRA, DURABILIDAD_HACHA_PIEDRA);
    }

    public Herramienta construirHachaDeMetal() {
        return construirHacha(FUERZA_HACHA_METAL, DURABILIDAD_HACHA_METAL);
    }

    public Herramienta construirPicoDeMadera() {
        return construirPico(FUERZA_PICO_MADERA, DURABILIDAD_PICO_MADERA);
    }

    public Herramienta construirPicoDePiedra() {
        return construirPico(FUERZA_PICO_PIEDRA, DURABILIDAD_PICO_PIEDRA);
    }

    public Herramienta construirPicoDeMetal() {
        return construirPico(FUERZA_PICO_METAL, DURABILIDAD_PICO_METAL);
    }

    public Herramienta construirPicoFino() {
        Herramienta picoFino = new PicoFino();
        return picoFino;
    }
}
