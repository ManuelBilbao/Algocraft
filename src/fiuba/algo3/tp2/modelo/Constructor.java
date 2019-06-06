package fiuba.algo3.tp2.modelo;

import fiuba.algo3.tp2.modelo.desgastes.*;
import fiuba.algo3.tp2.modelo.herramientas.*;

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

    private Hacha construirHacha(int fuerza, int durabilidad, Desgaste desgaste) {
        Hacha hacha = new Hacha(fuerza, durabilidad, desgaste);
        return hacha;
    }

    private Pico construirPico(int fuerza, int durabilidad, Desgaste desgaste) {
        Pico pico = new Pico(fuerza, durabilidad, desgaste);
        return pico;
    }

    public Herramienta construirHachaDeMadera() {
        Desgaste desgaste = new DesgasteLinealPorFuerza(DURABILIDAD_HACHA_MADERA, FUERZA_HACHA_MADERA);
        return construirHacha(FUERZA_HACHA_MADERA, DURABILIDAD_HACHA_MADERA, desgaste);
    }

    public Herramienta construirHachaDePiedra() {
        Desgaste desgaste = new DesgasteLinealPorFuerza(DURABILIDAD_HACHA_PIEDRA, FUERZA_HACHA_PIEDRA);
        return construirHacha(FUERZA_HACHA_PIEDRA, DURABILIDAD_HACHA_PIEDRA, desgaste);
    }

    public Herramienta construirHachaDeMetal() {
        Desgaste desgaste = new DesgasteMitadDeFuerza(DURABILIDAD_HACHA_METAL, FUERZA_HACHA_METAL);
        return construirHacha(FUERZA_HACHA_METAL, DURABILIDAD_HACHA_METAL, desgaste);
    }

    public Herramienta construirPicoDeMadera() {
        Desgaste desgaste = new DesgasteLinealPorFuerza(DURABILIDAD_PICO_MADERA, FUERZA_PICO_MADERA);
        return construirPico(FUERZA_PICO_MADERA, DURABILIDAD_PICO_MADERA, desgaste);
    }

    public Herramienta construirPicoDePiedra() {
        Desgaste desgaste = new DesgastePorFuerzaDivididoUnoComaCinco(DURABILIDAD_PICO_PIEDRA, FUERZA_PICO_PIEDRA);
        PicoPiedra pico = new PicoPiedra(FUERZA_PICO_PIEDRA, DURABILIDAD_PICO_PIEDRA, desgaste);
        return pico;
    }

    public Herramienta construirPicoDeMetal() {
        Desgaste desgaste = new DesgasteAbrupto(DURABILIDAD_PICO_METAL, 10);
        return construirPico(FUERZA_PICO_METAL, DURABILIDAD_PICO_METAL, desgaste);
    }

    public Herramienta construirPicoFino() {
        Herramienta picoFino = new PicoFino();
        return picoFino;
    }
}
