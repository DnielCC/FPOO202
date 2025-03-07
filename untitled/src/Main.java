import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {

        empleado empleado1 = new empleado("", 0, 0);
        administrativo administrativo1 = new administrativo("", 0, 0, "");
        Conductor conductor1 = new Conductor("", 0, 0, "");
        while (true){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opcion que desee: \n" + "1.-Agregar empleado.\n" + "2.-Agregar Administrativo:\n" + "3.-Agregar Conductor.\n" + "4.-Listarlos.\n" + "5.-Salir\n"));
        do {
            switch (opcion) {

                case 1:
                    empleado1.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del Empleado:") + empleado1.getNombre());
                    empleado1.setid(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del empleado")) + empleado1.getid());
                    empleado1.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado:")) + empleado1.getSalario());

                    break;

                case 2:
                    conductor1.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del Empleado:") + conductor1.getNombre());
                    conductor1.setid(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del empleado")) + conductor1.getid());
                    conductor1.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado:")) + conductor1.getSalario());
                    conductor1.setLicencia(JOptionPane.showInputDialog("Ingrese el licencia del empleado:") + conductor1.getLicencia());

                    break;

                case 3:

                    administrativo1.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del Empleado:") + administrativo1.getNombre());
                    administrativo1.setid(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del empleado")) + administrativo1.getid());
                    administrativo1.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado:")) + administrativo1.getSalario());
                    administrativo1.setDepartamento(JOptionPane.showInputDialog("Ingrese el licencia del empleado:") + administrativo1.getDepartamento());
                    administrativo1.mostrarinfo();
                    break;

                case 4:
                    empleado1.mostrarinfo();
                    conductor1.mostrarinfo();
                    administrativo1.mostrarinfo();

            }
        } while (opcion == 5);}
    }
}