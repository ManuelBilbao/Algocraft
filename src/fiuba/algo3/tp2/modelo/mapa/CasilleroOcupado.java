package fiuba.algo3.tp2.modelo.mapa;

public class CasilleroOcupado extends EstadoCasillero {

    @Override
    public void ocupar(Casillero casillero, Object elemento){
        throw new CasilleroOcupadoException();
    }
}
