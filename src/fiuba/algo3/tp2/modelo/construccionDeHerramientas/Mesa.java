package fiuba.algo3.tp2.modelo.construccionDeHerramientas;

import fiuba.algo3.tp2.modelo.mapa.*;


public class Mesa {

    private Casillero[][] casilleros = new Casillero[3][3];

    public Mesa(){
        for (int fila = 0; fila <= 2; fila++) {
            for(int col = 0; col<= 2; col++){
                this.casilleros[fila][col] = new Casillero(fila,col);
            }
        }
    }

    public Casillero[][] getMesa(){
        return casilleros;
    }

    public Casillero getCasillero(Integer fila, Integer columna){
        return casilleros[fila][columna];
    }

    public void posicionar(Object elemento, int fila, int columna){
        casilleros[fila][columna].ocupar(elemento);
    }

    public void limpiar() {
        for (int fila = 0; fila <= 2; fila++) {
            for(int col = 0; col<= 2; col++){
                this.casilleros[fila][col] = new Casillero(fila,col);
            }
        }
    }

    public boolean estructuraHachaMadera(){
         return (casilleros[0][0].getContenido() == "madera") && (casilleros[0][1].getContenido() == "madera") &&
                 (casilleros[1][1].getContenido() == "madera") && (casilleros[1][0].getContenido() == "madera") &&
                 (casilleros[2][1].getContenido() == "madera");

    }
    public boolean estructuraHachaPiedra(){
        return (casilleros[0][0].getContenido() == "piedra") && (casilleros[0][1].getContenido() == "piedra") &&
                (casilleros[1][1].getContenido() == "madera") && (casilleros[1][0].getContenido() == "piedra") &&
                (casilleros[2][1].getContenido() == "madera");

    }

    public boolean estructuraHachaMetal(){
        return (casilleros[0][0].getContenido() == "metal") && (casilleros[0][1].getContenido() == "metal") &&
                (casilleros[1][1].getContenido() == "madera") && (casilleros[1][0].getContenido() == "metal") &&
                (casilleros[2][1].getContenido() == "madera");

    }

    public boolean estructuraPicoMadera(){
        return (casilleros[0][0].getContenido() == "madera") && (casilleros[0][1].getContenido() == "madera") &&
                (casilleros[1][1].getContenido() == "madera") && (casilleros[0][2].getContenido() == "madera") &&
                (casilleros[2][1].getContenido() == "madera");

    }


    public boolean estructuraPicoMetal(){
        return (casilleros[0][0].getContenido() == "metal") && (casilleros[0][1].getContenido() == "metal") &&
                (casilleros[1][1].getContenido() == "madera") && (casilleros[0][2].getContenido() == "metal") &&
                (casilleros[2][1].getContenido() == "madera");

    }


    public boolean estructuraPicoPiedra(){
        return (casilleros[0][0].getContenido() == "piedra") && (casilleros[0][1].getContenido() == "piedra") &&
                (casilleros[1][1].getContenido() == "madera") && (casilleros[0][2].getContenido() == "piedra") &&
                (casilleros[2][1].getContenido() == "madera");

    }

    public boolean estructuraPicoFino(){
        return (casilleros[0][0].getContenido() == "metal") && (casilleros[0][1].getContenido() == "metal") &&
                (casilleros[1][1].getContenido() == "madera") && (casilleros[1][0].getContenido() == "piedra") &&
                (casilleros[2][1].getContenido() == "madera") && (casilleros[0][2].getContenido() == "metal");

    }



}


