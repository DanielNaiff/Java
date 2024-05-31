public class Bolsista extends Aluno{
    private float bolsa;

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsita! Pagamento facilitado!");

    }

    public void renovarBolsa(float renovacao){
        this.setBolsa(this.getBolsa() + renovacao);
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
