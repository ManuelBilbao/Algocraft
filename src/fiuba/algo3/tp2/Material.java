package fiuba.algo3.tp2;

public class Material {
    protected int durabilidad;

    public int getDurabilidad() {
        return durabilidad;
    }

    public void desgastar(int fuerza) {
        durabilidad = durabilidad - fuerza;
    }
}
