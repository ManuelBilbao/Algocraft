
package fiuba.algo3.tp2.modelo.inventario;


import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.inventario.ElementoInventario;
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
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMadera();
        ElementoInventario elemento = new ElementoInventario("hacha",hacha);

        assertEquals(elemento.cantidad(), 1);

        elemento.disminuirCantidad();
        assertEquals(elemento.cantidad(), 0);

    }

    @Test
    public void nombreElementoInventario(){
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMadera();
        ElementoInventario elemento = new ElementoInventario("hacha",hacha);

        assertEquals(elemento.nombre(), "hacha");
    }

    @Test
    public void getElementoInventario(){
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.construirHachaDeMadera();
        ElementoInventario elemento = new ElementoInventario("hacha",hacha);

        assertEquals(elemento.getElemento(), hacha);
    }
}


