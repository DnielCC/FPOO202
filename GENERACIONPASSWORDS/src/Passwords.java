import javax.swing.JOptionPane;
import java.util.Random;

public class Passwords {

    int longitud;

    public int ingresolongitud(){
        JOptionPane.showMessageDialog(null, "Bienvenido.");
         longitud=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de digitos que tendra la contraseña: "));
        return longitud;
    }







}
