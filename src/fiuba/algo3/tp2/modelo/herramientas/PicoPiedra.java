package fiuba.algo3.tp2.herramientas;

import fiuba.algo3.tp2.desgastes.Desgaste;
import fiuba.algo3.tp2.materiales.Material;

public class PicoPiedra extends Pico {

    public PicoPiedra(int fuerza, float durabilidad, Desgaste desgaste) {
        super(fuerza, durabilidad, desgaste);
    }

    @Override
    public void golpearMetal(Material bloque) {
        super.golpearMetal(bloque);
        bloque.recibirGolpe(this.getFuerza());
    }
}
