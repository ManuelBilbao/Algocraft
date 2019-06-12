package fiuba.algo3.tp2.modelo.mapa;

import fiuba.algo3.tp2.modelo.Mapa.Casillero;
import fiuba.algo3.tp2.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapaTests {

    @Test
    public void creacionMapaCasillerosLibres(){
        Mapa mapa = new Mapa();
        Casillero casillero;

        for (int fila = 0; fila <= 30; fila++) {
            for (int col = 0; col <= 30; col++) {
                casillero = mapa.getCasillero(fila, col);
                assertEquals(null, casillero.getContenido());
            }
        }
    }


    @Test
    public void creacionMapaConMateriales(){
        Mapa mapa = new Mapa();
        Casillero casillero;

        mapa.inicializacionMateriales();

        for (int fila = 0; fila <= 30; fila++) {
            for (int col = 0; col <= 30; col++) {
                casillero = mapa.getCasillero(fila, col);
                System.out.println(casillero.getContenido());
                System.out.println(" - ");
                //assertEquals("madera", casillero.getContenido());
            }
        }
    }




}
