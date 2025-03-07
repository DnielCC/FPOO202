import javax.swing.*;

public class administrativo extends empleado {

    private String departamento;

    public administrativo(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario);
        this.departamento= departamento;
    }
    @Override
    public void mostrarinfo() {
        JOptionPane.showMessageDialog(null, "El nombre del conductor asignado es:\n "+nombre+"El edad del conductor asignado es: \n"+id+"El salario del conductor es:\n"+salario+"Departamento del conductor es: \n"+departamento);
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


}