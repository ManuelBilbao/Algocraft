package fiuba.algo3.tp2.modelo.Mapa;


public class Casillero {
    public Object contenido;
    private EstadoCasillero estadoCasillero;
    private Integer fila;
    private Integer columna;

    public Casillero(Integer fila, Integer columna){
        this.fila = fila;
        this.columna = columna;
        this.estadoCasillero = new CasilleroLibre();
        this.contenido = null;
    }

    public Integer getFila(){ return fila;}

    public Integer getColumna(){ return columna;}

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
