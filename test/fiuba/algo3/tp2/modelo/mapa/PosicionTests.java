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

    @Test
    public void moverPosicionArriba(){

        Posicion posicion = new Posicion(1,2);
        posicion.moverArriba();
        assertEquals(posicion.getFila(),0);
        assertEquals(posicion.getColumna(),2);

    }

    @Test
    public void moverPosicionAbajo(){

        Posicion posicion = new Posicion(1,2);
        posicion.moverAbajo();
        assertEquals(posicion.getFila(),2);
        assertEquals(posicion.getColumna(),2);

    }

    @Test
    public void moverPosicionDerecha(){

        Posicion posicion = new Posicion(1,2);
        posicion.moverDerecha();
        assertEquals(posicion.getFila(),1);
        assertEquals(posicion.getColumna(),3);

    }

    @Test
    public void moverPosicionIzquierda(){

        Posicion posicion = new Posicion(1,2);
        posicion.moverIzquierda();
        assertEquals(posicion.getFila(),1);
        assertEquals(posicion.getColumna(),1);

    }
}
