import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] opciones = {"Ingresar efectivo", "Retirar efectivo", "Realizar deposito", "Salir"};
        Cajero cuenta1 = new Cajero();

        JOptionPane.showMessageDialog(null, "Bienvenido");
        JOptionPane.showMessageDialog(null, "Digite sus datos para continuar: ");
        cuenta1.pedirdatos();
        while (true) {
            int eleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "MENU", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            do {
                switch (eleccion) {
                    case 0:
                        cuenta1.ingresarefectivo();
                        break;
                    case 1:
                        cuenta1.retirarefectivo();
                        break;
                    case 2:
                        cuenta1.Trasnferencia();
                        break;
                }
            } while (eleccion == 3);

        }
    }

}