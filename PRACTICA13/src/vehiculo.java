import javax.swing.*;

public class vehiculo {

    private String placa;

    public vehiculo(String placa, String modelo, int capacidadcarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadcarga = capacidadcarga;
    }

    private String modelo;
    private int capacidadcarga;




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

