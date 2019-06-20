package fiuba.algo3.tp2.modelo.mapa;
import fiuba.algo3.tp2.modelo.materiales.bloques.*;

import java.io.*;
import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class InicializarMateriales {


    public void inicializacionMateriales(HashMap<Posicion, Casillero> casilleros) {

        try {
            String relativePath = new File("").getAbsolutePath();
            FileReader archivo = new FileReader(relativePath + "/src/fiuba/algo3/tp2/modelo/mapa/distribucion_mapa.txt");
            BufferedReader buffer = new BufferedReader(archivo);

            String linea = buffer.readLine();
            while (linea != null) {
                String[] datos = linea.split(";");

                Material material = null;
                switch (datos[0]) {
                    case "madera":
                        material = new Madera();
                        break;
                    case "piedra":
                        material = new Piedra();
                        break;
                    case "metal":
                        material = new Metal();
                        break;
                    case "diamante":
                        material = new Diamante();
                        break;
                }

                int fila = parseInt(datos[1]);
                int columna = parseInt(datos[2]);

                casilleros.get(new Posicion(fila, columna)).ocupar(material);

                linea = buffer.readLine();
            }
        } catch (IOException e) {
            return;
        }
    }

}



