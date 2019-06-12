package fiuba.algo3.tp2.modelo.Mapa;


public class Casillero {
    private Object contenido;
    private EstadoCasillero estadoCasillero;
    private Posicion posicion;

    public Casillero(Integer fila, Integer columna){
        this.posicion = new Posicion(fila,columna);
        this.estadoCasillero = new CasilleroLibre();
        this.contenido = null;
    }

    public Posicion getPosicion(){ return posicion;}

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

    public void liberar() {
        this.contenido = null;
        setEstadoCasillero(new CasilleroLibre());
    }
}
