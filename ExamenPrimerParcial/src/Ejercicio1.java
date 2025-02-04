import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Digite la opción que en la que desea hacer la converción:");
             System.out.println("1.- Grados centrigrados");
             System.out.println("2.- Grados Farenheit");
             System.out.println("3.- Grados Kelvin");
             int opcion = sc.nextInt();

             switch (opcion){
                 case 1:
                     System.out.println("Digite la temperatura en (Fahrenheit) para obtener " +
                             "los datos en centrigrados.");
                     double farenheit = sc.nextDouble();
                     double grados = (farenheit - 32) * 5 / 9;
                     System.out.println("La temperatura en grados centrigrados es: " + grados);
                     break;

                 case 2:
                     System.out.println("Digite la temperatura en (centigrados) para obtener los datos en fahrenheit.");
                     int centigrados = sc.nextInt();

                     double f2 = (centigrados * 9 / 5) + 32;
                     System.out.println("La temperatura en grados fahrenheit es: " + f2);

                 case 3:
                     System.out.println("Digite la temperatura en (Centrigrados) para obtener los datos en centrigrados.");
                     int centigrados2 = sc.nextInt();
                             double gradosk= (centigrados2+273.15);
                             System.out.print("La temperatura en grados kelvin es de: "+gradosk);
                             break;

             }
    }
}