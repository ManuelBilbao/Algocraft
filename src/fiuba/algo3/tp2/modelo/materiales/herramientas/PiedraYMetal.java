package fiuba.algo3.tp2.modelo.materiales.herramientas;

public class PiedraYMetal extends Material {

    @Override
    public void enviarGolpeADiamante(fiuba.algo3.tp2.modelo.materiales.bloques.Material material, int fuerza) {
        material.recibirGolpe(fuerza);
    }
}
