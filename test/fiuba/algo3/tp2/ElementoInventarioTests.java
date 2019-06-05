package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementoInventarioTests {
    @Test
    public void seCreaElementoInventarioYSuCantidadEsUno(){

        Object objeto = new Object();
        ElementoInventario elemento = new ElementoInventario("objeto",objeto);

        assertEquals(elemento.cantidad(), 1);

    }

    @Test
    public void elementoInventarioAumentaSuCantidad(){

        Object objeto = new Object();
        ElementoInventario elemento = new ElementoInventario("objeto",objeto);

        assertEquals(elemento.cantidad(), 1);

        elemento.aumentarCantidad();
        assertEquals(elemento.cantidad(), 2);

        elemento.aumentarCantidad();
        assertEquals(elemento.cantidad(), 3);
    }

    @Test
    public void elementoInventarioDisminuyeSuCantidad(){

        Hacha hacha = new Hacha();
        ElementoInventario elemento = new ElementoInventario("hacha",hacha);

        assertEquals(elemento.cantidad(), 1);

        elemento.disminuirCantidad();
        assertEquals(elemento.cantidad(), 0);

    }

    @Test
    public void nombreElementoInventario(){
        Hacha hacha = new Hacha();
        ElementoInventario elemento = new ElementoInventario("hacha",hacha);

        assertEquals(elemento.nombre(), "hacha");
    }

    @Test
    public void getElementoInventario(){
        Hacha hacha = new Hacha();
        ElementoInventario elemento = new ElementoInventario("hacha",hacha);

        assertEquals(elemento.getElemento(), hacha);
    }
}