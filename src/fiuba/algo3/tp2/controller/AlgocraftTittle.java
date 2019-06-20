package fiuba.algo3.tp2.controller;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class AlgocraftTittle {

    public Label label;

    public AlgocraftTittle(String mensaje, double ancho, double alto, double size){

        Font fontMinecraft = Font.loadFont("file:img/Minecrafter.Alt.ttf", size);

        label = new Label(mensaje);

        label.setFont(fontMinecraft);
        label.setTextFill(Color.web("#ffffff"));

        label.setPrefSize(ancho, alto);

        label.setAlignment(Pos.CENTER);
        label.setStyle("-fx-border-color: white;");

        Image image = new Image("file:img/titleBackground.png");
        BackgroundImage background = new BackgroundImage(image, BackgroundRepeat.REPEAT,BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        label.setBackground(new Background(background));

    }

    public Label getVisual(){ return label; }
}
