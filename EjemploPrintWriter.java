import java.io.IOException;
import java.io.PrintWriter;

public class EjemploPrintWriter {
    
    public static void main(String[] args) {
        try {
            PrintWriter escritor = new PrintWriter("salida.txt");
            escritor.println("Esto es una linea de texto");
            escritor.printf("Numero formateado : %.2f", 123.456);
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
