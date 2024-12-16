import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWritter {
    

    public static void main(String[] args) {
        try {
            // Escritura de texto
            // Creamos una referencia
            FileWriter escritor = new FileWriter("Ejemplo.txt");
            escritor.write("Hola, este es un ejemplo");
            escritor.close();

            String texto = "Siganme en X";

            escritor.write(texto);

            


            // Lectura de texto

            // Creamos una Referencia

            FileReader Lector = new FileReader("Ejemplo.txt");
            int caracter;
            while ((caracter = Lector.read()) != -1) {
                System.out.println((char) caracter);

            }
                Lector.close();
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }
}
