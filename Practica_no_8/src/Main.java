
public class Main {
    public static void main(String[] args) {

        //creamos el primer objeto
        Spartan masterChief = new Spartan();

        // usamos sus atributos
        masterChief.nombre="John";
        masterChief.salud=100;
        masterChief.escudo=60;
        masterChief.armaPrincipal="Rifle de asalto";

        //invocamos los metodos
        masterChief.mostrarInfo();
        masterChief.Atacar("Grunt");
        masterChief.RecargarArma(75);
        masterChief.Correr(true);

        //Creamos el Segundo Objeto
        Spartan Margarito = new Spartan();

        Margarito.nombre="Margarito";
        Margarito.salud=150;
        Margarito.escudo=260;
        Margarito.armaPrincipal="Pistola chiquita";

        Margarito.mostrarInfo();
        Margarito.Atacar("Changoleon");
        Margarito.RecargarArma(30);
        Margarito.Correr(false);

    }
}