import java.util.Scanner;

public class practicando5ejercicio3 {
    public static void main(String[] args) {
        int entero;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un numero entero: ");
    entero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(entero+"*"+i+"="+i*entero);


        }



    }
}
