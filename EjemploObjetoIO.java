import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Persona implements Serializable {
        String nombre;
        int edad;

        Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
    }
}


public class EjemploObjetoIO { 
    public static void main(String[] args) {
    
        try {
            // Serializar un Objeto

            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("persona.ser"));
            salida.writeObject(new Persona("Juan", 30));
            salida.close();


            // Deserializar el objeto

            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("persona.ser"));
            Persona p = (Persona) entrada.readObject();
            System.out.println("Nombre :" + p.nombre + "Edad : " + p.edad);
            entrada.close();
        } catch (IOException | ClassNotFoundException e ) {
            e.printStackTrace();
        }
    }

    
}


