package fiuba.algo3.tp2.controller.ObjetosDisponibles;

import fiuba.algo3.tp2.modelo.inventario.Inventario;
import fiuba.algo3.tp2.vista.AlgocraftTittle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;


public class ObjetosDisponibles {

    public List<VBox> boxes = new ArrayList<>();
    int n;
    int size;
    String[] objetos;
    Inventario inventario;

    public ObjetosDisponibles(int size, String[] objetos, Inventario inventario){

        n = objetos.length;
        this.size= size;
        this.objetos= objetos;
        this.inventario = inventario;
        setObjetos();
    }

    private void setObjetos(){
        for( int i=0; i<n; i++) {
            ObjetosDisponiblesButton box = new ObjetosDisponiblesButton(inventario,objetos[i],size);
            boxes.add(box.getVisual());
        }
    }

    public VBox getVisualHBox(){

        HBox materialesDisponibles = new HBox();
        for(int i=0; i<n; i++) {materialesDisponibles.getChildren().add(boxes.get(i));};

        VBox visual = new VBox(getTitle(size*n, size, size/2), materialesDisponibles);
        visual.setAlignment(Pos.CENTER);
        return visual;
    }

    public VBox getVisualVBox(){

        VBox materialesDisponibles = new VBox();
        materialesDisponibles.getChildren().add(getTitle(size, size/3, size/8));
        for(int i=0; i<n; i++) {materialesDisponibles.getChildren().add(boxes.get(i));};
        materialesDisponibles.setAlignment(Pos.CENTER);
        return materialesDisponibles;
    }

    public VBox getVisualGridPane(int l, int m){

        GridPane materialesDisponibles = new GridPane();

        int k = 0;
        for(int i=0 ; i<l; i++){
            for(int j = 0; j<m; j++){
                materialesDisponibles.add(boxes.get(k) , i, j);
                k++;
            }
        }

        return new VBox(getTitle(size*l,size,size), materialesDisponibles);
    }

    private Label getTitle(int ancho, int alto, int size){
        AlgocraftTittle title = new AlgocraftTittle("Materiales",ancho, alto, size);
        return title.getVisual();
    }
}
