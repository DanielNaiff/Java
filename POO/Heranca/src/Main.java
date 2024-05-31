//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Visitante p1 = new Visitante();
        Bolsista b1 = new Bolsista();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        b1.setNome("Daniel");
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claúdio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        b1.setIdade(23);
        b1.fazerAniv();
        b1.cancelarMatri();
        p2.pagarMensalidade();
        b1.pagarMensalidade();

        System.out.println(b1.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}