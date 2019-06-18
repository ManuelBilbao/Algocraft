package fiuba.algo3.tp2.controller.ObjetosDisponibles;

import fiuba.algo3.tp2.controller.Crafter.MesaGridPane;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import fiuba.algo3.tp2.vista.AlgocraftTittle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;


public class ObjetosDisponibles {

    public List<ObjetosDisponiblesButton> boxes = new ArrayList<>();
    int n;
    int sizeBox;
    int sizeLetra;
    String[] objetos;
    Inventario inventario;
    MesaGridPane mesa;

    public ObjetosDisponibles(int sizeBox, int sizeLetra, String[] objetos, Inventario inventario){

        n = objetos.length;
        this.sizeBox= sizeBox;
        this.sizeLetra = sizeLetra;
        this.objetos= objetos;
        this.inventario = inventario;
        setObjetos();
    }

    private void setObjetos(){
        for( int i=0; i<n; i++) {
            ObjetosDisponiblesButton box = new ObjetosDisponiblesButton(inventario,objetos[i],sizeBox);
            boxes.add(box);
        }
    }

    public VBox getVisualHBox(){

        HBox materialesDisponibles = new HBox();
        for(int i=0; i<n; i++) {materialesDisponibles.getChildren().add(boxes.get(i).getVisual());};

        VBox visual = new VBox(getTitle(sizeBox*n, sizeBox/6, sizeLetra), materialesDisponibles);
        visual.setAlignment(Pos.CENTER);
        return visual;
    }


    private Label getTitle(int ancho, int alto, int size){
        AlgocraftTittle title = new AlgocraftTittle("Materiales",ancho, alto, size);
        return title.getVisual();
    }

    public void updateCantidadDeMateriales(){
        for( int i=0; i<n; i++) {
            boxes.get(i).setCantidadDeObjetos();
        }

    }
}
