package fiuba.algo3.tp2.modelo.Mapa;

public class CasilleroLibre extends EstadoCasillero {

    @Override
    public void ocupar(Casillero casillero, Object elemento){
        casillero.setEstadoCasillero(new CasilleroOcupado());
        casillero.setContenido(elemento);

    }

}
