package fiuba.algo3.tp2.modelo.materiales;


import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.materiales.bloques.Material;
import fiuba.algo3.tp2.modelo.materiales.bloques.Piedra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaterialPiedraTests {
    @Test
    public void test01SeCreaPiedraConDurabilidad100() {
        Material piedra = new Piedra();
        assertEquals(piedra.getDurabilidad(), 30);
    }

    @Test
    public void test02SeGolpeaPiedraConHachaYNoSeReduceDurabilidad(){
        Jugador jugador = new Jugador();
        Herramienta hachaDeMadera = jugador.construirHachaDeMadera();
        Herramienta hachaDeMetal = jugador.construirHachaDeMetal();
        Herramienta hachaDePiedra = jugador.construirHachaDePiedra();
        Material piedra = new Piedra();


        hachaDeMadera.golpearMetal(piedra);
        assertEquals(piedra.getDurabilidad(), 30);

        hachaDeMetal.golpearMetal(piedra);
        assertEquals(piedra.getDurabilidad(), 30);

        hachaDePiedra.golpearMetal(piedra);
        assertEquals(piedra.getDurabilidad(), 30);
    }
}
