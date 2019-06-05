package fiuba.algo3.tp2;


import java.util.HashMap;

public class Inventario{

    protected HashMap<String,ElementoInventario> inventario = new HashMap();

    public boolean vacio(){ return inventario.isEmpty(); }

    public int cantidadDe(String nombreElemento) {
        if (! inventario.containsKey(nombreElemento)) throw new ElementoNoEstaEnElInventarioException();
        return ((inventario.get(nombreElemento)).cantidad());
    }

    public void agregar(String nombreElemento, Object elemento){
        if (inventario.containsKey(nombreElemento)){
            inventario.put(nombreElemento,inventario.get(nombreElemento)).aumentarCantidad();
        }
        else{
           inventario.put(nombreElemento,new ElementoInventario(nombreElemento,elemento));

        }
    }


}
