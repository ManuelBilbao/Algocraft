package fiuba.algo3.tp2.modelo.desgastes;

public abstract class Desgaste {

    protected float durabilidad;

    public float getDurabilidad() {
        return durabilidad;
    }

    public abstract void usar();

}