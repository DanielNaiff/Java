import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        for(int i=0; i< vect.length; i++){
            sc.nextLine();

            System.out.println("Nome:");
            String name = sc.nextLine();

            System.out.println("Idade:");
            int idade = sc.nextInt();

            System.out.println("Altura:");
            double altura = sc.nextDouble();

            vect[i] = new Person(name, altura, idade);
        }

        double sum =0.0;

        for(int i=0; i<vect.length; i++){
            sum += vect[i].getAltura();
        }

        double avg = sum / vect.length;

        int somaIdade = 0;

        for(int i=0; i<vect.length; i++){
            if(vect[i].getIdade() < 16){
                somaIdade++;
            }
        }

        double media = (somaIdade/ vect.length) * 100;

        System.out.println("Altura media: " + avg);
        System.out.println("Pessoas com menos de 16 anos: " + media + "%");

        for(int i=0; i<vect.length; i++){
            if(vect[i].getIdade() < 16){
                System.out.println(vect[i].getName());
            }
        }
        sc.close();
    }
}