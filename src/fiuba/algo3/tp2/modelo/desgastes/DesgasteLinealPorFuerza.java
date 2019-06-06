package fiuba.algo3.tp2.desgastes;

public class DesgasteLinealPorFuerza extends Desgaste{

    private int fuerza;

    public DesgasteLinealPorFuerza(int durabilidadInicial, int fuerza) {
        this.durabilidad = durabilidadInicial;
        this.fuerza = fuerza;
    }

    @Override
    public void usar() {
        if (durabilidad <= 0) throw new NoPoseeDurabilidadException();
        durabilidad-= this.fuerza;
    }


}
