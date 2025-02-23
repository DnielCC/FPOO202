    import java.util.Random;
    import javax.swing.*;
    public class Passwords {
       public String maylet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        public String minlet="abcdefghijklmnopqrst1234567890";
        public String especial="@+*#%<>-!";

            public String  Generador(int length) {
                int mayusc = JOptionPane.showConfirmDialog(null,"Desea que su password tenga letras mayusculas?","Pregunta", JOptionPane.YES_NO_OPTION);
                    boolean validacionmayusculas = mayusc == JOptionPane.YES_OPTION;
                int caracter = JOptionPane.showConfirmDialog(null, "Desea que su password tenga caracteres especiales?","Pregunta", JOptionPane.YES_NO_OPTION);
                    boolean validacioncaracter = caracter == JOptionPane.YES_OPTION;
                    if(validacionmayusculas){
                        minlet += maylet;
                    }
                    if(validacioncaracter){
                        minlet += especial;
                    }
                    char [] contraseña = new char[length];
                    Random numrand = new Random();
                    for (int i=0;i< length;i++){
                        int index = numrand.nextInt(minlet.length());
                        contraseña[i] = minlet.charAt(index);

                    }
                    return new String (contraseña);



            }












    }