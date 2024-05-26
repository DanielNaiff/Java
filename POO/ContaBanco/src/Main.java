//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();

        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();

        p2.setNumConta(2222);
        p2.setDono("Creusa");
        p2.abrirConta("CP");

        p1.estadoAtual();
        p2.estadoAtual();
    }
}