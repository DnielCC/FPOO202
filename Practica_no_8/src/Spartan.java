public class Spartan {

    private String nombre;
    private int salud,escudo;
    private String armaPrincipal;
    // Contructor: con los valores o el aspecto con el que arrancara nuesta clase.
    public Spartan(String nombre, int salud, int escudo, String armaPrincipal) {
        this.nombre = nombre;
        this.salud = salud;
        this.escudo = escudo;
        this.armaPrincipal = armaPrincipal;
    }

    public void mostrarInfo(){
        System.out.println("---------información del Spartan------");
        System.out.println("Nombre: "+nombre);
        System.out.println("% de Salud: "+salud);
        System.out.println("% de Escudo: "+escudo);
        System.out.println("Arma Principal: "+armaPrincipal);
        System.out.println("----------------------------------------");
    }
    public void Atacar(String enemigo){
        System.out.println(nombre+" ataca a "+ enemigo+" con "+armaPrincipal);
    }
    public void RecargarArma(int municiones){
        int restantes=10;
        int total =restantes+municiones;
        System.out.println(armaPrincipal+" ahora tiene disponible " + total + " semillas");
    }
    public void Correr(Boolean status){
        if (status){
            System.out.println(nombre + " esta corriendo");
        }else{
            System.out.println(nombre + " se detuvo");
        }
    }

    private void consultacortana(){
        System.out.println("Conversacion privada....... ");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

}