package fiuba.algo3.tp2;

public abstract class Desgaste {

    protected int durabilidad;

    public int getDurabilidad() {
        return durabilidad;
    }

    public abstract void usar();
}