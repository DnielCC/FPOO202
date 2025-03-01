import javax.swing.*;

public class entregas {

    private int numeroguia;
    private String estado;

    public entregas(String estado, int numeroguia) {
        this.estado = "pendiente";
        this.numeroguia = numeroguia;
    }
        public void acestado(){

        String nestado= JOptionPane.showInputDialog("Ingrese su estado (En tránsito) o (Entregado)");
        this.estado = nestado;
        }




    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroguia() {
        return numeroguia;
    }

    public void setNumeroguia(int numeroguia) {
        this.numeroguia = numeroguia;
    }


}
