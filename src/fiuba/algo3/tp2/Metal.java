package fiuba.algo3.tp2;

public class Metal extends Material {
    public Metal() { durabilidad = 50; }

    @Override
    public void recibirGolpe(Herramienta herramienta){
        herramienta.golpearMetal(this);
    }
}
