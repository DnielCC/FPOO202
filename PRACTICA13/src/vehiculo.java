import javax.swing.*;

public class vehiculo {

    private String placa;
    private String modelo;
    private int capacidadcarga;

    private conductor conductor;

    public vehiculo(String placa, String modelo, int capacidadcarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadcarga = capacidadcarga;
        this.conductor=null;
    }
    public vehiculo(conductor conductor) {
        this.conductor = conductor;
    }

    public void asigconductor() {
        if (this.conductor != null) {
            JOptionPane.showMessageDialog(null, "Conductor esta asignado");
            return;
        }
        String nombre=JOptionPane.showInputDialog(null, "Ingrese el nombre del conductor: ");
        String identificacion =JOptionPane.showInputDialog(null, "Ingrese la identificacion del conductor: ");
        String licencia =JOptionPane.showInputDialog(null, "Ingrese la licencia del conductor: ");

        this.conductor = new conductor(nombre, identificacion, licencia);
        JOptionPane.showMessageDialog(null, "Conductor asignado. :)");
    }


      public conductor getConductor() {
        return conductor;
        }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getCapacidadcarga() {
        return capacidadcarga;
    }
    public void setCapacidadcarga(int capacidadcarga) {
        this.capacidadcarga = capacidadcarga;
    }
}

