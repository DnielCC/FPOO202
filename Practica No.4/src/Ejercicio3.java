import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        int  edad, precio;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bienvenido a la sala de juegos ");
        System.out.print("Para saber el precio de su entrada. ");
        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        if(edad <= 4){
            System.out.println("Su entrada es gratis");
        } else if(edad>=5 && edad<=18){
            System.out.println("Su entrada tiene un valor de: 110 pesos.");
        } else if(edad>18){
            System.out.println("Su entrada tiene un valor de 190 pesos");

        }
    }
}
