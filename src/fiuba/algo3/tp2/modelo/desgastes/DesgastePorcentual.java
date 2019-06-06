package fiuba.algo3.tp2.modelo.desgastes;

public class DesgastePorcentual extends Desgaste {

    public DesgastePorcentual(int durabilidadInicial) {
        this.durabilidad = durabilidadInicial;
    }

    @Override
    public void usar() {
        if (durabilidad <= 0) throw new NoPoseeDurabilidadException();
        durabilidad-= (this.durabilidad*0.1);
    }


}
