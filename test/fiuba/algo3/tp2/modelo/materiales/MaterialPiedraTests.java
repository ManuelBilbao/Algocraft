package fiuba.algo3.tp2.modelo.materiales;


import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;
import fiuba.algo3.tp2.modelo.materiales.bloques.Material;
import fiuba.algo3.tp2.modelo.materiales.bloques.Metal;
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

        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta hachaDeMadera = jugador.construirHachaDeMadera();

        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Metal(),1,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

        Herramienta hachaDeMetal = jugador.construirHachaDeMetal();

        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),0,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Piedra(),1,0);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),1,1);
        jugador.agregarElementoALaMesaDeConstruccion(new Madera(),2,1);

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
