package fiuba.algo3.tp2;

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
