package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.desgastes.Desgaste;
import fiuba.algo3.tp2.modelo.materiales.herramientas.Material;

public abstract class Herramienta {

    protected float durabilidad;
    protected int fuerza;
    protected Desgaste desgaste;
    protected Material material;

    public float getDurabilidad() {
        return desgaste.getDurabilidad();
    }

    public int getFuerza() {
        return fuerza;
    }

    public void golpearMadera(fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque) {
        desgaste.usar();
    }

    public void golpearPiedra(fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque) {
        desgaste.usar();
    }

    public void golpearMetal(fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque) {
        desgaste.usar();
    }

    public void golpearDiamante(fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque) {
        desgaste.usar();
    }

    public String toString(){ return "null";};

}
