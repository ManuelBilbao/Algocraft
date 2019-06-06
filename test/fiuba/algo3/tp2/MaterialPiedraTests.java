package fiuba.algo3.tp2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaterialPiedraTests {
    @Test
    public void seCreaPiedraConDurabilidad100() {
        Material piedra = new Piedra();
        assertEquals(piedra.getDurabilidad(), 30);
    }

    @Test
    public void seGolpeaPiedraConHachaYNoSeReduceDurabilidad(){
        Jugador jugador = new Jugador();
        Herramienta hachaDeMadera = jugador.construirHachaDeMadera();
        Herramienta hachaDeMetal = jugador.construirHachaDeMetal();
        Herramienta hachaDePiedra = jugador.construirHachaDePiedra();
        Material piedra = new Piedra();
        int durabilidadInicial = piedra.getDurabilidad();


        piedra.recibirGolpe(hachaDeMadera);
        assertEquals(piedra.getDurabilidad(), durabilidadInicial);

        piedra.recibirGolpe(hachaDeMetal);
        assertEquals(piedra.getDurabilidad(), durabilidadInicial);

        piedra.recibirGolpe(hachaDePiedra);
        assertEquals(piedra.getDurabilidad(), durabilidadInicial);
    }
}
