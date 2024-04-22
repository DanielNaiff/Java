package academy.devdojo.maratonajava.introducao;

/*
 * Prática
 *
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 *
 * Eu <nome>, morando no <Endereco>, confirmo que recebi o salário de <salario>, na data <data>
 * */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Daniel";
        String endereco = "Alameda São João";
        double salario = 2000;
        String data = "4/21/2024";
        String relatorio = "Eu " + nome + ", morando do " + endereco + ", confirmo que recebi o salário de" + salario + ", da data " + data;
        System.out.println(relatorio);
    }
}
