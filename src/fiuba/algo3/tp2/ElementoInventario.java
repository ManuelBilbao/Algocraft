package fiuba.algo3.tp2;

public class ElementoInventario {
    protected Object elemento;
    protected int cantidad;
    protected String nombre;

    public ElementoInventario(String nombreElemento, Object elemento){
        this.elemento = elemento;
        cantidad = 1;
        nombre = nombreElemento;
    }

    public int cantidad(){ return cantidad;}
    public void disminuirCantidad(){ cantidad = cantidad-1;}
    public void aumentarCantidad(){ cantidad = cantidad+1;}
    public String nombre(){ return nombre;}
    public Object getElemento(){ return elemento;}
}
