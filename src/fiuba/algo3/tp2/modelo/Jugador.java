package fiuba.algo3.tp2.modelo;

import fiuba.algo3.tp2.modelo.construccionDeHerramientas.*;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;

public class Jugador {

    private Constructor constructor = new Constructor();
    private Inventario inventarioHerramientas = new Inventario();
    private Inventario inventarioMateriales = new Inventario();
    private Mesa mesaDeConstruccion = new Mesa();

    public Jugador() {
        agregarElementoALaMesaDeConstruccion(new Madera(),0,0);
        agregarElementoALaMesaDeConstruccion(new Madera(),0,1);
        agregarElementoALaMesaDeConstruccion(new Madera(),1,0);
        agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        agregarElementoALaMesaDeConstruccion(new Madera(),2,1);
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

    public void vaciarMesaDeConstruccion(){
        mesaDeConstruccion.limpiar();
    }

    public Mesa getMesaDeConstruccion(){
        return mesaDeConstruccion;
    }

    public Herramienta construirHachaDeMadera() {
        return constructor.construirHachaDeMadera(this.mesaDeConstruccion);

    }

    public Herramienta construirHachaDePiedra() {
        return constructor.construirHachaDePiedra(this.mesaDeConstruccion);

    }

    public Herramienta construirHachaDeMetal() {
        return constructor.construirHachaDeMetal(this.mesaDeConstruccion);
    }

    public Herramienta construirPicoDeMadera() {
        return constructor.construirPicoDeMadera(this.mesaDeConstruccion);
    }

    public Herramienta construirPicoDePiedra() {
        return constructor.construirPicoDePiedra(this.mesaDeConstruccion);
    }

    public Herramienta construirPicoDeMetal() {
        return constructor.construirPicoDeMetal(this.mesaDeConstruccion);
    }

    public Herramienta construirPicoFino() {
        return constructor.construirPicoFino(this.mesaDeConstruccion);
    }
}
