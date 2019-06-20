package fiuba.algo3.tp2.controller.Mapa;

import fiuba.algo3.tp2.controller.Crafter.CrafterStage;
import fiuba.algo3.tp2.controller.Crafter.MesaButton;
import fiuba.algo3.tp2.modelo.Juego;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import fiuba.algo3.tp2.modelo.mapa.Casillero;
import fiuba.algo3.tp2.modelo.mapa.Mapa;
import fiuba.algo3.tp2.modelo.materiales.bloques.Diamante;
import fiuba.algo3.tp2.modelo.materiales.bloques.Madera;
import fiuba.algo3.tp2.modelo.materiales.bloques.Metal;
import fiuba.algo3.tp2.modelo.materiales.bloques.Piedra;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapaGridPane {

    public GridPane mapaGridPane;

    public Mapa mapa;
    public Jugador jugador;

    double altoButton = 20;
    double anchoButton = 20;

    int n = 30;

    public MapaGridPane(Juego juego, double ancho, double alto) {

        this.jugador = juego.getJugador();
        mapa = juego.getMapa();

        mapaGridPane = new GridPane();
        mapaGridPane.setAlignment(Pos.CENTER);
        mapaGridPane.setPrefSize(ancho,alto);

        setMaterialesEnTablero();
        setJugadorEnTablero();
    }

    private void setMaterialesEnTablero() {


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                MaterialMapaButton label = new MaterialMapaButton(mapa.getCasillero(i, j), anchoButton, altoButton);

                mapaGridPane.add(label.getVisual(), i, j);
            }
        }

    }

    private void setJugadorEnTablero() {

        int i =mapa.getPosicionJugador().getFila();
        int j = mapa.getPosicionJugador().getColumna();

        MaterialMapaButton label = new MaterialMapaButton(mapa.getCasillero(i, j),anchoButton,altoButton);
        Label jugadorLabel = label.getVisual();
        jugadorLabel.setGraphic(new ImageView(new Image("file:img/jugador.png",altoButton,anchoButton,false,false)));
        mapaGridPane.add(jugadorLabel, i, j);
    }

    public GridPane getVisaul(){ return mapaGridPane;}

}
