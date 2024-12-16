import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca Su Nombre, Pais y edad");

        String nombre = teclado.next();
        String pais = teclado.next();
        int edad = teclado.nextInt();

        System.out.println("Nombre :" + nombre + " Pais: " + pais + " Edad :" + edad);

        teclado.close();
    }
}
