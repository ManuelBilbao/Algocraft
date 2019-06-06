package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class DesgasteMaterialesTests {
    @Test
    public void seDesgastaMaderaConDUrabilidad10YFuerza5() {
        Madera madera = new Madera();
        assertEquals(madera.getDurabilidad(), 10);
        madera.desgastar(5);
        assertEquals(madera.getDurabilidad(), 5);
        madera.desgastar(5);
        assertEquals(madera.getDurabilidad(), 0);
    }

    @Test
    public void seDesgastaMetalConDurabilidad50YFuerza20() {
        Metal metal = new Metal();
        assertEquals(metal.getDurabilidad(), 50);
        metal.desgastar(20);
        assertEquals(metal.getDurabilidad(), 30);
        metal.desgastar(20);
        assertEquals(metal.getDurabilidad(), 10);
    }
    @Test
    public void seDesgastaPiedraConDurabilidad30YFuerza10(){
        Piedra piedra = new Piedra();
        assertEquals(piedra.getDurabilidad(),30);
        piedra.desgastar(10);
        assertEquals(piedra.getDurabilidad(),20);
        piedra.desgastar(10);
        assertEquals(piedra.getDurabilidad(),10);
    }
    @Test
    public void seDesgastaDiamanteConDurabilidad100YFuerza40(){
        Diamante diamante = new Diamante();
        assertEquals(diamante.getDurabilidad(),100);
        diamante.desgastar(40);
        assertEquals(diamante.getDurabilidad(),60);
        diamante.desgastar(40);
        assertEquals(diamante.getDurabilidad(),20);
    }

}
