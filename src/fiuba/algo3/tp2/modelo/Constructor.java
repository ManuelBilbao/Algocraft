package fiuba.algo3.tp2.modelo;

import fiuba.algo3.tp2.modelo.construccionDeHerramientas.ImposibleConstruirHerramientaException;
import fiuba.algo3.tp2.modelo.construccionDeHerramientas.Mesa;
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

    public Herramienta construirHachaDeMadera(Mesa mesaDeConstruccion) {
        if(mesaDeConstruccion.estructuraHachaMadera()){
            Desgaste desgaste = new DesgasteLinealPorFuerza(DURABILIDAD_HACHA_MADERA, FUERZA_HACHA_MADERA);
            Material madera = new Madera();
            mesaDeConstruccion.limpiar();
            return construirHacha(FUERZA_HACHA_MADERA, DURABILIDAD_HACHA_MADERA, desgaste, madera);
        }
        else{
            return null;
            //throw new ImposibleConstruirHerramientaException();
        }
    }

    public Herramienta construirHachaDePiedra(Mesa mesaDeConstruccion) {
        if(mesaDeConstruccion.estructuraHachaPiedra()){
            Desgaste desgaste = new DesgasteLinealPorFuerza(DURABILIDAD_HACHA_PIEDRA, FUERZA_HACHA_PIEDRA);
            Material piedra = new Piedra();
            mesaDeConstruccion.limpiar();
            return construirHacha(FUERZA_HACHA_PIEDRA, DURABILIDAD_HACHA_PIEDRA, desgaste, piedra);
        }
        else{
            throw new ImposibleConstruirHerramientaException();
        }
    }

    public Herramienta construirHachaDeMetal(Mesa mesaDeConstruccion) {
        if(mesaDeConstruccion.estructuraHachaMetal()){
            Desgaste desgaste = new DesgasteMitadDeFuerza(DURABILIDAD_HACHA_METAL, FUERZA_HACHA_METAL);
            Material metal = new Metal();
            mesaDeConstruccion.limpiar();
            return construirHacha(FUERZA_HACHA_METAL, DURABILIDAD_HACHA_METAL, desgaste, metal);
        }
        else{
            throw new ImposibleConstruirHerramientaException();
        }

    }

    public Herramienta construirPicoDeMadera(Mesa mesaDeConstruccion) {
        if(mesaDeConstruccion.estructuraPicoMadera()){
            Desgaste desgaste = new DesgasteLinealPorFuerza(DURABILIDAD_PICO_MADERA, FUERZA_PICO_MADERA);
            Material madera = new Madera();
            mesaDeConstruccion.limpiar();
            return construirPico(FUERZA_PICO_MADERA, DURABILIDAD_PICO_MADERA, desgaste, madera);
        }
        else{
            throw new ImposibleConstruirHerramientaException();
        }

    }

    public Herramienta construirPicoDePiedra(Mesa mesaDeConstruccion) {
        if(mesaDeConstruccion.estructuraPicoPiedra()){
            Desgaste desgaste = new DesgastePorFuerzaDivididoUnoComaCinco(DURABILIDAD_PICO_PIEDRA, FUERZA_PICO_PIEDRA);
            Material piedra = new Piedra();
            mesaDeConstruccion.limpiar();
            return construirPico(FUERZA_PICO_PIEDRA, DURABILIDAD_PICO_PIEDRA, desgaste, piedra);
        }
        else{
            throw new ImposibleConstruirHerramientaException();
        }

    }

    public Herramienta construirPicoDeMetal(Mesa mesaDeConstruccion) {
        if(mesaDeConstruccion.estructuraPicoMetal()){
            Desgaste desgaste = new DesgasteAbrupto(DURABILIDAD_PICO_METAL, 10);
            Material metal = new Metal();
            mesaDeConstruccion.limpiar();
            return construirPico(FUERZA_PICO_METAL, DURABILIDAD_PICO_METAL, desgaste, metal);
        }
        else{
            throw new ImposibleConstruirHerramientaException();
        }

    }

    public Herramienta construirPicoFino(Mesa mesaDeConstruccion) {
        if(mesaDeConstruccion.estructuraPicoFino()){
            Herramienta picoFino = new PicoFino();
            mesaDeConstruccion.limpiar();
            return picoFino;
        }
        else{
            throw new ImposibleConstruirHerramientaException();
        }

    }
}
