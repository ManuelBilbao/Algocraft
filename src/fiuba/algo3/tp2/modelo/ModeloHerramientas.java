package fiuba.algo3.tp2.modelo;

import fiuba.algo3.tp2.modelo.construccionDeHerramientas.Mesa;
import fiuba.algo3.tp2.modelo.mapa.Casillero;
import fiuba.algo3.tp2.modelo.mapa.Posicion;
import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;
import fiuba.algo3.tp2.modelo.materiales.bloques.Material;
import fiuba.algo3.tp2.modelo.materiales.bloques.Metal;
import fiuba.algo3.tp2.modelo.materiales.bloques.Piedra;

import java.util.HashMap;

public class ModeloHerramientas {

    private static Mesa setearMesaParaHerramienta() {
        Mesa mesa = new Mesa();
        mesa.posicionar(new Madera(), 1,1);
        mesa.posicionar(new Madera(), 2,1);

        return mesa;
    }

    private static HashMap<Posicion, Casillero> setearMesaParaHacha(Material material) {
        Mesa mesa = setearMesaParaHerramienta();
        mesa.posicionar(material, 0,0);
        mesa.posicionar(material, 0,1);
        mesa.posicionar(material, 1,0);

        return mesa.getMesa();
    }

    private static HashMap<Posicion, Casillero> setearMesaParaPico(Material material) {
        Mesa mesa = setearMesaParaHerramienta();
        mesa.posicionar(material, 0,0);
        mesa.posicionar(material, 0,1);
        mesa.posicionar(material, 0,2);

        return mesa.getMesa();
    }

    private static HashMap<Posicion, Casillero> setearMesaParaPicoFino() {
        Mesa mesa = setearMesaParaHerramienta();
        mesa.posicionar(new Metal(), 0,0);
        mesa.posicionar(new Metal(), 0,1);
        mesa.posicionar(new Metal(), 0,2);
        mesa.posicionar(new Piedra(), 1, 0);

        return mesa.getMesa();
    }

    public static HashMap<Posicion, Casillero> getModeloHachaMadera() {
        return setearMesaParaHacha(new Madera());
    }

    public static HashMap<Posicion, Casillero> getModeloHachaPiedra() {
        return setearMesaParaHacha(new Piedra());
    }

    public static HashMap<Posicion, Casillero> getModeloHachaMetal() {
        return setearMesaParaHacha(new Metal());
    }

    public static HashMap<Posicion, Casillero> getModeloPicoMadera() {
        return setearMesaParaPico(new Madera());
    }

    public static HashMap<Posicion, Casillero> getModeloPicoPiedra() {
        return setearMesaParaPico(new Piedra());
    }

    public static HashMap<Posicion, Casillero> getModeloPicoMetal() { return setearMesaParaPico(new Metal()); }

    public static HashMap<Posicion, Casillero> getModeloPicoFino() { return setearMesaParaPicoFino(); }

}
