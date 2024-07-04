package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> listaItens;

    public CarrinhoDeCompra() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();

        for(Item i: listaItens){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }

        listaItens.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        double soma = 0.0;
        for(Item i: listaItens){
            soma += i.getPreco()*i.getQuantidades();
        }

        return soma;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }
}
