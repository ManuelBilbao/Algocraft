package fiuba.algo3.tp2;

public class Piedra extends Material {
    public Piedra() { durabilidad = 30; }

    @Override
    public void recibirGolpe(Herramienta herramienta){
        herramienta.golpearPiedra(this);
    }
}
