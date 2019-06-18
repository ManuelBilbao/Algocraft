package fiuba.algo3.tp2.modelo.construccionDeHerramientas;

import fiuba.algo3.tp2.modelo.mapa.*;

import java.util.HashMap;

import static fiuba.algo3.tp2.modelo.ModeloHerramientas.*;


public class Mesa {

    private HashMap<Posicion, Casillero> casilleros = new HashMap<>();

    public Mesa() {
        inicializar();
    }

    private void inicializar() {
        for (int fila = 0; fila <= 2; fila++) {
            for(int col = 0; col<= 2; col++){
                casilleros.put(new Posicion(fila, col), new Casillero());
            }
        }
    }

    public HashMap<Posicion, Casillero> getMesa(){
        return casilleros;
    }

    public Casillero getCasillero(Integer fila, Integer columna){
        return casilleros.get(new Posicion(fila, columna));
    }

    public void posicionar(Object elemento, int fila, int columna){
        casilleros.get(new Posicion(fila, columna)).ocupar(elemento);
    }

    public void limpiar() {
        casilleros.clear();
        inicializar();
    }

    public boolean estructuraHachaMadera(){
         return casilleros.equals(getModeloHachaMadera());

    }
    public boolean estructuraHachaPiedra() {
        return casilleros.equals(getModeloHachaPiedra());
    }

    public boolean estructuraHachaMetal(){
        return casilleros.equals(getModeloHachaMetal());
    }

    public boolean estructuraPicoMadera(){
        return casilleros.equals(getModeloPicoMadera());
    }


    public boolean estructuraPicoMetal(){
        return casilleros.equals(getModeloPicoMetal());
    }


    public boolean estructuraPicoPiedra(){
        return casilleros.equals(getModeloPicoPiedra());
    }

    public boolean estructuraPicoFino(){
        return casilleros.equals(getModeloPicoFino());
    }



}


