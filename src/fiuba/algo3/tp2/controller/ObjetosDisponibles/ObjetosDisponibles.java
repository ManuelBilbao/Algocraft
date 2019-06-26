package fiuba.algo3.tp2.controller.ObjetosDisponibles;

import fiuba.algo3.tp2.controller.Crafter.MesaGridPane;
import fiuba.algo3.tp2.modelo.Juego;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import fiuba.algo3.tp2.controller.AlgocraftTittle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;


public class ObjetosDisponibles {

    public List<ObjetosDisponiblesButton> boxes = new ArrayList<>();
    int n;
    double sizeBox;
    double sizeLetra;
    String[] objetos;
    Inventario inventario;
    MesaGridPane mesa;

    public ObjetosDisponibles(double sizeBox, double sizeLetra, String[] objetos, Juego juego){

        n = objetos.length;
        this.sizeBox= sizeBox;
        this.sizeLetra = sizeLetra;
        this.objetos= objetos;
        this.inventario = juego.getJugador().getInventarioMateriales();
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


    private Label getTitle(double ancho, double alto, double size){
        AlgocraftTittle title = new AlgocraftTittle("Materiales",ancho, alto, size);
        return title.getVisual();
    }

    public void updateCantidadDeMateriales(){
        for( int i=0; i<n; i++) {
            boxes.get(i).setCantidadDeObjetos();
        }

    }
}
