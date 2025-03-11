import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Matricula matricula1= new Matricula("","",""," ","");

        matricula1.setNombre(JOptionPane.showInputDialog("Ingresa el nombre : ")+matricula1.getNombre());
        matricula1.setApellidopaterno(JOptionPane.showInputDialog("Ingresa el apellido paterno: ")+matricula1.getApellidopaterno());
        matricula1.setApellidomaterno(JOptionPane.showInputDialog("Ingresa el apellido materno: ")+matricula1.getApellidomaterno());
        matricula1.setAño(JOptionPane.showInputDialog("Ingresa tu año de nacimiento: ")+matricula1.getAño());
        matricula1.setCarrera(JOptionPane.showInputDialog("Ingrese su carrera:")+matricula1.getCarrera());

        matricula1.generarMatricula();


    }
}