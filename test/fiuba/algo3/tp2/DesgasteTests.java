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

        assertEquals(desgaste.getDurabilidad(), 5);

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


}