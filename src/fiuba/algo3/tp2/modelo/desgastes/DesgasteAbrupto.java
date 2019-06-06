package fiuba.algo3.tp2.desgastes;

public class DesgasteAbrupto extends Desgaste{

    private int usos;

    public DesgasteAbrupto(int durabilidad, int usos) {
        this.durabilidad = durabilidad;
        this.usos = usos;
    }

     @Override
    public void usar() {
        if (durabilidad <= 0) throw new NoPoseeDurabilidadException();
        this.usos--;
        if (usos <= 0) durabilidad = 0;
    }


}
