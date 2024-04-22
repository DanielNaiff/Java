package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 1000000000l;
        long numeroGrande =(long) 155.23;
        double salarioDouble = 2000D;
        float salarioFloat =(float) 2500.0D;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "É Um grande texto";

        System.out.println("A idade é "+idade+" anos");
        System.out.println("Oi meu nome é "+ nome);
    }
}
