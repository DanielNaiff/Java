import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.println("Quantos numeros voce vai digitar?");
            int n = sc.nextInt();

            if(n > 10){
                System.out.println("A quantidade de numeros precisa ser menor que 10");
            }else {
                int[] vect = new int[n];

                for(int i=0; i<vect.length; i++){
                    System.out.println("Digite um numero:");
                    vect[i] = sc.nextInt();
                }

                System.out.println("NUMEROS NEGATIVOS");

                for(int i=0; i<vect.length; i++){

                    if(vect[i] < 0){
                        System.out.println(vect[i]);
                    }
                }
                break;
            }


        }



        sc.close();
    }
}