package fiuba.algo3.tp2.modelo;

import fiuba.algo3.tp2.modelo.Jugador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JugadorTests {

    @Test
    public void seCreaJugadorYTieneHachaDeMadera(){
        Jugador jugador = new Jugador();

        assertEquals(jugador.cantidadDeHerramienta("hachaDeMadera"),1);
    }

    @Test
    public void seCreaJugadorYElInventarioDeHerramientasNoEstaVacio(){
        Jugador jugador = new Jugador();

        assertEquals(jugador.inventarioVacio(jugador.getInventarioHerramientas()),false);
    }

    @Test
    public void seCreaJugadorYElInventarioDeMaterialesEstaVacio(){
        Jugador jugador = new Jugador();

        assertEquals(jugador.inventarioVacio(jugador.getInventarioMateriales()),true);
    }


    @Test
    public void agregarUnElementoALaMesaDeConstruccion(){
        Jugador jugador = new Jugador();

        jugador.agregarElementoALaMesaDeConstruccion("madera",1,1);
        assertEquals(jugador.getMesaDeConstruccion().getCasillero(1,1).getContenido(),"madera");
    }


}
