package academy.devdojo.maratonajava.javacore.Jmodificador.test;

import academy.devdojo.maratonajava.javacore.Jmodificador.domain.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificador.domain.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
