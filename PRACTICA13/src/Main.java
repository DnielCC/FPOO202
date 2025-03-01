import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        vehiculo vehiculo1 = new vehiculo("", "", 0);
        conductor conductor1 = new conductor("", "", "");
        registroenvios registroenvios1 = new registroenvios("", "", 0);
        entregas entraga1 = new entregas("", 0);
        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU:\n" + "1.-Registrar vehiculo\n" + "2.- Registrar conductor\n" +
                    "3.-Asignar conductor a Vehiculo\n" + "4.-Registrar Entrega\n" + "5.-Actualizar Estado de Entrega\n" + "6.-Mostar información\n" + "7.-Salir"));
            do {
                switch (opcion) {
                    case 1:
                        vehiculo1.setPlaca(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el placa")) + vehiculo1.getPlaca());
                        vehiculo1.setModelo(JOptionPane.showInputDialog(null, "Ingrese el Modelo: ") + vehiculo1.getModelo());
                        vehiculo1.setCapacidadcarga(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la capaciada de su carga: ") + vehiculo1.getCapacidadcarga()));
                        JOptionPane.showMessageDialog(null, "Registro realizado Exitosamente");
                        break;
                    case 2:
                        conductor.crearConductor();
                        JOptionPane.showMessageDialog(null, "Registro realizado Exitosamente");
                        break;
                    case 3:
                        vehiculo1.asigconductor();
                        JOptionPane.showMessageDialog(null, "Registro realizado Exitosamente");
                        break;
                    case 4:
                        registroenvios1.crearenvio();
                        JOptionPane.showMessageDialog(null, "Registro realizado Exitosamente");
                        break;
                    case 5:
                        entraga1.acestado();
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Registro realizado Exitosamente\n" + "la informacion registrada fue:\n " + "numero de placa: "+vehiculo1.getPlaca() +"\n"+"Modelo del vehiculo: \n"+vehiculo1.getModelo() +"Capacidad de carga: \n"+ vehiculo1.getCapacidadcarga()+"KG");
                        break;
                }
            } while (opcion == 7);
        }
    }
}
