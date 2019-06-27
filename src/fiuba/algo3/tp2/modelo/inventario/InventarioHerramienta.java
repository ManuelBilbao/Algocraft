package fiuba.algo3.tp2.modelo.inventario;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class InventarioHerramienta extends Inventario {

    protected HashMap<String, ArrayList> inventario = new HashMap();

    @Override
    public boolean vacio(){ return inventario.isEmpty(); }

    @Override
    public int cantidadDe(String nombreElemento) {
        if ((!inventario.containsKey(nombreElemento))) throw new ElementoNoEstaEnElInventarioException();
            return inventario.get(nombreElemento).size();
    }

    @Override
    public void agregar(String nombreElemento, Object elemento){

        ElementoInventario el = new ElementoInventario(nombreElemento,elemento);

        if (inventario.containsKey(nombreElemento)){
            inventario.get(nombreElemento).add(el);
        } else{
            ArrayList <ElementoInventario> list = new ArrayList<>();
            list.add(el);
            inventario.put(nombreElemento,list);

        }
    }

    @Override
    public void sacar(String nombreElemento){
        if (inventario.containsKey(nombreElemento) && inventario.get(nombreElemento).size()>0){
            inventario.get(nombreElemento).remove(0);
        }
    }

    @Override
    public Object getElemento(String nombreElemento) {
        ElementoInventario elementoInventario = (ElementoInventario) inventario.get(nombreElemento).get(0);
        return elementoInventario.getElemento();
    }
}
