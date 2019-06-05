

package fiuba.algo3.tp2;


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
        Hacha hacha = new Hacha(10,10);

        inventario.agregar("hacha", hacha);
        assertEquals(inventario.cantidadDe("hacha"),1);
        inventario.agregar("hacha", hacha);
        assertEquals(inventario.cantidadDe("hacha"),2);


    }


}


