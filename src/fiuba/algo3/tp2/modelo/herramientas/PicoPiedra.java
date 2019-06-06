package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.desgastes.Desgaste;
import fiuba.algo3.tp2.modelo.materiales.Material;

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
