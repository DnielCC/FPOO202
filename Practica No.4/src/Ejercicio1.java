import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        String ContraseñaAlmacenada = "contra";

        Scanner scn= new Scanner(System.in);
        System.out.println("Por favor digite una contraseña: ");
        String contra= scn.nextLine();

        System.out.println("Digite nuevamente su contraseña: ");
        String contra2= scn.nextLine();

         if(contra.equalsIgnoreCase(contra2)){
            System.out.println("Su contraseña se guardo correctamente");
        }
        else if(contra!=contra2){
            System.out.println("No se guardo correctamente, Digite nuevamente");
        }


    }
}
