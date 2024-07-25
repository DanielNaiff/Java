import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position: "+e);
        } catch (InputMismatchException e){
            System.out.println(e);
        }


        System.out.println("Fim do programa");

        sc.close();
    }
}