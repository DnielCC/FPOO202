import javax.swing.*;
import java.util.Random;
public class Matricula {

    private String Nombre;
    private String Apellidopaterno;
    private String Apellidomaterno;
    private String año;
    private String Carrera;

    public Matricula(String nombre, String apellidopaterno, String apellidomaterno, String año, String carrera) {
        this.Nombre = nombre;
        this.Apellidopaterno = apellidopaterno;
        this.Apellidomaterno = apellidomaterno;
        this.año = año;
        this.Carrera = carrera;
    }

    public void generarMatricula() {

        String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        char car;
        String carrera = getCarrera().substring(0, 3);
        String apellidopaterno = getApellidopaterno().substring(0, 3);
        String apellidomaterno = getApellidomaterno().substring(0, 3);
        String añonaci= getAño().substring(2, 4);
        String nombre = getNombre().substring(0, 1);
        String curso = "25";

        Random rand = new Random();
        String aleatorio = String.valueOf(rand.nextInt(10));
        String aleatorio2 = String.valueOf(rand.nextInt(10));
        String aleatorio3 = String.valueOf(rand.nextInt(10));
        String aleatorio4 = aleatorio + aleatorio2 + aleatorio3;

        JOptionPane.showInternalMessageDialog(null,carrera+curso+añonaci+nombre+apellidopaterno+apellidomaterno+aleatorio4);






    }






    public String getApellidopaterno() {
        return Apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        Apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return Apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        Apellidomaterno = apellidomaterno;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }









}
