package fiuba.algo3.tp2.controller;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class AlgocraftButton {

    public Button button;

    public AlgocraftButton(String mensaje, double ancho, double alto, double size){

        Font fontMinecraft = Font.loadFont("file:img/Minecrafter.Alt.ttf", size);


        button = new Button(mensaje);

        button.setFont(fontMinecraft);
        button.setTextFill(Color.web("#ffffff"));

        button.setPrefWidth(ancho);
        button.setPrefHeight(alto);

        button.setAlignment(Pos.CENTER);
        button.setStyle("-fx-border-color: white;");

        BackgroundImage background = new BackgroundImage(new Image("file:img/titleBackground.png"), BackgroundRepeat.REPEAT,BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        button.setBackground(new Background(background));

    }

    public Button getVisual(){ return button; }
}
