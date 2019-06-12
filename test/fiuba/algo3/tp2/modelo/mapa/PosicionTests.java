package fiuba.algo3.tp2.modelo.mapa;

import fiuba.algo3.tp2.modelo.Mapa.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PosicionTests {

    @Test
    public void inicializacionPosicionConFila1YColumna2(){
        Posicion posicion = new Posicion(1,2);

        assertEquals(posicion.getFila(),1);
        assertEquals(posicion.getColumna(),2);

    }
}
