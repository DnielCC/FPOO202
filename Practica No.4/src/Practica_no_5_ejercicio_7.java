import java.util.Scanner;

public class Practica_no_5_ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de * para la base ");
        int base = scanner.nextInt();

        if (base % 2 == 0) {
            System.out.println("Por favor ingresa un número impar.");
       return;
        }

        int filas = (base / 2) + 1;
        int i = 1;
        int espacios = base / 2;
        while (i <= filas) {

            int j = 1;
            while (j <= espacios) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= (2 * i - 1)) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
            espacios--;
        }
    }
}
