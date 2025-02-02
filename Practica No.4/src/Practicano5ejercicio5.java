import java.util.Scanner;

public class Practicano5ejercicio5 {
    public static void main(String[] args) {
        String frase;
        char letra;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
         frase = sc.nextLine();
        System.out.print("Ingresa una letra: ");
         letra = sc.next().charAt(0);

        int contador = 0;


        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
    }
}
