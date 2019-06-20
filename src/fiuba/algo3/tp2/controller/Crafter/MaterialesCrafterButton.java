package fiuba.algo3.tp2.controller.Crafter;

import fiuba.algo3.tp2.modelo.inventario.ElementoNoEstaEnElInventarioException;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;


public class MaterialesCrafterButton {

    Button boton;
    Label label;

    Inventario inventario;
    String objeto;
    int size;
    CrafterStage crafter;


    public MaterialesCrafterButton(Inventario inventario, String objeto, int size, CrafterStage crafter){

        boton = new Button();
        label = new Label();
        this.size = size;
        this.crafter = crafter;

        this.inventario = inventario;
        this.objeto = objeto;

        Image imagen = new Image("file:img/"+objeto + ".png",size*0.8,size*0.8,false,false);
        boton.setGraphic(new ImageView(imagen));
        boton.prefHeight(size);
        boton.prefWidth(size);

        setCantidadDeObjetos();

        boton.setOnAction(e -> {
            try {
                crafter.setUltimoMaterialSeleccionado(objeto);
                inventario.cantidadDe(crafter.getUltimoMaterialSeleccionado());
            }catch (ElementoNoEstaEnElInventarioException el){
                crafter.setUltimoMaterialSeleccionado("None");
            }
        });

        label.setPrefSize(size,size/4);
    }

    public void setCantidadDeObjetos(){

        try{
            label.setText(objeto+ ": " + Integer.toString(inventario.cantidadDe(objeto)));
        }catch (ElementoNoEstaEnElInventarioException e){
            label.setText(objeto+": 0");
        }
        label.setAlignment(Pos.BASELINE_CENTER);
    }

    public VBox getVisual(){
        VBox vBox = new VBox(boton,label);
        return vBox;
    }


}
