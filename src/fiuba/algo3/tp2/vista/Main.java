package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.controller.AlgocraftTittle;
import fiuba.algo3.tp2.controller.Mapa.MapaGridPane;
import fiuba.algo3.tp2.controller.MenuPrincipal;
import fiuba.algo3.tp2.modelo.*;
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
    public static BorderPane layout;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        juego = new Juego();

        width = Screen.getPrimary().getVisualBounds().getWidth()*0.8;
        heigth = Screen.getPrimary().getVisualBounds().getHeight();

        primaryStage.setTitle("Algocraft");

        layout = new BorderPane();


        layout.setTop(getTitle());
        layout.setRight(getMenuPrincipal());
        layout.setCenter(getMap());

        Scene theScene = new Scene(layout, width, heigth);
        primaryStage.setScene(theScene);

        primaryStage.show();

    }

    private HBox getTitle(){
        AlgocraftTittle algocraftTittle = new AlgocraftTittle("Algocraft",width, heigth/12,heigth/24);
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
        return map.getVisaul();
    }


}