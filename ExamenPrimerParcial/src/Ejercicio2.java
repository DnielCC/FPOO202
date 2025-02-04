import java.util.Scanner;
public class Ejercicio2 {

     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
            System.out.print("Digite la palabra que desea descomponer:");
            String palabra=sc.nextLine();
                int j=0;
            for(int i=0;i<=palabra.length();i++){
                  j+=1;
                palabra.charAt(i);
                System.out.println("Letra "+j+":"+" "+palabra.charAt(i));
         }


        }



}
