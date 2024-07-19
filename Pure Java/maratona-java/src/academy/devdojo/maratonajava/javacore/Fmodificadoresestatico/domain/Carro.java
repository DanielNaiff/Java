package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double getVelocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("----------------");
        System.out.println("Nome "+this.getNome());
        System.out.println("Velocidade maxima "+this.getVelocidadeMaxima());
        System.out.println("Velocidade limite "+this.getVelocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getGetVelocidadeLimite() {
        return getVelocidadeLimite;
    }

    public void setGetVelocidadeLimite(double getVelocidadeLimite) {
        this.getVelocidadeLimite = getVelocidadeLimite;
    }
}
