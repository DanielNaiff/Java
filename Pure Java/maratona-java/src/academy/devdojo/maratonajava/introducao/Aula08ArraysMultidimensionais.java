package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        System.out.println(dias[0][0]);
        dias[0][0] = 0;
        dias[0][1] = 1;
        dias[0][2] = 2;
        dias[1][0] = 3;
        dias[1][1] = 4;
        dias[1][2] = 5;

        for (int i = 0;i < dias.length; i++){
            for (int j = 0;j < dias[i].length;j++){
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for(int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
