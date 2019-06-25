package fiuba.algo3.tp2.modelo.mapa;
import fiuba.algo3.tp2.modelo.Jugador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapaTests {

    @Test
    public void creacionMapaCasillerosLibres(){
        Mapa mapa = new Mapa();
        Casillero casillero;

        for (int fila = 0; fila <= 30; fila++) {
            for (int col = 0; col <= 30; col++) {
                casillero = mapa.getCasillero(fila, col);
                assertEquals(null, casillero.getContenido());
            }
        }
    }

    @Test
    public void mapaOcuparPosicioFilaInvalidaLanzaExcepcion(){
        Mapa mapa = new Mapa();
        Posicion pos = new Posicion(-2,2);

        String resultado = "Error";

        try{ mapa.ocuparCasillero(pos, "asass");
        } catch (CasilleroOcupadoException el ){
            resultado = "CasilleroOcupadoException";
        }

        assertEquals("CasilleroOcupadoException",resultado);
    }

    @Test
    public void mapaOcuparPosicioColumnaInvalidaLanzaExcepcion(){
        Mapa mapa = new Mapa();
        Posicion pos = new Posicion(2,70);
        String resultado = "Error";

        try{ mapa.ocuparCasillero(pos, "asass");
        } catch (CasilleroOcupadoException el ){
            resultado = "CasilleroOcupadoException";
        }

        assertEquals("CasilleroOcupadoException",resultado);
    }


}
