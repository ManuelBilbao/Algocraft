package fiuba.algo3.tp2.herramientas;

import fiuba.algo3.tp2.desgastes.Desgaste;
import fiuba.algo3.tp2.materiales.Material;

public class Hacha extends Herramienta {

    public Hacha(int fuerza, float durabilidad, Desgaste desgaste) {
        this.fuerza = fuerza;
        this.durabilidad = durabilidad;
        this.desgaste = desgaste;
    }

    @Override
    public void golpearMadera(Material bloque) {
        super.golpearMadera(bloque);
        bloque.recibirGolpe(fuerza);
    }
}
