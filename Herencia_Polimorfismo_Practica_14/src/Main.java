//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SpartanII jefemaestro = new SpartanII("jhon",90,"rifle de asalto",0);
        jefemaestro.mostrarInfo();
        jefemaestro.usarManejoAvanzado();
        jefemaestro.atacar("Covenant");
        jefemaestro.recibirDano(50);
        jefemaestro.recargarEscudo();

        SpartanIII Skywalker =new SpartanIII("Luke",100,"Sable lazer",0);
        Skywalker.mostrarInfo();
        Skywalker.camuflajeActivo();
        Skywalker.atacar("Palpatin");
        Skywalker.recibirDano(50);
        Skywalker.recargarEscudo();

        SpartanIV Ren =new SpartanIV("Kylo",120,"Sable lazer T",0);
        Ren.mostrarInfo();
        Ren.usarPropulsores();
        Ren.atacar("Palpatin");
        Ren.recibirDano(50);
        Ren.recargarEscudo();

    }
}