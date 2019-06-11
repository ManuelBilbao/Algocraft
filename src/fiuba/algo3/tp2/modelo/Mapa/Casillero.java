package fiuba.algo3.tp2.modelo.Mapa;


public class Casillero {
    public Object contenido;
    private EstadoCasillero estadoCasillero;

    public void Casillero(){
        this.estadoCasillero = new CasilleroLibre();
        this.contenido = null;
    }

    public void setEstadoCasillero(EstadoCasillero estado){
        this.estadoCasillero = estado;
    }

    public void setContenido(Object contenido){
        this.contenido = contenido;
    }

    public Object getContenido(){ return contenido;}

    public void ocupar(Object elemento){
        estadoCasillero.ocupar(this ,  elemento);
    }
}
