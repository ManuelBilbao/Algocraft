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

    private GridPane mapaGridPane;

    private Mapa mapa;
    private Jugador jugador;

    private double altoButton = 20;
    private double anchoButton = 20;

    private int n;
    private int m;

    public MapaGridPane(Juego juego, double ancho, double alto) {

        this.jugador = juego.getJugador();
        mapa = juego.getMapa();

        n = juego.getMapa().getAncho();
        m = juego.getMapa().getAlto();

        mapaGridPane = new GridPane();
        mapaGridPane.setAlignment(Pos.CENTER);
        mapaGridPane.setPrefSize(ancho,alto);

        setMaterialesEnTablero();
        setJugadorEnTablero();
    }

    private void setMaterialesEnTablero() {


        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {

                MaterialMapaButton label = new MaterialMapaButton(mapa.getCasillero(i, j), anchoButton, altoButton);

                mapaGridPane.add(label.getVisual(), j, i);
            }
        }

    }

    private void setJugadorEnTablero() {

        int x = mapa.getPosicionJugador().getFila();
        int y = mapa.getPosicionJugador().getColumna();

        MaterialMapaButton label = new MaterialMapaButton(mapa.getCasillero(x, y),anchoButton,altoButton);
        Label jugadorLabel = label.getVisual();
        jugadorLabel.setGraphic(new ImageView(new Image("file:img/jugador.png",altoButton,anchoButton,false,false)));
        mapaGridPane.add(jugadorLabel, x, y);
    }

    public GridPane getVisual(){ return mapaGridPane;}

}
