package fiuba.algo3.tp2;


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
        int durabilidadInicial = piedra.getDurabilidad();


        hachaDeMadera.golpearMetal(piedra);
        assertEquals(piedra.getDurabilidad(), durabilidadInicial);

        hachaDeMetal.golpearMetal(piedra);
        assertEquals(piedra.getDurabilidad(), durabilidadInicial);

        hachaDePiedra.golpearMetal(piedra);
        assertEquals(piedra.getDurabilidad(), durabilidadInicial);
    }
}
