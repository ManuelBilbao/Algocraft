package fiuba.algo3.tp2;

public class Diamante extends Material {
    public Diamante() { durabilidad = 100; }

    @Override
    public void recibirGolpe(Herramienta herramienta){
        herramienta.golpearDiamante(this);
    }
}
