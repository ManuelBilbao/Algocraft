package fiuba.algo3.tp2;

public class Constructor {

    final int FUERZA_HACHA_MADERA = 2;
    final int DURABILIDAD_HACHA_MADERA = 100;
    final int FUERZA_HACHA_PIEDRA = 5;
    final int DURABILIDAD_HACHA_PIEDRA = 200;
    final int FUERZA_HACHA_METAL = 10;
    final int DURABILIDAD_HACHA_METAL = 400;

    public Constructor() {

    }

    private Hacha construirHacha(int fuerza, int durabilidad) {
        Hacha hacha = new Hacha(fuerza, durabilidad);
        return hacha;
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

}
