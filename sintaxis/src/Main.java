//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//zona de importacion

import java.util.Scanner;

//clase principal//
public class Main {
    //metodo main //
    public static void main(String[] args) {
        /*
        System.out.println("hola mundo");
        System.out.println("hola Eros");
        System.out.println("hola Eros"); */

        // 2. cadenas (strings)

        /*para concatenar se usa el signo de + y con comillas dobles*/

        String cadena= "eros" + "cano" + "cabrera";
        System.out.println(cadena.length());
        System.out.println(cadena);
        /*extraccion de caracteres en base a ciertos parametros*/
      System.out.println(cadena.substring(2,5));
        System.out.println(cadena.substring(2));
        System.out.println(cadena.substring(0,5));

        //Variables

        String cadena2= "333",cadena3, cadena4;
        int entero=3, entero2,entero3;
        double decimal=3.3,decimal2,decimal3;

        //convertir cadena a entero (int)

        entero2= Integer.parseInt(cadena2);
        System.out.println(entero2);

        //convertir double a int

        entero3=(int) decimal;
        System.out.println(entero3);

        //convertir double a cadena
        cadena3= String.valueOf(decimal);

        //convertir int a double
        decimal2= Double.valueOf(entero);
        System.out.println(decimal2);

        //conversion implicita
        int i=12 ;
        double numd= i;
        System.out.println(numd);

        //solicitud de datos

        Scanner scn= new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena7 = scn.nextLine(); /*si es cadena se usa nextline*/

        System.out.println("Escriba un numero entero");
        int numero= scn.nextInt(); /*nextint para enteros*/

        System.out.println("Escribe un numero decimal");
        double decimal5 = scn.nextDouble(); /* nextDouble es para double o (decimal)*/

        System.out.println(" la cadena guardada es:" + cadena7);
        System.out.println("El numero guardado es:"+ numero);
        System.out.println("El numero guardado es:" + decimal5);

        // boolean, operador logico y de comparacion siempre devuelven 1 boolean
        System.out.println(10>9);
        System.out.println(10==9);
        System.out.println(10<9);
        System.out.println(10>=9);
        System.out.println(10<=9);
        System.out.println(10!=9);

        //opera logicos
        int x=3;
        System.out.println(x<5 && x>10);
        System.out.println(x<5 || x>10);
        System.out.println(!(x<5 || x>10));
        System.out.println(!(x<5 || x>10));



    }
}