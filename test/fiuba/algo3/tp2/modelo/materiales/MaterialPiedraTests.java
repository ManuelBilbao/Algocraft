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

        jugador.agregarElementoALaMesaDeConstruccion("madera",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hachaDeMadera = jugador.construirHachaDeMadera();

        jugador.agregarElementoALaMesaDeConstruccion("metal",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("metal",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("metal",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

        Herramienta hachaDeMetal = jugador.construirHachaDeMetal();

        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,0);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",0,1);
        jugador.agregarElementoALaMesaDeConstruccion("piedra",1,0);
        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        jugador.agregarElementoALaMesaDeConstruccion("madera",2,1);

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
