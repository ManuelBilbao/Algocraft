package fiuba.algo3.tp2;

public class DesgastePorFuerzaDivididoUnoComaCinco extends Desgaste{

    private int fuerza;

    public DesgastePorFuerzaDivididoUnoComaCinco(int durabilidadInicial, int fuerza) {
        this.durabilidad = durabilidadInicial;
        this.fuerza = fuerza;
    }

    @Override
    public void usar() {
        durabilidad-= (this.fuerza/1.5);
    }



}
