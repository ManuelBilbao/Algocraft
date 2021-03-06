package fiuba.algo3.tp2.modelo.inventario;


import java.util.HashMap;

public class Inventario{

    protected HashMap<String,ElementoInventario> inventario = new HashMap();

    public boolean vacio(){ return inventario.isEmpty(); }

    public int cantidadDe(String nombreElemento) {
        if ((!inventario.containsKey(nombreElemento))) throw new ElementoNoEstaEnElInventarioException();
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

    public void sacar(String nombreElemento){
        if (inventario.containsKey(nombreElemento)){
            inventario.get(nombreElemento).disminuirCantidad();
        }
    }


    public Object getElemento(String nombreElemento) {
        return inventario.get(nombreElemento).getElemento();
    }
}
