//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Réptil r = new Réptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        k.reagir("Olá");
        k.reagir("Vai apanhar");
        k.reagir(11,45);
        k.reagir(21,00);
        k.reagir(true);
        k.reagir(false);
        k.reagir(2, 12.5f);
        k.reagir(17, 4.5f);
    }
}