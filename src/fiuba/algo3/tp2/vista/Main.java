package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.modelo.*;
import fiuba.algo3.tp2.vista.AlgocraftPlantilla.LabelTitle;
import fiuba.algo3.tp2.vista.MenuPrincipal.CrafterMenu;
import fiuba.algo3.tp2.vista.MenuPrincipal.InventarioMenu;
import fiuba.algo3.tp2.vista.MenuPrincipal.MaterialesDisponiblesMenu;
import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;


public class Main extends Application {

    public Juego juego;


    public static double width;
    public static double heigth;
    int sizeGame = 5;

    private BorderPane mainPage;

    public HBox menuInicial;
    public CrafterMenu crafterMenu;
    public InventarioMenu inventarioMenu;
    public MaterialesDisponiblesMenu materialesDisponiblesMenu;



    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        juego = new Juego();

        width = Screen.getPrimary().getVisualBounds().getWidth() * 0.8;
        heigth = Screen.getPrimary().getVisualBounds().getHeight() * 0.8;

        mainPage = new BorderPane();
        primaryStage.setTitle("Algocraft");

        setMenuPrincipal();
        setTitle();
/*
        mapaGrid = new MapaGrid();
        mainPage.setCenter(mapaGrid.getVisual());
*/
        Scene theScene = new Scene(mainPage);
        primaryStage.setScene(theScene);

        primaryStage.show();

    }

    private void setMenuPrincipal(){

        menuInicial = new HBox();

        crafterMenu = new CrafterMenu();
        inventarioMenu = new InventarioMenu();
        materialesDisponiblesMenu = new MaterialesDisponiblesMenu();

        menuInicial.getChildren().setAll( materialesDisponiblesMenu.getVisual(), crafterMenu.getVisual(), inventarioMenu.getVisual());

        mainPage.setBottom(menuInicial);


    }

    private void setTitle(){
        LabelTitle label  = new LabelTitle("Algocraft", width, heigth/6, heigth/6);
        mainPage.setTop(label.getVisual());
    }



}
