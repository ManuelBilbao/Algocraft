package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.desgastes.Desgaste;
import fiuba.algo3.tp2.modelo.materiales.Material;

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
