package fiuba.algo3.tp2;

public class Madera extends Material{
    public Madera() { durabilidad = 10;}

    @Override
    public void recibirGolpe(Herramienta herramienta){
        herramienta.golpearMadera(this);
    }
}
