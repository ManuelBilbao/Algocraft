package fiuba.algo3.tp2;

public class DesgastePorcentual extends Desgaste {

    public DesgastePorcentual(int durabilidadInicial) {
        this.durabilidad = durabilidadInicial;
    }

    @Override
    public void usar() {
        durabilidad-= (this.durabilidad*0.1);
    }


}
