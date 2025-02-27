import javax.swing.*;

public class Cajero {

   private  int numerocuenta;
   private  String nombretitular;
    private  int edad;
    private int saldoincial;

    public Cajero(int numerocuenta, String nombretitular, int edad, int saldoincial) {
        this.numerocuenta = numerocuenta;
        this.nombretitular = nombretitular;
        this.edad = edad;
        this.saldoincial = saldoincial;
    }

        public void ingresarefectivo(){
            int ingreso=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad que deseas ingresar: "));
            int saldoactual= saldoincial+ingreso;
            JOptionPane.showMessageDialog(null,"el total es de: "+ (saldoincial+ingreso));
        }

        public void retirarefectivo(){
            int retiro=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese ela cantidad que deseas retirar: "));
            int saldoactual= saldoincial-retiro;
            JOptionPane.showMessageDialog(null,"el total es de: "+ (saldoincial-retiro));

        }

        public void Trasnferencia(){
             int onocuenta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta"));
             String onombre=JOptionPane.showInputDialog("Ingrese el nombre del titular");
             int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad"));

             JOptionPane.showMessageDialog(null,"el deposito es de: "+ cantidad +"\n"+ "A la cuenta: "+onocuenta+"\n"+ "El titular es de: "+ onombre +"\n"
             + "El saldo restante es de : "+ (saldoincial-cantidad));



        }

    public String getNombretitular() {
        return nombretitular;
    }

    public void setNombretitular(String nombretitular) {
        this.nombretitular = nombretitular;
    }

    public int getSaldoincial() {
        return saldoincial;
    }

    public void setSaldoincial(int saldoincial) {
        this.saldoincial = saldoincial;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }


}






