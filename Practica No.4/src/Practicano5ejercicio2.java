
import java.util.Scanner;
public class Practicano5ejercicio2 {
   public static void main(String[] args) {

       int entero;
       Scanner scn = new Scanner(System.in);
       System.out.print("Introduce un entero: ");
       entero = scn.nextInt();

       for (int i=entero; i >= 1; i--){

           System.out.print(","+i);
       }

   }
}
