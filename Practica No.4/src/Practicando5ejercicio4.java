import java.util.Scanner;
public class Practicando5ejercicio4 {
     public static void main(String[] args) {
         int numero;
            Scanner ncs = new Scanner(System.in);
            System.out.println("Ingrese un numero: ");
            numero = ncs.nextInt();

           for (int i=0; i <= numero; i++) {
               for (int j=1; j <= i; j++) {

                   System.out.print(j);



               }
               System.out.println();

           }

     }

}
