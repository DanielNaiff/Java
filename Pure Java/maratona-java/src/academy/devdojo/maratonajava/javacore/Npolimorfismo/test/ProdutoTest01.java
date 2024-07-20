package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadorImposto;

import java.util.Comparator;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate siciliando", 10);

        CalculadorImposto.calcularImpostoTomate(tomate);
        System.out.println("-=-=-=-=-=-=-=-=-=-");
        CalculadorImposto.calcularImpostoComputador(computador);
    }
}
