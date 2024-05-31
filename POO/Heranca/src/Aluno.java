import java.security.PublicKey;

public class Aluno extends Pessoa{
    private int matri;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Mensalidade paga");
    }

    public void cancelarMatri(){
        System.out.println("Matrícula será cancelada");
        this.setMatri(0);
    }

    public int getMatri() {
        return matri;
    }

    public void setMatri(int matri) {
        this.matri = matri;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
