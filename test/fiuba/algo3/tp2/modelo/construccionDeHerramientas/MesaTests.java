package fiuba.algo3.tp2.modelo.construccionDeHerramientas;

import fiuba.algo3.tp2.modelo.mapa.Casillero;
import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;
import fiuba.algo3.tp2.modelo.materiales.bloques.Metal;
import fiuba.algo3.tp2.modelo.materiales.bloques.Piedra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class MesaTests {


    @Test
    public void creacionMesaCompletamenteLibre(){
        Mesa mesa = new Mesa();
        Casillero casillero;

        for (int fila = 0; fila <= 2; fila++) {
            for (int col = 0; col <= 2; col++) {
                casillero = mesa.getCasillero(fila, col);
                assertEquals(null, casillero.getContenido());
            }
        }
    }

    @Test
    public void posicionarElemento(){
        Mesa mesa = new Mesa();
        mesa.posicionar("madera", 1,1);
        assertEquals("madera", mesa.getCasillero(1,1).getContenido());
    }

    @Test
    public void volverATenerLaMesaCompletamenteVacia(){
        Mesa mesa = new Mesa();
        mesa.posicionar("madera", 1,1);
        mesa.limpiar();
        assertEquals(null, mesa.getCasillero(1,1).getContenido());
    }

    @Test
    public void posicionaElementosParaConstruirLaEstructuraDelPicoDeMadera(){
        Mesa mesa = new Mesa();
        mesa.posicionar(new Madera(), 0,0);
        mesa.posicionar(new Madera(), 0,1);
        mesa.posicionar(new Madera(), 0,2);
        mesa.posicionar(new Madera(), 1,1);
        mesa.posicionar(new Madera(), 2,1);

        assertEquals(true, mesa.estructuraPicoMadera());
    }

    @Test
    public void posicionaElementosParaConstruirLaEstructuraDelPicoDePiedra(){
        Mesa mesa = new Mesa();
        mesa.posicionar(new Piedra(), 0,0);
        mesa.posicionar(new Piedra(), 0,1);
        mesa.posicionar(new Piedra(), 0,2);
        mesa.posicionar(new Madera(), 1,1);
        mesa.posicionar(new Madera(), 2,1);

        assertEquals(true, mesa.estructuraPicoPiedra());
    }

    @Test
    public void posicionaElementosParaConstruirLaEstructuraDelPicoDeMetal(){
        Mesa mesa = new Mesa();
        mesa.posicionar(new Metal(), 0,0);
        mesa.posicionar(new Metal(), 0,1);
        mesa.posicionar(new Metal(), 0,2);
        mesa.posicionar(new Madera(), 1,1);
        mesa.posicionar(new Madera(), 2,1);

        assertEquals(true, mesa.estructuraPicoMetal());
    }


    @Test
    public void posicionaElementosParaConstruirLaEstructuraDelHachaDeMetal(){
        Mesa mesa = new Mesa();
        mesa.posicionar(new Metal(), 0,0);
        mesa.posicionar(new Metal(), 0,1);
        mesa.posicionar(new Metal(), 1,0);
        mesa.posicionar(new Madera(), 1,1);
        mesa.posicionar(new Madera(), 2,1);

        assertEquals(true, mesa.estructuraHachaMetal());
    }


    @Test
    public void posicionaElementosParaConstruirLaEstructuraDelHachaDePiedra(){
        Mesa mesa = new Mesa();
        mesa.posicionar(new Piedra(), 0,0);
        mesa.posicionar(new Piedra(), 0,1);
        mesa.posicionar(new Piedra(), 1,0);
        mesa.posicionar(new Madera(), 1,1);
        mesa.posicionar(new Madera(), 2,1);

        assertEquals(true, mesa.estructuraHachaPiedra());
    }


    @Test
    public void posicionaElementosParaConstruirLaEstructuraDelHachaDeMadera(){
        Mesa mesa = new Mesa();
        mesa.posicionar(new Madera(), 0,0);
        mesa.posicionar(new Madera(), 0,1);
        mesa.posicionar(new Madera(), 1,0);
        mesa.posicionar(new Madera(), 1,1);
        mesa.posicionar(new Madera(), 2,1);

        assertEquals(true, mesa.estructuraHachaMadera());
    }


    @Test
    public void posicionaElementosParaConstruirLaEstructuraDelPicoFino(){
        Mesa mesa = new Mesa();
        mesa.posicionar(new Metal(), 0,0);
        mesa.posicionar(new Metal(), 0,1);
        mesa.posicionar(new Metal(), 0,2);
        mesa.posicionar(new Madera(), 1,1);
        mesa.posicionar(new Madera(), 2,1);
        mesa.posicionar(new Piedra(), 1,0);

        assertEquals(true, mesa.estructuraPicoFino());
    }


}
