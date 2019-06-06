package fiuba.algo3.tp2;

public class Pico extends Herramienta {

    public Pico(int fuerza, float durabilidad, Desgaste desgaste) {
        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
        this.desgaste = desgaste;
    }

    @Override
    public void golpearPiedra(Material bloque) {
        super.golpearPiedra(bloque);
        bloque.desgastar(fuerza)
;    }
}
