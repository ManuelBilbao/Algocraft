package fiuba.algo3.tp2.modelo.mapa;

import fiuba.algo3.tp2.modelo.Jugador;


import fiuba.algo3.tp2.modelo.Mapa.Casillero;
import fiuba.algo3.tp2.modelo.Mapa.CasilleroOcupado;
import fiuba.algo3.tp2.modelo.Mapa.CasilleroOcupadoException;
import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasilleroTests {

    @Test
    public void seOcupaUnCasilleroLibreConJugador(){
        Casillero casillero = new Casillero(1,1);
        Jugador jugador = new Jugador();


        assertEquals(casillero.getContenido(),null);

        casillero.ocupar(jugador);

        assertEquals(jugador,casillero.getContenido());

    }

    @Test
    public void sePideFilaYColumnaDeUnCasilleroOcupado(){
        Casillero casillero = new Casillero(1,1);
        Jugador jugador = new Jugador();
        casillero.ocupar(jugador);

        assertEquals(casillero.getFila(),1);
        assertEquals(casillero.getColumna(),1);

    }

    @Test
    public void sePideFilaYColumnaDeUnCasilleroLibre() {
        Casillero casillero = new Casillero(1, 1);

        assertEquals(casillero.getFila(), 1);
        assertEquals(casillero.getColumna(), 1);
    }

    @Test
    public void seOcupaUnCasilleroLibreConMaterial(){
        Casillero casillero = new Casillero(1,1);
        Madera madera = new Madera();

        casillero.getFila();

        assertEquals(casillero.getContenido(),null);

        casillero.ocupar(madera);

        assertEquals(madera,casillero.getContenido());
    }

    @Test
    public void noSePuedeOcuparUnCasilleroOcupado(){
        Casillero casillero= new Casillero(1,1);
        casillero.setEstadoCasillero(new CasilleroOcupado());
        Jugador jugador = new Jugador();
        String resultado = "Sin excepciones.";

        try{ casillero.ocupar(jugador);}
        catch (CasilleroOcupadoException ex){
            resultado = "CasilleroOcupadoException";
        }

        assertEquals("CasilleroOcupadoException",resultado);

    }
}
