import javax.swing.*;

public class registroenvios {

    private String codigoenvio;
    private String destino;
    private double peso;

    public registroenvios(String codigoenvio, String destino) {
        this.codigoenvio = codigoenvio;
        this.destino = destino;
        this.peso = peso;
    }
    public registroenvios(String codigoenvio, String destino, double peso) {
        this.codigoenvio = codigoenvio;
        this.destino = destino;
        this.peso = 0.0;
    }


    public static registroenvios crearenvio() {
        double peso = 0.0;
        String codigoenvio=JOptionPane.showInputDialog("Ingrese el codigo de envio");
        String destino = JOptionPane.showInputDialog("Ingrese el destino");
        String pesoini =JOptionPane.showInputDialog("Ingrese el peso");

        if(pesoini !=null && ! pesoini.isEmpty() ){
            peso=Double.parseDouble(pesoini);}

        if( pesoini == null || pesoini.isEmpty() ){
            return new registroenvios (codigoenvio,destino);
        } else {
        return new registroenvios(codigoenvio,destino,peso);
        }



    }


    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }




}








