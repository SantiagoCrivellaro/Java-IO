import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWirter {
    public static void main(String[] args) {
        try {

            // Escribir

            BufferedWriter escritor = new BufferedWriter((new FileWriter("ejemplo.txt")));
            escritor.write("Hola, este es un ejemplo usando BufferedWriter");
            escritor.newLine();
            escritor.close();
        

        // Leer 

        BufferedReader lector = new BufferedReader(new FileReader("Ejemplo.txt"));
        String linea;

        while ((linea = lector.readLine()) != null) {
            System.out.println(linea);
        } 
        lector.close();
    }   catch (IOException e) {
        e.printStackTrace();
        }
    }
}
