package fiuba.algo3.tp2.controller.Crafter;

import fiuba.algo3.tp2.modelo.inventario.Inventario;
import fiuba.algo3.tp2.vista.AlgocraftTittle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class MaterialesCrafter {
    public List<MaterialesCrafterButton> boxes = new ArrayList<>();
    int n;
    int sizeBox;
    int sizeLetra;
    String[] objetos;
    Inventario inventario;
    CrafterStage crafter;

    public MaterialesCrafter(int sizeBox, int sizeLetra, String[] objetos, Inventario inventario, CrafterStage crafter){

        n = objetos.length;
        this.sizeBox= sizeBox;
        this.sizeLetra = sizeLetra;
        this.objetos= objetos;
        this.inventario = inventario;
        this.crafter = crafter;
        setObjetos();
    }

    private void setObjetos(){
        for( int i=0; i<n; i++) {
            MaterialesCrafterButton box = new MaterialesCrafterButton(inventario,objetos[i],sizeBox, crafter);
            boxes.add(box);
        }
    }

    public void updateCantidadMateriales(){
        for( int i=0; i<n; i++) {
            boxes.get(i).setCantidadDeObjetos();
        }
    }

    public VBox getVisual(){

        VBox materialesDisponibles = new VBox();
        materialesDisponibles.getChildren().add(getTitle(sizeBox,sizeBox/6,sizeLetra));
        for(int i=0; i<n; i++) {materialesDisponibles.getChildren().add(boxes.get(i).getVisual());};
        materialesDisponibles.setAlignment(Pos.CENTER);
        return materialesDisponibles;
    }


    private Label getTitle(int ancho, int alto, int size){
        AlgocraftTittle title = new AlgocraftTittle("Materiales",ancho, alto, size);
        return title.getVisual();
    }
}
