import java.util.Scanner;

public class Practica_no5_ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 0;

        System.out.println("Ingrese las operaciones"+ "D" + "cantidad para depósito"+"R"+"cantidad del retiro");
        System.out.println("Si desea salir Presione enter");
        while (true) {
            String linea = scanner.nextLine();
            if (linea.isEmpty()) {
                break;
            }

            char operacion = linea.charAt(0);
            int cantidad = Integer.parseInt(linea.substring(2));

            if (operacion == 'D') {
                saldo += cantidad;
            } else if (operacion == 'R') {
                if(saldo ==0) {
                    System.out.println("Saldo insuficiente");
                }else {
                    saldo -= cantidad;
                }

            }
        }

        System.out.println("Saldo final: " + saldo + " pesos");

    }
}
