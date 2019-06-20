package fiuba.algo3.tp2.modelo.mapa;
import fiuba.algo3.tp2.modelo.materiales.bloques.*;

import java.util.HashMap;

public class InicializarMateriales {

    private final int DIMENSION_MAPA = 30;
    private final int CANTIDAD_MADERA = 150;
    private final int CANTIDAD_PIEDRA = 100;
    private final int CANTIDAD_METAL = 50;
    private final int CANTIDAD_DIAMANTE = 25;

    public void inicializacionMateriales(HashMap<Posicion, Casillero> casilleros) {

        //  Madera

        inicializarMaterial(new Madera(), casilleros, 1,10,4,4);
        inicializarMaterial(new Madera(), casilleros, 6,16,4,4);
        inicializarMaterial(new Madera(), casilleros, 2,25,4,4);
        inicializarMaterial(new Madera(), casilleros, 26,26,4,4);
        inicializarMaterial(new Madera(), casilleros, 12,3,4,4);
        inicializarMaterial(new Madera(), casilleros, 15,25,4,4);
        inicializarMaterial(new Madera(), casilleros, 21,20,4,4);
        inicializarMaterial(new Madera(), casilleros, 23,1,4,4);
        inicializarMaterial(new Madera(), casilleros, 1,2,4,4);
        inicializarMaterial(new Madera(), casilleros, 18,12,4,4);

        //  Piedra

        inicializarMaterial(new Piedra(), casilleros,18,7,4,3);
        inicializarMaterial(new Piedra(), casilleros,6,0,4,3);
        inicializarMaterial(new Piedra(), casilleros,8,9,4,3);
        inicializarMaterial(new Piedra(), casilleros,25,14,4,3);
        inicializarMaterial(new Piedra(), casilleros,1,21,4,3);
        inicializarMaterial(new Piedra(), casilleros,11,18,4,3);
        inicializarMaterial(new Piedra(), casilleros,10,27,4,3);
        inicializarMaterial(new Piedra(), casilleros,21,25,4,3);

        //  Metal

        inicializarMaterial(new Metal(), casilleros,12,0,2,2);
        inicializarMaterial(new Metal(), casilleros,18,3,2,2);
        inicializarMaterial(new Metal(), casilleros,2,7,2,2);
        inicializarMaterial(new Metal(), casilleros,25,8,2,2);
        inicializarMaterial(new Metal(), casilleros,13,9,2,2);
        inicializarMaterial(new Metal(), casilleros,1,16,2,2);
        inicializarMaterial(new Metal(), casilleros,18,17,2,2);
        inicializarMaterial(new Metal(), casilleros,6,21,2,2);
        inicializarMaterial(new Metal(), casilleros,13,22,2,2);
        inicializarMaterial(new Metal(), casilleros,26,21,2,2);
        inicializarMaterial(new Metal(), casilleros,28,0,2,2);
        inicializarMaterial(new Metal(), casilleros,7,5,2,2);

        //  Diamante

        inicializarMaterial(new Diamante(), casilleros,16,0,2,1);
        inicializarMaterial(new Diamante(), casilleros,28,3,2,1);
        inicializarMaterial(new Diamante(), casilleros,26,11,2,1);
        inicializarMaterial(new Diamante(), casilleros,27,19,2,1);
        inicializarMaterial(new Diamante(), casilleros,7,25,2,1);
        inicializarMaterial(new Diamante(), casilleros,1,19,2,1);
        inicializarMaterial(new Diamante(), casilleros,17,21,2,1);
        inicializarMaterial(new Diamante(), casilleros,5,8,2,1);
        inicializarMaterial(new Diamante(), casilleros,23,6,2,1);

    }



    private void inicializarMaterial(Material material, HashMap<Posicion, Casillero> casilleros, int fila, int columna, int cantidadFilas, int cantidadColumnas){
        int hastaFila = fila + cantidadFilas;
        int hastaColumna = columna + cantidadColumnas;

        for(int i = fila; i<=hastaFila; i++){
            for(int j = columna; j<=hastaColumna; j++){
                Posicion posicion = new Posicion(i, j);
                casilleros.get(posicion).ocupar(material);
            }
        }
    }

}



