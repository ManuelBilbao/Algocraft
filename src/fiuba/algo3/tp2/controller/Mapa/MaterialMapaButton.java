package fiuba.algo3.tp2.controller.Mapa;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.mapa.Casillero;
import fiuba.algo3.tp2.modelo.materiales.bloques.Diamante;
import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;
import fiuba.algo3.tp2.modelo.materiales.bloques.Metal;
import fiuba.algo3.tp2.modelo.materiales.bloques.Piedra;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class MaterialMapaButton {

    public Label label;

    public MaterialMapaButton( Casillero casillero, double ancho, double alto){

        label = new Label();

        label.setPrefWidth(ancho);
        label.setPrefHeight(alto);

        Image image = new Image("file:img/block_" + getMaterialNombre(casillero) + ".png",ancho,alto,false,false);
        label.setGraphic(new ImageView(image));

        label.setPadding(new Insets(0, 0, 0, 0));

    }

    private String getMaterialNombre( Casillero casillero){

        Casillero casilleroMadera = new Casillero();
        casilleroMadera.ocupar(new Madera());
        Casillero casilleroPiedra = new Casillero();
        casilleroPiedra.ocupar(new Piedra());
        Casillero casilleroMetal = new Casillero();
        casilleroMetal.ocupar(new Metal());
        Casillero casilleroDiamante = new Casillero();
        casilleroDiamante.ocupar(new Diamante());
        Casillero casilleroJugador = new Casillero();
        casilleroJugador.ocupar(new Jugador());

        if(casillero.equals(casilleroMadera)){ return "madera";}
        else if(casillero.equals(casilleroPiedra)){ return "piedra";}
        else if(casillero.equals(casilleroMetal)){ return "metal";}
        else if(casillero.equals(casilleroDiamante)){ return "diamante";}
        else if(casillero.equals(casilleroJugador)) { return "jugador"; }
        else { return "pasto";}

    }


    public Label getVisual(){ return label; }
}
