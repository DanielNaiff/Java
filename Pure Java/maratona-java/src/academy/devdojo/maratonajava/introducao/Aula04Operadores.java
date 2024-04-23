package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        double resultado2 = numero01 /(double) numero02;
        System.out.println("Valor "+resultado);
        System.out.println(resultado2);

        //%
        int resto = 20 % 2;
        System.out.println(resto);

        //< > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("Dez é maior que vinte? "+isDezMaiorQueVinte);

        //&&(and) ||(or) !
        int idade = 35;
        float salario = 3500;
        boolean isDentroDaLei = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLei "+ isDentroDaLei);
        System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta);
    }
}
