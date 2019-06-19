package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.controller.MenuPrincipal;
import fiuba.algo3.tp2.modelo.*;
import fiuba.algo3.tp2.modelo.inventario.Inventario;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    public Juego juego;

    public static double width;
    public static double heigth;
    public static double sizeGame = 30;
    public static BorderPane layout;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        juego = new Juego();

        juego.getJugador().getInventarioMateriales().agregar("piedra",1);
        juego.getJugador().getInventarioMateriales().agregar("madera",1);
        juego.getJugador().getInventarioMateriales().agregar("madera",1);
        juego.getJugador().getInventarioMateriales().agregar("piedra",1);
        juego.getJugador().getInventarioMateriales().agregar("piedra",1);
        juego.getJugador().getInventarioMateriales().agregar("diamante",1);

        width = Screen.getPrimary().getVisualBounds().getWidth() * 0.8;
        heigth = Screen.getPrimary().getVisualBounds().getHeight() * 0.8;

        primaryStage.setTitle("Algocraft");
        layout = new BorderPane();

        Scene theScene = new Scene(layout, width, heigth);
        primaryStage.setScene(theScene);

        primaryStage.show();

    }

}