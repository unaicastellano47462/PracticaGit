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
    public static void solicitarCadena() {
        System.out.print("Ingrese una cadena de caracteres: ");
        cadena = scanner.nextLine();
        System.out.println("Cadena guardada correctamente.");
    }
    public static void mostrarCaracter() {
        if (cadena.isEmpty()) {
            System.out.println("No hay cadena. Ingrese primero una cadena.");
            solicitarCadena();
        }
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("Ingrese la posición del carácter (empezando desde 0): ");
                int posicion = Integer.parseInt(scanner.nextLine());
                char caracter = cadena.charAt(posicion);
                System.out.println("El carácter en la posición " + posicion + " es: " + caracter);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número válido.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Posición fuera de rango. La cadena tiene " + cadena.length() + " caracteres.");
            }
        }
    }
    public static void convertirEntero() {
        if (cadena.isEmpty()) {
            System.out.println("No hay cadena. Ingrese primero una cadena.");
            solicitarCadena();
        }

        boolean valido = false;
        while (!valido) {
            try {
                int numero = Integer.parseInt(cadena);
                System.out.println("La cadena convertida a entero es: " + numero);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("La cadena no se puede convertir a número entero.");
                System.out.print("Ingrese una nueva cadena numérica: ");
                cadena = scanner.nextLine();
            }
        }
    }
    public static void convertirFecha() {
        if (cadena.isEmpty()) {
            System.out.println("No hay cadena. Ingrese primero una cadena.");
            solicitarCadena();
        }

        boolean valido = false;
        while (!valido) {
            try {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                formato.setLenient(false);
                Date fecha = formato.parse(cadena);
                System.out.println("La cadena convertida a fecha es: " + fecha);
                valido = true;
            } catch (ParseException e) {
                System.out.println("La cadena no tiene el formato de fecha válido (dd/MM/yyyy).");
                System.out.print("Ingrese una nueva cadena con formato dd/MM/yyyy: ");
                cadena = scanner.nextLine();
            }
        }
    }
}
