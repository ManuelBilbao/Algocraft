package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.desgastes.DesgastePorcentual;
import fiuba.algo3.tp2.modelo.materiales.bloques.Material;
import fiuba.algo3.tp2.modelo.materiales.herramientas.PiedraYMetal;

public class PicoFino extends Herramienta {

    public PicoFino() {
        this.durabilidad = 1000;
        this.fuerza = 20;
        this.desgaste = new DesgastePorcentual(1000);
        this.material = new PiedraYMetal();
    }

    @Override
    public void golpearMadera(Material bloque) {

    }

    @Override
    public void golpearMetal(Material bloque) {

    }

    @Override
    public void golpearPiedra(Material bloque) {

    }

    @Override
    public void golpearDiamante(Material bloque) {
        super.golpearDiamante(bloque);
        material.enviarGolpeADiamante(bloque, fuerza);
    }

    @Override
    public String toString(){ return "picoFino" + "De" + material.toString(); }

}
