package main.java.set.Pesquisa;

public class Tarefa {
    private String descricao;
    private Boolean isConcluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.isConcluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getConcluida() {
        return isConcluida;
    }

    public void setConcluida(Boolean concluida) {
        isConcluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", isConcluida=" + isConcluida +
                '}';
    }
}
