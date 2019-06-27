package fiuba.algo3.tp2.controller.Mapa;

import fiuba.algo3.tp2.controller.MenuPrincipal;
import fiuba.algo3.tp2.modelo.Juego;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.desgastes.NoPoseeDurabilidadException;
import fiuba.algo3.tp2.modelo.herramientas.Herramienta;
import fiuba.algo3.tp2.modelo.mapa.CasilleroOcupadoException;
import fiuba.algo3.tp2.modelo.mapa.Mapa;
import fiuba.algo3.tp2.modelo.mapa.Posicion;
import fiuba.algo3.tp2.modelo.materiales.bloques.Material;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;


public class MapaGridPane {

    private GridPane mapaGridPane;

    private Mapa mapa;
    private Jugador jugador;
    private Juego juego;
    private MenuPrincipal menu;

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


    public void jugadorUsarHerramienta(String ultimoComando, MenuPrincipal menu){

        this.menu = menu;

        Herramienta herramienta = getHerramieta();
        if(herramienta==null) {return;}

        Posicion posJugador = juego.getMapa().getPosicionJugador();
        Posicion posBloque = new Posicion(posJugador.getFila(), posJugador.getColumna());
        Material bloque = null;



        try {

            if (ultimoComando == "A") {
                bloque = juego.golpearIzquierda(herramienta);
                posBloque.moverIzquierda();
            } else if (ultimoComando == "D") {
                bloque = juego.golpearDerecha(herramienta);
                posBloque.moverDerecha();
            } else if (ultimoComando == "W") {
                bloque = juego.golpearArriba(herramienta);
                posBloque.moverArriba();
            } else if (ultimoComando == "S") {
                bloque = juego.golpearAbajo(herramienta);
                posBloque.moverAbajo();
            } else {
                return;
            }

        } catch (NullPointerException e){
        } catch (NoPoseeDurabilidadException e){
        }

        if (herramienta.getDurabilidad()<=0) {
            juego.getJugador().getInventarioHerramientas().sacar(menu.getHerramientaEquipada());
            menu.desequiparHerramienta();
        }

        if (bloque!=null && bloque.getDurabilidad()<=0){
            juego.getJugador().getInventarioMateriales().agregar(bloque.toString().toLowerCase(), bloque);
            limpiarCasillero(posBloque.getFila(), posBloque.getColumna());
            juego.getMapa().liberarCasillero(posBloque);
        }

    }

    private Herramienta getHerramieta(){
        Herramienta h;
        try{
            h = (Herramienta) jugador.getInventarioHerramientas().getElemento(menu.getHerramientaEquipada());
        } catch (NullPointerException e){
            return null;
        }
        return  h;
    }

    public GridPane getVisual(){ return mapaGridPane;}

}
