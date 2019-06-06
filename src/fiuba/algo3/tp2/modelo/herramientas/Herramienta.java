package fiuba.algo3.tp2.herramientas;

import fiuba.algo3.tp2.desgastes.Desgaste;
import fiuba.algo3.tp2.materiales.Material;

public abstract class Herramienta {

    protected float durabilidad;
    protected int fuerza;
    protected Desgaste desgaste;

    public float getDurabilidad() {
        return desgaste.getDurabilidad();
    }

    public int getFuerza() {
        return fuerza;
    }

    public void golpearMadera(Material bloque) {
        desgaste.usar();
    }

    public void golpearPiedra(Material bloque) {
        desgaste.usar();
    }

    public void golpearMetal(Material bloque) {
        desgaste.usar();
    }

    public void golpearDiamante(Material bloque) {
        desgaste.usar();
    }

}
