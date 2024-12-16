import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
    public static void main(String[] args) {
        
        try {
            FileInputStream inputStream = new FileInputStream("imagen.jpg");
            FileOutputStream outputStream = new FileOutputStream("_copia_imagen.jpg");

            int byteData;

            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }

            inputStream.close();
            outputStream.close();
            System.out.println("Archivo Copiado Correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }

        

    }
}
