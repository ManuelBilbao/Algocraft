package fiuba.algo3.tp2.vista;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    public static double width;
    public static double heigth;

    private BorderPane mainPage;
    public HBox mainPageBar;


    public GridPane mapaGrid;

    public Stage InventarioModule;
    public Stage CrafterModule;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        width = Screen.getPrimary().getVisualBounds().getWidth() * 0.8;
        heigth = Screen.getPrimary().getVisualBounds().getHeight() * 0.8;

        mainPage = new BorderPane();

        primaryStage.setTitle("Algocraft");


        Scene theScene = new Scene(mainPage);
        primaryStage.setScene( theScene );

        setMapa();
        setMainPageBar();


        mainPage.setBottom(mainPageBar);
        mainPage.setCenter(mapaGrid);

        primaryStage.show();

    }


    private void setMapa() {

        mapaGrid = new GridPane();

        ImageView background= new ImageView();
        background.setImage(new Image("fondo.png"));
        background.setFitHeight(heigth);
        background.setFitWidth(width);

        mapaGrid.getChildren().add(background);
    }

    private void setMainPageBar(){

        mainPageBar = new HBox();
        setInventarioModule();
        setCrafterModule();

    }

    private void setInventarioModule(){

        InventarioModule = new Stage();
        InventarioModule.setTitle("Algocraft - Inventario");
        Button botonInventario = new Button("Inventario");
        botonInventario.setOnAction(e -> { InventarioModule.show(); });

        mainPageBar.getChildren().addAll(botonInventario);

    }

    private void setCrafterModule(){

        CrafterModule = new Stage();
        CrafterModule.setTitle("Algocraft - Crafter");
        Button botonCrafter = new Button("Crafter");
        botonCrafter.setOnAction(e -> { CrafterModule.show(); });

        mainPageBar.getChildren().addAll(botonCrafter);
    }
}
