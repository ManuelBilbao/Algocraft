package fiuba.algo3.tp2.modelo.desgastes;

public class DesgasteMitadDeFuerza extends Desgaste{

    private int fuerza;

    public DesgasteMitadDeFuerza(int durabilidadInicial, int fuerza) {
        this.durabilidad = durabilidadInicial;
        this.fuerza = fuerza;
    }

    @Override
    public void usar() {
        if (durabilidad <= 0) throw new NoPoseeDurabilidadException();
        durabilidad-= (this.fuerza/2);
    }



}
