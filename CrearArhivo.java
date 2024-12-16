import java.io.File;
import java.io.IOException;



public class CrearArhivo {
    public static void main(String[] args) {
        
        // Creamos una referencia a un archivo.

        File archivo = new File("ejemplo.txt");

        // Verificamos y creamos.
        if(!archivo.exists()) {
            try {
                archivo.createNewFile();
                System.out.println("Archivo Creado :" + archivo.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}