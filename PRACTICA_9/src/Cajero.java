import javax.swing.*;

public class Cajero {

    public int numerocuenta;
    public String nombretitular;
    public int edad;
    public int saldoincial;


        public void pedirdatos(){

            numerocuenta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta"));
            nombretitular=JOptionPane.showInputDialog("Ingrese el nombre del cuenta");
            edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad"));
            saldoincial=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el saldo"));
            if (saldoincial<0){
                JOptionPane.showMessageDialog(null,"El saldo no puede ser negativo");
            } else {
                JOptionPane.showMessageDialog(null,"Sus datos son: "+"\n"+"numero de cuenta: "+numerocuenta + "\n" + "Nombre de titular: "+nombretitular + "\n"+
                        "edad: "+edad + "\n" + "Saldo: "+saldoincial);
            }
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


}






