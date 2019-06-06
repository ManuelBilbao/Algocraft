package fiuba.algo3.tp2;

public class Pico extends Herramienta {

    public Pico(int fuerza, int durabilidad, Desgaste desgaste) {
        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
        this.desgaste = desgaste;
    }

    @Override
    public void golpearPiedra(Piedra bloque) {
        super.golpearPiedra(bloque);
        bloque.desgastar(fuerza)
;    }
}
