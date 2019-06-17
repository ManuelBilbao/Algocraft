package fiuba.algo3.tp2.vista.AlgocraftPlantilla;

import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class LabelTitle {

    public Label label;

    public LabelTitle(String mensaje, double ancho, double alto, double size){

        Font fontMinecraft = Font.loadFont(getClass().getClassLoader().getResource("Minecrafter.Alt.ttf").toExternalForm(), size);


        label = new Label(mensaje);

        label.setFont(fontMinecraft);
        label.setTextFill(Color.web("#ffffff"));

        label.setMinWidth(ancho);
        label.setMinHeight(alto);

        label.setAlignment(Pos.CENTER);

        BackgroundImage background = new BackgroundImage(new Image("titleBackground.png"), BackgroundRepeat.REPEAT,BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        label.setBackground(new Background(background));



    }

    public Label getVisual(){ return label; }
}
