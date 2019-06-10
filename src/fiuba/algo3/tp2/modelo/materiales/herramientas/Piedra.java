package fiuba.algo3.tp2.modelo.materiales.herramientas;

public class Piedra extends Material {

    @Override
    public void enviarGolpeAMadera(fiuba.algo3.tp2.modelo.materiales.bloques.Material material, int fuerza) {
        material.recibirGolpe(fuerza);
    }

    @Override
    public void enviarGolpeAPiedra(fiuba.algo3.tp2.modelo.materiales.bloques.Material material, int fuerza) {
        material.recibirGolpe(fuerza);
    }

    @Override
    public void enviarGolpeAMetal(fiuba.algo3.tp2.modelo.materiales.bloques.Material material, int fuerza) {
        material.recibirGolpe(fuerza);
    }

}
