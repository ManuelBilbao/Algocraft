package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementoNoEstaEnInventarioExceptionTests {
    @Test
    public void pidoUnElementoQueNoEstaEnElInventario(){
        Inventario inventario = new Inventario();

        assertEquals(inventario.vacio(),true);

        String resultado = "Sin excepciones.";

        try {
            inventario.cantidadDe("elemento");
        }
        catch(ElementoNoEstaEnElInventarioException ex){
            resultado = "ElementoNoEstaEnInventarioExc";
        }

        assertEquals("ElementoNoEstaEnInventarioExc",resultado);
    }
}
