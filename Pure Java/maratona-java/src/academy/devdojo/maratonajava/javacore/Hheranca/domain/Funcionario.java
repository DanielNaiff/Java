package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco estático de funcionario");
    }

    {
        System.out.println("Bloco de inicializacao de funcioario 1");
    }

    {
        System.out.println("Bloco de inicializacao de funcioario 2");
    }

    public Funcionario(String nome) {
        super(nome);
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome +" recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
