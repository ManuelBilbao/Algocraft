package fiuba.algo3.tp2;

public abstract class Herramienta {

    protected int durabilidad;
    protected int fuerza;
    protected Desgaste desgaste;

    public int getDurabilidad() {
        return durabilidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void golpearMadera(Madera bloque) {
        desgaste.usar();
    }

    public void golpearPiedra(Piedra bloque) {
        desgaste.usar();
    }

    public void golpearMetal(Metal bloque) {
        desgaste.usar();
    }

    public void golpearDiamante(Diamante bloque) {
        desgaste.usar();
    }
}
