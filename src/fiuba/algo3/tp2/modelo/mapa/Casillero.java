package fiuba.algo3.tp2.modelo.mapa;


import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;

public class Casillero {
    private Object contenido;
    private EstadoCasillero estadoCasillero;
    private Posicion posicion;

    public Casillero(Integer fila, Integer columna){
        this.posicion = new Posicion(fila,columna);
        this.estadoCasillero = new CasilleroLibre();
        this.contenido = null;
    }

    public Casillero() {
        this.estadoCasillero = new CasilleroLibre();
        this.contenido = null;
    }

    public Casillero(Object elemento) {
        this.estadoCasillero = new CasilleroOcupado();
        this.contenido = elemento;
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

    @Override
    public boolean equals(Object obj) {
        Casillero casillero = (Casillero)obj;

        if (casillero.getContenido() == null && contenido == null) return true;
        else if (casillero.getContenido() == null || contenido == null) return false;

        return casillero.getContenido().getClass() == contenido.getClass();
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
