package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.desgastes.Desgaste;
import fiuba.algo3.tp2.modelo.materiales.herramientas.Material;

public class Pico extends Herramienta {

    public Pico(int fuerza, float durabilidad, Desgaste desgaste, Material material) {
        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
        this.desgaste = desgaste;
        this.material = material;
    }

    @Override
    public void golpearPiedra(fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque) {
        super.golpearPiedra(bloque);
        material.enviarGolpeAPiedra(bloque, fuerza);
    }

    @Override
    public void golpearMetal(fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque) {
        super.golpearMetal(bloque);
        material.enviarGolpeAMetal(bloque, fuerza);
    }

    @Override
    public String toString(){ return "hacha" + "De" + material.toString(); }

}
