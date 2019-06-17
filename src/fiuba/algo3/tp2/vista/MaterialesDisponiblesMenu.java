package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.modelo.inventario.Inventario;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;


public class MaterialesDisponiblesMenu {

    public Inventario inventario;
    public HBox materialesDisponibles;

    private Label labelMadera;
    private Label labelPiedra;
    private Label labelMetal;
    private Label labelDiamante;

    public MaterialesDisponiblesMenu(){

        ImageView imageMadera = new ImageView(new Image("madera.png",50,50,false,false));
        ImageView imagePiedra = new ImageView(new Image("piedra.png",50,50,false,false));
        ImageView imageMetal = new ImageView(new Image("metal.png",50,50,false,false));
        ImageView imageDiamante = new ImageView(new Image("diamante.png",50,50,false,false));

        labelMadera = new Label("0", imageMadera);
        labelPiedra = new Label("0", imagePiedra);
        labelMetal = new Label("0", imageMetal);
        labelDiamante = new Label("0", imageDiamante);
    }

    public void updateCantidadDeMaterialesDisponibles(Inventario inventario){

        labelMadera.setText(Integer.toString(inventario.cantidadDe("madera")));
        labelPiedra.setText(Integer.toString(inventario.cantidadDe("piedra")));
        labelMetal.setText(Integer.toString(inventario.cantidadDe("metal")));
        labelDiamante.setText(Integer.toString(inventario.cantidadDe("diamate")));
    }

    public HBox getVisual(){
        materialesDisponibles = new HBox();
        materialesDisponibles.getChildren().setAll(labelMadera,labelPiedra,labelMetal,labelDiamante);
        return materialesDisponibles;

    }
}
