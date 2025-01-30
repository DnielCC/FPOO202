import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cadena");
        String cadena = scanner.nextLine();

        String reversa = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            reversa += cadena.charAt(i);
        }

        if (cadena.equals(reversa)) {
            System.out.println("la palabra "+cadena+" es palíndromo");
        }else {
            System.out.println("la palabra "+cadena+" no es palíndromo"); }
    }
}
