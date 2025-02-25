
public class Main {
    public static void main(String[] args) {

        //creamos el primer objeto
        Spartan masterChief = new Spartan("John",100,60,"rifle de asalto");

        //invocamos los metodos
        masterChief.mostrarInfo();
        masterChief.Atacar("Grunt");
        masterChief.RecargarArma(75);
        masterChief.Correr(true);
        //uso del ger y set para cambiar atributos
        masterChief.setNombre("Eros");
        masterChief.mostrarInfo();
        System.out.println(masterChief.getNombre());


        //Creamos el Segundo Objeto
        Spartan Margarito = new Spartan("Margarito",150,260,"una naranja");

        Margarito.mostrarInfo();
        Margarito.Atacar("Changoleon");
        Margarito.RecargarArma(30);
        Margarito.Correr(false);

    }
}