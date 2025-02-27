import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] opciones = {"Ingresar efectivo", "Retirar efectivo", "Realizar deposito", "Salir"};

        Cajero cuenta1 = new Cajero(0," ",0,0);

        JOptionPane.showMessageDialog(null, "Bienvenido");
        JOptionPane.showMessageDialog(null, "Digite sus datos para continuar: ");

        cuenta1.setNumerocuenta(Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de cuenta: "))+ cuenta1.getNumerocuenta());
        cuenta1.setNombretitular(JOptionPane.showInputDialog("ingrese el nombre del cuenta: " )+ cuenta1.getNumerocuenta());
        cuenta1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("ingrese el edad: "))+cuenta1.getEdad());
        cuenta1.setSaldoincial(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el saldo inicial"))+ cuenta1.getSaldoincial());

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