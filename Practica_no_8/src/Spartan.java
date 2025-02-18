public class Spartan {

    public String nombre;
    public int salud,escudo;
    public String armaPrincipal;

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
        System.out.println(armaPrincipal+" ahora tiene disponible " + total + " balas");
    }
    public void Correr(Boolean status){
        if (status){
            System.out.println(nombre + " esta corriendo");
        }else{
            System.out.println(nombre + " se detuvo");
        }
    }
}
