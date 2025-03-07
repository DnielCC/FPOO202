import javax.swing.*;
import java.awt.*;

public class empleado {

    protected String nombre;
    protected int id;
    protected double salario;

    public empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id= id;
        this.salario = salario;
    }

    public void mostrarinfo() {
        JOptionPane.showMessageDialog(null, "El nombre del conductor asignado es: \n"+nombre+"El ID del conductor asignado es: \n"+id+"El salario del conductor es: \n"+salario);

    }


    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}