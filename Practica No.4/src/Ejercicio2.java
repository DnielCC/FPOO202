
import java.util.Scanner;

public class Ejercicio2 {

    static public void main(String[] args) {

    int numero;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un numero entero: ");
    numero=sc.nextInt();

     if(numero%2==0){
         System.out.println("El numero entero es: "+numero);
     } else if (numero%2==1){
         System.out.println("El numero no es entero");

     }

    }

}
