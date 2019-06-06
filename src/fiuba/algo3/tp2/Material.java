package fiuba.algo3.tp2;

public abstract class Material {
    protected int durabilidad;

    public int getDurabilidad() { return durabilidad; }

    public abstract void recibirGolpe(Herramienta herramienta);

    public void desgastar(int fuerza) {
        if (durabilidad <= 0) throw new NoPoseeDurabilidadException();
        durabilidad = durabilidad - fuerza;
    }
}
