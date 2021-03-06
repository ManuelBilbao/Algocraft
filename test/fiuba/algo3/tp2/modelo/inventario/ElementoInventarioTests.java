
package fiuba.algo3.tp2.modelo.inventario;


import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;
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

        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta hacha = jugador.construir();

        ElementoInventario elemento = new ElementoInventario("hacha",hacha);

        assertEquals(elemento.cantidad(), 1);

        elemento.disminuirCantidad();
        assertEquals(elemento.cantidad(), 0);

    }

    @Test
    public void nombreElementoInventario(){
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta hacha = jugador.construir();
        ElementoInventario elemento = new ElementoInventario("hacha",hacha);

        assertEquals(elemento.nombre(), "hacha");
    }

    @Test
    public void getElementoInventario(){
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);


        Herramienta hacha = jugador.construir();
        ElementoInventario elemento = new ElementoInventario("hacha",hacha);

        assertEquals(elemento.getElemento(), hacha);
    }
}


