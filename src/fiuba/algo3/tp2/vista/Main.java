package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.controller.AlgocraftTittle;
import fiuba.algo3.tp2.controller.Mapa.MapaGridPane;
import fiuba.algo3.tp2.controller.MenuPrincipal;
import fiuba.algo3.tp2.modelo.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;


public class Main extends Application {

    public Juego juego;

    public  MediaPlayer mediaPlayer;

    public static double width;
    public static double heigth;
    public static BorderPane layout;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        juego = new Juego();

        width = Screen.getPrimary().getVisualBounds().getWidth()*0.8;
        heigth = Screen.getPrimary().getVisualBounds().getHeight();

        MapaGridPane mapaGridPane =  new MapaGridPane(juego, width, heigth);

        primaryStage.setTitle("Algocraft");

        layout = new BorderPane();

        layout.setTop(getTitle());
        layout.setRight(getMenuPrincipal());
        layout.setCenter(mapaGridPane.getVisual());


        Scene theScene = new Scene(layout, width, heigth);
        primaryStage.setScene(theScene);

        Media musicFile = new Media(new File("/home/josefina/Algocraft/media/Minecraft-soundtrack.wav").toURI().toString());
        mediaPlayer = new MediaPlayer(musicFile);
        mediaPlayer.setAutoPlay(true);

        layout.setOnKeyPressed(new EventHandler<KeyEvent>() {

            String ultimoComando = "null";

            public void handle(KeyEvent event) {
                if(event.getCode() == KeyCode.W) {
                    ultimoComando = "W";
                    mapaGridPane.jugadorMoverArriba();
                }
                if( event.getCode() == KeyCode.S) {
                    ultimoComando = "S";
                    mapaGridPane.jugadorMoverAbajo();
                }
                if (event.getCode() == KeyCode.D) {
                    ultimoComando = "D";
                    mapaGridPane.jugadorMoverDerecha();
                }
                if (event.getCode() == KeyCode.A) {
                    ultimoComando = "A";
                    mapaGridPane.jugadorMoverIzquierda();
                }
                /*
                if (event.getCode() == KeyCode.SPACE){
                    mapaGridPane.jugadorUsarHerramienta(ultimoComando);
                }
                */
                event.consume();
            }

        });

        primaryStage.show();

    }

    private HBox getTitle(){
        AlgocraftTittle algocraftTittle = new AlgocraftTittle("Algocraft",width*1.3, heigth/12,heigth/24);
        HBox title = new HBox(algocraftTittle.getVisual());
        title.setAlignment(Pos.CENTER);
        return title;
    }

    private VBox getMenuPrincipal(){
        MenuPrincipal menuPrincipal= new MenuPrincipal(juego.getJugador(), width, heigth/8);
        return menuPrincipal.getVisual();
    }

    private GridPane getMap(){
        MapaGridPane map = new  MapaGridPane(juego, width, heigth);
        return map.getVisual();
    }


}