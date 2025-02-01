import java.util.Scanner;
public class Practicano5ejercicio1 {

    public static void main(String[] args) {

        int entero;

        System.out.println("Ingrese un numero entero: ");
        Scanner sc = new Scanner(System.in);
        entero = sc.nextInt();

            for (int i = 1; i < entero; i+=2) {
                System.out.print(i+",");
            }

    }


}
