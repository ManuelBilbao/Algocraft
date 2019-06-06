package fiuba.algo3.tp2;

public class Hacha extends Herramienta {

    public Hacha(int fuerza, int durabilidad, Desgaste desgaste) {
        this.fuerza = fuerza;
        this.durabilidad = durabilidad;
        this.desgaste = desgaste;
    }

    @Override
    public void golpearMadera(Madera bloque) {
        super.golpearMadera(bloque);
        bloque.desgastar(fuerza);
    }
}
