import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("¿Cuál es tu nombre? ");
            String nombre = scanner.nextLine();
            System.out.println("Hola " + nombre + ". Este programa está hecho en el lenguaje de programación: Java.");
        }
    }
}
