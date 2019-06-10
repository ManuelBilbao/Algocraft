package fiuba.algo3.tp2.modelo.herramientas;

import fiuba.algo3.tp2.modelo.desgastes.Desgaste;
import fiuba.algo3.tp2.modelo.materiales.herramientas.Material;

public class Hacha extends Herramienta {

    public Hacha(int fuerza, float durabilidad, Desgaste desgaste, Material material) {
        this.fuerza = fuerza;
        this.durabilidad = durabilidad;
        this.desgaste = desgaste;
        this.material = material;
    }

    @Override
    public void golpearMadera(fiuba.algo3.tp2.modelo.materiales.bloques.Material bloque) {
        super.golpearMadera(bloque);
        material.enviarGolpeAMadera(bloque, fuerza);
    }
}
