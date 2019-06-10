package fiuba.algo3.tp2.modelo;

import fiuba.algo3.tp2.modelo.desgastes.*;
import fiuba.algo3.tp2.modelo.herramientas.*;
import fiuba.algo3.tp2.modelo.materiales.herramientas.Madera;
import fiuba.algo3.tp2.modelo.materiales.herramientas.Material;
import fiuba.algo3.tp2.modelo.materiales.herramientas.Metal;
import fiuba.algo3.tp2.modelo.materiales.herramientas.Piedra;

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

    private Hacha construirHacha(int fuerza, int durabilidad, Desgaste desgaste, Material material) {
        Hacha hacha = new Hacha(fuerza, durabilidad, desgaste, material);
        return hacha;
    }

    private Pico construirPico(int fuerza, int durabilidad, Desgaste desgaste, Material material) {
        Pico pico = new Pico(fuerza, durabilidad, desgaste, material);
        return pico;
    }

    public Herramienta construirHachaDeMadera() {
        Desgaste desgaste = new DesgasteLinealPorFuerza(DURABILIDAD_HACHA_MADERA, FUERZA_HACHA_MADERA);
        Material madera = new Madera();
        return construirHacha(FUERZA_HACHA_MADERA, DURABILIDAD_HACHA_MADERA, desgaste, madera);
    }

    public Herramienta construirHachaDePiedra() {
        Desgaste desgaste = new DesgasteLinealPorFuerza(DURABILIDAD_HACHA_PIEDRA, FUERZA_HACHA_PIEDRA);
        Material piedra = new Piedra();
        return construirHacha(FUERZA_HACHA_PIEDRA, DURABILIDAD_HACHA_PIEDRA, desgaste, piedra);
    }

    public Herramienta construirHachaDeMetal() {
        Desgaste desgaste = new DesgasteMitadDeFuerza(DURABILIDAD_HACHA_METAL, FUERZA_HACHA_METAL);
        Material metal = new Metal();
        return construirHacha(FUERZA_HACHA_METAL, DURABILIDAD_HACHA_METAL, desgaste, metal);
    }

    public Herramienta construirPicoDeMadera() {
        Desgaste desgaste = new DesgasteLinealPorFuerza(DURABILIDAD_PICO_MADERA, FUERZA_PICO_MADERA);
        Material madera = new Madera();
        return construirPico(FUERZA_PICO_MADERA, DURABILIDAD_PICO_MADERA, desgaste, madera);
    }

    public Herramienta construirPicoDePiedra() {
        Desgaste desgaste = new DesgastePorFuerzaDivididoUnoComaCinco(DURABILIDAD_PICO_PIEDRA, FUERZA_PICO_PIEDRA);
        Material piedra = new Piedra();
        return construirPico(FUERZA_PICO_PIEDRA, DURABILIDAD_PICO_PIEDRA, desgaste, piedra);
    }

    public Herramienta construirPicoDeMetal() {
        Desgaste desgaste = new DesgasteAbrupto(DURABILIDAD_PICO_METAL, 10);
        Material metal = new Metal();
        return construirPico(FUERZA_PICO_METAL, DURABILIDAD_PICO_METAL, desgaste, metal);
    }

    public Herramienta construirPicoFino() {
        Herramienta picoFino = new PicoFino();
        return picoFino;
    }
}
