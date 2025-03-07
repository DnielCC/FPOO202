import javax.swing.*;

public class Conductor extends empleado {



    private String licencia;

    public Conductor(String nombre, int id, double salario,String licencia ) {
        super(nombre, id, salario);
        this.licencia = licencia;
    }
    @Override
    public void mostrarinfo() {
        JOptionPane.showMessageDialog(null, "El nombre del conductor asignado es: \n"+    nombre+"El edad del conductor asignado es: \n"+  id+"+El salario del conductor es: \n"+    salario+"El licencia del conductor es: \n"+licencia);

    }
    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

}