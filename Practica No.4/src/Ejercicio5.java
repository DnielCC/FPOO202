import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Digite el operador +, para hacer una suma ");
                System.out.println("Digite el operador -, para hacer una resta ");
                        System.out.println("Digite el operador *, para hacer una multiplicacion ");
                                System.out.println("Digite el operador /, para hacer una divicion ");
                                  String operador = sc.next();
        switch (operador) {

            case "+":{
                int suma=num1+num2;
                System.out.println("La suma es: "+suma);
            } break;
            case "-":{
                int resta=num1-num2;
                System.out.println("La resta es: "+resta);
            } break;
            case "*":{int multiplicacion=num1*num2;
            System.out.println("La multiplicacion es: "+multiplicacion);} break;

            case "/":{int division=num1/num2;
            System.out.println("La division es: "+division);
            } break;
        }
    }
}
