package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.controller.Crafter.CrafterStage;
import fiuba.algo3.tp2.controller.Inventario.InventarioStage;
import fiuba.algo3.tp2.controller.ObjetosDisponibles.ObjetosDisponibles;
import fiuba.algo3.tp2.modelo.Juego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.media.MediaPlayer;

public class MenuPrincipal {

    String[] materiales = {"madera", "piedra", "metal", "diamante"};
    VBox menuInicial;
    InventarioStage inventarioStage;
    CrafterStage craferStage;
    ObjetosDisponibles objetosDisponibles;
    Boolean sonidoActivado;

    public MenuPrincipal(Juego juego, MediaPlayer musica, double ancho, double alto, Boolean sonidoActivado){

        menuInicial = new VBox();
        objetosDisponibles = new ObjetosDisponibles(ancho/3/4, alto/7,materiales,juego);
        this.sonidoActivado = true;


        Button buttonCrafter = (new AlgocraftButton("Crafter",ancho/3,alto/3,alto/6 )).getVisual();
        craferStage =  new CrafterStage(juego);
        buttonCrafter.setOnAction(e -> {
            craferStage.getStage().showAndWait();
            objetosDisponibles.updateCantidadDeMateriales();
        });


        SoundButton botonMusica = new SoundButton(alto/6, "musica",true);
        Button buttonMusica = (botonMusica).getVisual();
        buttonMusica.setOnAction(e -> {
            if (botonMusica.prendido()) {
                botonMusica.apagar( alto / 6, "musicaMute");
                musica.stop();
            }
            else{
                botonMusica.prender(alto/6,"musica");
                musica.play();
            }
        });

        SoundButton botonSonido = new SoundButton(alto/6, "speaker", true);
        Button buttonSound = (botonSonido).getVisual();
        buttonSound.setOnAction(e -> {
            if (botonSonido.prendido()) {
                botonSonido.apagar(alto / 6, "mute");
                this.sonidoActivado = false;
            }
            else{
                botonSonido.prender(alto/6,"speaker");
                this.sonidoActivado = true;
            }
        });

        Button buttonInventario = (new AlgocraftButton("Inventario",ancho/3,alto/3, alto/6 )).getVisual();
        inventarioStage =  new InventarioStage(juego) ;
        buttonInventario.setOnAction(e -> { inventarioStage.getStage().showAndWait(); });

        menuInicial.getChildren().addAll(buttonCrafter, buttonInventario, objetosDisponibles.getVisualHBox(),buttonSound, buttonMusica);

        menuInicial.setAlignment(Pos.BOTTOM_CENTER);
        menuInicial.setSpacing(10);

    }

    public Boolean sonidoActivado(){
        return sonidoActivado;
    }

    public String getHerramientaEquipada(){
        return inventarioStage.getHerramientaEquipada();
    }
    public void desequiparHerramienta(){ inventarioStage.desequiparHerramienta();}


    public void update(){
        craferStage.updateCantidadMateriales();
        objetosDisponibles.updateCantidadDeMateriales();
    }
    public VBox getVisual(){
        menuInicial.setPadding(new Insets(30, 30, 20, 20));
        return menuInicial;}
}
