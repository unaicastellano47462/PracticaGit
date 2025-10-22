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
