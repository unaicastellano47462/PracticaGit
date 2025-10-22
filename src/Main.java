import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String cadena = "";

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            String opcion = scanner.nextLine();

            switch (opcion.toLowerCase()) {
                case "a":
                    solicitarCadena();
                    break;
                case "b":
                    mostrarCaracter();
                    break;
                case "c":
                    convertirEntero();
                    break;
                case "d":
                    convertirFecha();
                    break;
                case "e":
                    System.out.println("Programa finalizado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
    public static void mostrarMenu() {
        System.out.println("   MENÚ   ");
        System.out.println("a) Solicitar una cadena de caracteres.");
        System.out.println("b) Visualizar el caracter de la posición x de la cadena.");
        System.out.println("c) Convertir la cadena de caracteres en un número entero.");
        System.out.println("d) Convertir la cadena de caracteres en una fecha (dd/MM/yyyy).");
        System.out.println("e) Finalizar.");
        System.out.print("Seleccione una opción: ");
    }
