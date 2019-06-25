package fiuba.algo3.tp2.controller.Mapa;

import fiuba.algo3.tp2.modelo.Juego;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.mapa.CasilleroOcupadoException;
import fiuba.algo3.tp2.modelo.mapa.Mapa;
import fiuba.algo3.tp2.modelo.mapa.Posicion;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;


public class MapaGridPane {

    private GridPane mapaGridPane;

    private Mapa mapa;
    private Jugador jugador;
    private Juego juego;

    private double altoCelda = 20;
    private double anchoCelda = 20;

    private int n;
    private int m;

    public MapaGridPane(Juego juego, double ancho, double alto) {

        this.jugador = juego.getJugador();
        this.juego = juego;
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

                MaterialMapaLabel label = new MaterialMapaLabel(mapa.getCasillero(i, j), anchoCelda, altoCelda);
                mapaGridPane.add(label.getVisual(), j, i);
            }
        }

    }



    private void setJugadorEnTablero() {

        int x = mapa.getPosicionJugador().getFila();
        int y = mapa.getPosicionJugador().getColumna();

        MaterialMapaLabel label = new MaterialMapaLabel(mapa.getCasillero(x, y),anchoCelda, altoCelda);
        Label jugadorLabel = label.getVisual();
        jugadorLabel.setGraphic(new ImageView(new Image("file:img/jugador.png", altoCelda,anchoCelda,false,false)));
        mapaGridPane.add(jugadorLabel, y, x);
    }


    private void limpiarCasillero(int x, int y){

        MaterialMapaLabel label = new MaterialMapaLabel(mapa.getCasillero(x, y),anchoCelda, altoCelda);
        Label jugadorLabel = label.getVisual();
        jugadorLabel.setGraphic(new ImageView(new Image("file:img/block_pasto.png", altoCelda,anchoCelda,false,false)));
        mapaGridPane.add(jugadorLabel, y, x);
    }

    private void limpiarJugadorEnTablero(){
        Posicion posJugador = juego.getMapa().getPosicionJugador();
        limpiarCasillero(posJugador.getFila(), posJugador.getColumna());
    }


    public void jugadorMoverArriba(){
        try{
            limpiarJugadorEnTablero();
            juego.moverJugadorArriba();
        }catch (CasilleroOcupadoException e){
        } finally {
            setJugadorEnTablero();
        };
    }

    public void jugadorMoverAbajo(){
        try{
            limpiarJugadorEnTablero();
            juego.moverJugadorAbajo();
        }catch (CasilleroOcupadoException e){
        } finally {
            setJugadorEnTablero();
        };
    }

    public void jugadorMoverDerecha(){

        try{
            limpiarJugadorEnTablero();
            juego.moverJugadorDerecha();
        }catch (CasilleroOcupadoException e){
        } finally {
            setJugadorEnTablero();
        };
    }

    public void jugadorMoverIzquierda(){

        try{
            limpiarJugadorEnTablero();
            juego.moverJugadorIzquieda();
        }catch (CasilleroOcupadoException e){
        } finally {
            setJugadorEnTablero();
        };
    }


    private Node getNodeByRowColumnIndex (final int fil, final int col, GridPane gridPane) {
        Node res = null;
        ObservableList<Node> childrens = gridPane.getChildren();

        for (Node node : childrens) {
            if(gridPane.getRowIndex(node) == fil && gridPane.getColumnIndex(node) == col) {
                res = node;
                break;
            }
        }
        return res;
    }

    public GridPane getVisual(){ return mapaGridPane;}

}
