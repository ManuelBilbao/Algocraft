package fiuba.algo3.tp2;

public class DesgasteMitadDeFuerza extends Desgaste{

    private int fuerza;

    public DesgasteMitadDeFuerza(int durabilidadInicial, int fuerza) {
        this.durabilidad = durabilidadInicial;
        this.fuerza = fuerza;
    }

    @Override
    public void usar() {
        durabilidad-= (this.fuerza/2);
    }



}
