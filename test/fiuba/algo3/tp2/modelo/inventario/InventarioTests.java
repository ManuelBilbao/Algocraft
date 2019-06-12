

package fiuba.algo3.tp2.modelo.inventario;


import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTests {
    @Test
    public void seCreaInventarioYEstaVacio(){
        Inventario inventario = new Inventario();
        assertEquals(inventario.vacio(), true);

    }

    @Test
    public void seAgregaElementoAlInventarioYSuCantidadEsCorrecta(){
        Inventario inventario = new Inventario();
        Jugador jugador = new Jugador();
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hacha = jugador.construirHachaDeMadera();

        inventario.agregar("hacha", hacha);
        assertEquals(inventario.cantidadDe("hacha"),1);
        inventario.agregar("hacha", hacha);
        assertEquals(inventario.cantidadDe("hacha"),2);


    }


}


