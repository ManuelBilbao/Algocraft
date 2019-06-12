package fiuba.algo3.tp2.modelo;

import fiuba.algo3.tp2.modelo.construccionDeHerramientas.*;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.inventario.Inventario;

public class Jugador {

    private Constructor constructor = new Constructor();
    private Inventario inventarioHerramientas = new Inventario();
    private Inventario inventarioMateriales = new Inventario();
    private Mesa mesaDeConstruccion = new Mesa();

    public Jugador() {
        inventarioHerramientas.agregar("hachaDeMadera", this.construirHachaDeMadera());
    }

    public Inventario getInventarioHerramientas() {
        return inventarioHerramientas;
    }

    public Inventario getInventarioMateriales() {
        return inventarioMateriales;
    }

    public int cantidadDeHerramienta(String herramienta) {
        return inventarioHerramientas.cantidadDe(herramienta);
    }

    public int cantidadDeMaterial(String material) {
        return inventarioHerramientas.cantidadDe(material);
    }

    public boolean inventarioVacio(Inventario inventario) {
        return inventario.vacio();
    }

    public void agregarElementoALaMesaDeConstruccion(Object elemento, int fila, int columna) {
        mesaDeConstruccion.posicionar(elemento, fila, columna);
    }

    public Mesa getMesaDeConstruccion(){
        return mesaDeConstruccion;
    }

    public Herramienta construirHachaDeMadera() {
        return constructor.construirHachaDeMadera();

    }

    public Herramienta construirHachaDePiedra() {
        return constructor.construirHachaDePiedra();

    }

    public Herramienta construirHachaDeMetal() {
        return constructor.construirHachaDeMetal();
    }

    public Herramienta construirPicoDeMadera() {
        return constructor.construirPicoDeMadera();
    }

    public Herramienta construirPicoDePiedra() {
        return constructor.construirPicoDePiedra();
    }

    public Herramienta construirPicoDeMetal() {
        return constructor.construirPicoDeMetal();
    }

    public Herramienta construirPicoFino() {
        return constructor.construirPicoFino();
    }
}
