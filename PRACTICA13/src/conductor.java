import javax.swing.*;

public class conductor {

    private String nombre;
    private final String licencia;
    private final String identificacion;

    public conductor(String nombre,String identificacion, String licencia) {
        this.nombre = nombre;

        this.identificacion = identificacion;
        this.licencia = licencia;
    }
    public static conductor crearConductor() {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
        String identification = JOptionPane.showInputDialog("Ingrese la identificación del conductor:");
        String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");

        return new conductor(nombre, identification, licencia);
    }




    public String getIdentificacion() {
        return identificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getLicencia() {
        return licencia;
    }



}
