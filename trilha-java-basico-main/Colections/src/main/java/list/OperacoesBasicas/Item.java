package main.java.list.OperacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    private int quantidades;

    public Item(String nome, double preco, int quantidades) {
        this.nome = nome;
        this.preco = preco;
        this.quantidades = quantidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(int quantidades) {
        this.quantidades = quantidades;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidades=" + quantidades +
                '}';
    }
}
