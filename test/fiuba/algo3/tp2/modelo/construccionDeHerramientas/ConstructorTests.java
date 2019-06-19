package fiuba.algo3.tp2.modelo.construccionDeHerramientas;

import fiuba.algo3.tp2.modelo.Constructor;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.mapa.Casillero;
import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;
import fiuba.algo3.tp2.modelo.materiales.bloques.Metal;
import fiuba.algo3.tp2.modelo.materiales.bloques.Piedra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructorTests {



    @Test
    public void construccionHachaDeMaderaUsandoMesa(){
        Mesa mesa = new Mesa();
        Constructor constructor = new Constructor();
        Herramienta herramienta;

        mesa.posicionar(new Madera(),0,0);
        mesa.posicionar(new Madera(),0,1);
        mesa.posicionar(new Madera(),1,0);
        mesa.posicionar(new Madera(),1,1);
        mesa.posicionar(new Madera(),2,1);

        herramienta = constructor.construir(mesa);

        assertEquals(100, herramienta.getDurabilidad());
        assertEquals(2, herramienta.getFuerza());

    }

    @Test
    public void construccionHachaDePiedraUsandoMesa(){
        Mesa mesa = new Mesa();
        Constructor constructor = new Constructor();
        Herramienta herramienta;

        mesa.posicionar(new Piedra(),0,0);
        mesa.posicionar(new Piedra(),0,1);
        mesa.posicionar(new Piedra(),1,0);
        mesa.posicionar(new Madera(),1,1);
        mesa.posicionar(new Madera(),2,1);

        herramienta = constructor.construir(mesa);

        assertEquals(200, herramienta.getDurabilidad());
        assertEquals(5, herramienta.getFuerza());

    }

    @Test
    public void construccionHachaDeMetalUsandoMesa(){
        Mesa mesa = new Mesa();
        Constructor constructor = new Constructor();
        Herramienta herramienta;

        mesa.posicionar(new Metal(),0,0);
        mesa.posicionar(new Metal(),0,1);
        mesa.posicionar(new Metal(),1,0);
        mesa.posicionar(new Madera(),1,1);
        mesa.posicionar(new Madera(),2,1);

        herramienta = constructor.construir(mesa);

        assertEquals(400, herramienta.getDurabilidad());
        assertEquals(10, herramienta.getFuerza());

    }


    @Test
    public void construccionPicoDeMetalUsandoMesa(){
        Mesa mesa = new Mesa();
        Constructor constructor = new Constructor();
        Herramienta herramienta;

        mesa.posicionar(new Metal(),0,0);
        mesa.posicionar(new Metal(),0,1);
        mesa.posicionar(new Metal(),0,2);
        mesa.posicionar(new Madera(),1,1);
        mesa.posicionar(new Madera(),2,1);

        herramienta = constructor.construir(mesa);

        assertEquals(400, herramienta.getDurabilidad());
        assertEquals(12, herramienta.getFuerza());

    }


    @Test
    public void construccionPicoDeMaderaUsandoMesa(){
        Mesa mesa = new Mesa();
        Constructor constructor = new Constructor();
        Herramienta herramienta;

        mesa.posicionar(new Madera(),0,0);
        mesa.posicionar(new Madera(),0,1);
        mesa.posicionar(new Madera(),0,2);
        mesa.posicionar(new Madera(),1,1);
        mesa.posicionar(new Madera(),2,1);

        herramienta = constructor.construir(mesa);

        assertEquals(100, herramienta.getDurabilidad());
        assertEquals(2, herramienta.getFuerza());

    }


    @Test
    public void construccionPicoDePiedraUsandoMesa(){
        Mesa mesa = new Mesa();
        Constructor constructor = new Constructor();
        Herramienta herramienta;

        mesa.posicionar(new Piedra(),0,0);
        mesa.posicionar(new Piedra(),0,1);
        mesa.posicionar(new Piedra(),0,2);
        mesa.posicionar(new Madera(),1,1);
        mesa.posicionar(new Madera(),2,1);

        herramienta = constructor.construir(mesa);

        assertEquals(200, herramienta.getDurabilidad());
        assertEquals(4, herramienta.getFuerza());

    }


    @Test
    public void construccionPicoFinoUsandoMesa(){
        Mesa mesa = new Mesa();
        Constructor constructor = new Constructor();
        Herramienta herramienta;

        mesa.posicionar(new Metal(),0,0);
        mesa.posicionar(new Metal(),0,1);
        mesa.posicionar(new Metal(),0,2);
        mesa.posicionar(new Madera(),1,1);
        mesa.posicionar(new Madera(),2,1);
        mesa.posicionar(new Piedra(),1,0);

        herramienta = constructor.construir(mesa);

        assertEquals(1000, herramienta.getDurabilidad());
        assertEquals(20, herramienta.getFuerza());

    }


    @Test
    public void construccionHachaDeMadera(){
        Constructor constructor = new Constructor();
        Herramienta herramienta;

        herramienta = constructor.construirHachaDeMadera();

        assertEquals(100, herramienta.getDurabilidad());
        assertEquals(2, herramienta.getFuerza());

    }

    @Test
    public void construccionHachaDePiedra(){
        Constructor constructor = new Constructor();
        Herramienta herramienta;

        herramienta = constructor.construirHachaDePiedra();

        assertEquals(200, herramienta.getDurabilidad());
        assertEquals(5, herramienta.getFuerza());

    }

    @Test
    public void construccionHachaDeMetal(){
        Constructor constructor = new Constructor();
        Herramienta herramienta;

        herramienta = constructor.construirHachaDeMetal();

        assertEquals(400, herramienta.getDurabilidad());
        assertEquals(10, herramienta.getFuerza());

    }


    @Test
    public void construccionPicoDeMetal(){
        Constructor constructor = new Constructor();
        Herramienta herramienta;

        herramienta = constructor.construirPicoDeMetal();

        assertEquals(400, herramienta.getDurabilidad());
        assertEquals(12, herramienta.getFuerza());

    }


    @Test
    public void construccionPicoDeMadera(){
        Constructor constructor = new Constructor();
        Herramienta herramienta;

        herramienta = constructor.construirPicoDeMadera();

        assertEquals(100, herramienta.getDurabilidad());
        assertEquals(2, herramienta.getFuerza());

    }


    @Test
    public void construccionPicoDePiedra(){
        Constructor constructor = new Constructor();
        Herramienta herramienta;
        herramienta = constructor.construirPicoDePiedra();

        assertEquals(200, herramienta.getDurabilidad());
        assertEquals(4, herramienta.getFuerza());

    }


    @Test
    public void construccionPicoFino(){
        Constructor constructor = new Constructor();
        Herramienta herramienta;

        herramienta = constructor.construirPicoFino();

        assertEquals(1000, herramienta.getDurabilidad());
        assertEquals(20, herramienta.getFuerza());

    }


    @Test
    public void construccionDeHerramientaFallaPorMesaIncorrecta(){

        Constructor constructor = new Constructor();
        Mesa mesa = new Mesa();
        String resultado = "Sin excepciones.";

        try {
            constructor.construir(mesa);
        }
        catch(ImposibleConstruirHerramientaException ex){
            resultado = "NoEsPosibleConstruir";
        }

        assertEquals("NoEsPosibleConstruir",resultado);
    }


}
