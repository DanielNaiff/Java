package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] semeinarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] semeinarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.semeinarios = semeinarios;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSemeinarios() {
        return semeinarios;
    }

    public void setSemeinarios(Seminario[] semeinarios) {
        this.semeinarios = semeinarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
