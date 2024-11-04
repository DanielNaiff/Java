import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escolha um valor para M:");
    int m = sc.nextInt();
    System.out.println("Escolha um valor para N:");
    int n = sc.nextInt();

    int[][] mat = new int[m][n];

    for(int i = 0; i<m; i++){
        for(int j=0; j<n; j++){
            mat[i][j] = sc.nextInt();
        }
    }

    System.out.println("Digite um valor para achar:");
    int x = sc.nextInt();

    int count = 0;

    for(int i = 0; i<m; i++){
        for(int j=0; j<n; j++){
            if(mat[i][j] == x){
                count++;
               
            }
        }
    }

    System.out.println("Ocorrencias de "+" x"+":" + count);

    sc.close();
}
