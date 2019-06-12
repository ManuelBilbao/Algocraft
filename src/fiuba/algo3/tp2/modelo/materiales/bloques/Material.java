package fiuba.algo3.tp2.modelo.materiales.bloques;

import fiuba.algo3.tp2.modelo.desgastes.NoPoseeDurabilidadException;

public abstract class   Material {
    protected int durabilidad;

    public int getDurabilidad() { return durabilidad; }

    public void recibirGolpe(int fuerza) {
        if (durabilidad <= 0) throw new NoPoseeDurabilidadException();
        durabilidad = durabilidad - fuerza;
    }
}
