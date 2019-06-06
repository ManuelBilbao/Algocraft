package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class MaterialesRecibenGolpesTests {
    @Test
    public void test01MaderaConDUrabilidad10RecibeGolpeConFuerza5() {
        Madera madera = new Madera();
        assertEquals(madera.getDurabilidad(), 10);
        madera.recibirGolpe(5);
        assertEquals(madera.getDurabilidad(), 5);
        madera.recibirGolpe(5);
        assertEquals(madera.getDurabilidad(), 0);
    }

    @Test
    public void test02MetalConDurabilidad50RecibeGolpeConFuerza20() {
        Metal metal = new Metal();
        assertEquals(metal.getDurabilidad(), 50);
        metal.recibirGolpe(20);
        assertEquals(metal.getDurabilidad(), 30);
        metal.recibirGolpe(20);
        assertEquals(metal.getDurabilidad(), 10);
    }
    @Test
    public void test03PiedraConDurabilidad30RecibeGolpeConFuerza10(){
        Piedra piedra = new Piedra();
        assertEquals(piedra.getDurabilidad(),30);
        piedra.recibirGolpe(10);
        assertEquals(piedra.getDurabilidad(),20);
        piedra.recibirGolpe(10);
        assertEquals(piedra.getDurabilidad(),10);
    }
    @Test
    public void test04DiamanteConDurabilidad100RecibeGolpeConFuerza40(){
        Diamante diamante = new Diamante();
        assertEquals(diamante.getDurabilidad(),100);
        diamante.recibirGolpe(40);
        assertEquals(diamante.getDurabilidad(),60);
        diamante.recibirGolpe(40);
        assertEquals(diamante.getDurabilidad(),20);
    }

    @Test
    public void test05seDesgastaDiamanteSinDurabilidadLanzaExcepcion() {
        Material diamante = new Diamante();
        diamante.recibirGolpe(120);

        String resultado = "Sin excepciones.";

        try {
            diamante.recibirGolpe(20);
        } catch (NoPoseeDurabilidadException ex) {
            resultado = "NoPoseeDurabilidad";
        }

        assertEquals("NoPoseeDurabilidad", resultado);
    }

    @Test
    public void test06seDesgastaPiedraSinDurabilidadLanzaExcepcion() {
        Material piedra = new Piedra();
        piedra.recibirGolpe(120);

        String resultado = "Sin excepciones.";

        try {
            piedra.recibirGolpe(20);
        } catch (NoPoseeDurabilidadException ex) {
            resultado = "NoPoseeDurabilidad";
        }

        assertEquals("NoPoseeDurabilidad", resultado);
    }

    @Test
    public void test07seDesgastaMetalSinDurabilidadLanzaExcepcion() {
        Material metal = new Metal();
        metal.recibirGolpe(120);

        String resultado = "Sin excepciones.";

        try {
            metal.recibirGolpe(20);
        } catch (NoPoseeDurabilidadException ex) {
            resultado = "NoPoseeDurabilidad";
        }

        assertEquals("NoPoseeDurabilidad", resultado);
    }

    @Test
    public void test08seDesgastaMaderaSinDurabilidadLanzaExcepcion() {
        Material madera = new Madera();
        madera.recibirGolpe(120);

        String resultado = "Sin excepciones.";

        try {
            madera.recibirGolpe(20);
        } catch (NoPoseeDurabilidadException ex) {
            resultado = "NoPoseeDurabilidad";
        }

        assertEquals("NoPoseeDurabilidad", resultado);
    }

}
