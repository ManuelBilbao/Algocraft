package fiuba.algo3.tp2;

public class PicoFino extends Herramienta {

    public PicoFino() {
        this.durabilidad = 1000;
        this.fuerza = 20;
        this.desgaste = new DesgastePorcentual(1000);
    }

    @Override
    public void golpearDiamante(Diamante bloque) {
        super.golpearDiamante(bloque);
        bloque.desgastar(fuerza);
    }
}
