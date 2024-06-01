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

        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMenbro(4);
        c.usarBolsa();
        c.locomover();
        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMenbro(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
    }
}