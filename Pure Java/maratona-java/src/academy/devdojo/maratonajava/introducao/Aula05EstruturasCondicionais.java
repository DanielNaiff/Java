package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args){
        int idade = 24;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida){
            System.out.println("Pode comprar bebida alcólica");
        }
        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida");
        }
        System.out.println("Fora do if");
    }
}
