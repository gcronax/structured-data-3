import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class maps_6 {
    public static void main(String[] args) {
        Map<String, String> aux_map = new HashMap<String, String>();

        BufferedReader bufferLectura = null;
        try {
            // Abrir el .csv en buffer de lectura
            bufferLectura = new BufferedReader(new FileReader("apellidos.csv"));

            // Leer una linea del archivo
            String linea = bufferLectura.readLine();

            while (linea != null) {
                // Sepapar la linea leída con el separador definido previamente
                String[] campos = linea.split(",");

                //System.out.println(Arrays.toString(campos));
                String i=campos[0];
                String j= campos[1];


                    aux_map.put(i, j);


                // Volver a leer otra línea del fichero
                linea = bufferLectura.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            // Cierro el buffer de lectura
            if (bufferLectura != null) {
                try {
                    bufferLectura.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(aux_map);
    }

}
