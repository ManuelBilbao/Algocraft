package fiuba.algo3.tp2.herramientas;

import fiuba.algo3.tp2.desgastes.Desgaste;
import fiuba.algo3.tp2.materiales.Material;

public class Pico extends Herramienta {

    public Pico(int fuerza, float durabilidad, Desgaste desgaste) {
        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
        this.desgaste = desgaste;
    }

    @Override
    public void golpearPiedra(Material bloque) {
        super.golpearPiedra(bloque);
        bloque.recibirGolpe(fuerza);
;    }
}
