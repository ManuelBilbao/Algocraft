package fiuba.algo3.tp2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesgasteTests {

    @Test
    public void test01DesgasteAbrupto() {

        DesgasteAbrupto desgaste = new DesgasteAbrupto(5,3);
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 5);


        desgaste.usar();
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 0);
    }

    @Test
    public void test02DesgasteLinealPorFuerza() {

        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(10,2);
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 8);

        desgaste.usar();
        desgaste.usar();
        desgaste.usar();
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 0);

    }

    @Test
    public void test03DesgasteMitadDeFuerza() {

        DesgasteMitadDeFuerza desgaste = new DesgasteMitadDeFuerza(10,4);
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 8);

        desgaste.usar();
        desgaste.usar();
        desgaste.usar();
        desgaste.usar();


        assertEquals(desgaste.getDurabilidad(), 0);


    }

    @Test
    public void test04DesgastePorcentual() {

        DesgastePorcentual desgaste = new DesgastePorcentual(10);
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 9);

        desgaste.usar();
        desgaste.usar();
        desgaste.usar();
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 5,9049006);

    }

    @Test
    public void test05DesgastePorFuerzaDivididoUnoComaCinco() {

        DesgastePorFuerzaDivididoUnoComaCinco desgaste = new DesgastePorFuerzaDivididoUnoComaCinco(10,3);
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 8);

        desgaste.usar();
        desgaste.usar();
        desgaste.usar();
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 0);


    }

    @Test
    public void test06UsoSinDurabilidadDesgasteLinealPorFuerza(){


        DesgasteLinealPorFuerza desgaste = new DesgasteLinealPorFuerza(10,2);
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 8);

        desgaste.usar();
        desgaste.usar();
        desgaste.usar();
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 0);

        String resultado = "Sin excepciones.";

        try {
            desgaste.usar();
        }
        catch(NoPoseeDurabilidadException ex){
            resultado = "NoPoseeDurabilidad";
        }

        assertEquals("NoPoseeDurabilidad",resultado);
    }

    @Test
    public void test07UsoSinDurabilidadDesgasteAbrupto(){

        DesgasteAbrupto desgaste = new DesgasteAbrupto(5,3);
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 5);


        desgaste.usar();
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 0);

        String resultado = "Sin excepciones.";

        try {
            desgaste.usar();
        }
        catch(NoPoseeDurabilidadException ex){
            resultado = "NoPoseeDurabilidad";
        }

        assertEquals("NoPoseeDurabilidad",resultado);
    }

    @Test
    public void test08UsoSinDurabilidadDesgasteMitadDeFuerza(){


        DesgasteMitadDeFuerza desgaste = new DesgasteMitadDeFuerza(10,4);
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 8);

        desgaste.usar();
        desgaste.usar();
        desgaste.usar();
        desgaste.usar();


        assertEquals(desgaste.getDurabilidad(), 0);

        String resultado = "Sin excepciones.";

        try {
            desgaste.usar();
        }
        catch(NoPoseeDurabilidadException ex){
            resultado = "NoPoseeDurabilidad";
        }

        assertEquals("NoPoseeDurabilidad",resultado);
    }


    @Test
    public void test09UsoSinDurabilidadDesgastePorFuerzaDivididoPorUnoComaCinco(){


        DesgastePorFuerzaDivididoUnoComaCinco desgaste = new DesgastePorFuerzaDivididoUnoComaCinco(10,3);
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 8);

        desgaste.usar();
        desgaste.usar();
        desgaste.usar();
        desgaste.usar();

        assertEquals(desgaste.getDurabilidad(), 0);


        String resultado = "Sin excepciones.";

        try {
            desgaste.usar();
        }
        catch(NoPoseeDurabilidadException ex){
            resultado = "NoPoseeDurabilidad";
        }

        assertEquals("NoPoseeDurabilidad",resultado);
    }
}