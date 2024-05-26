public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        setSaldo(0);
        setStatus(false);
    }

    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
        if(getTipo().equals("CC")) {
            setSaldo(50);
        } else if (getTipo().equals("CP")) {
            setSaldo(150);
        }
    }

    public void fecharConta(){
        if (getSaldo() > 0){
            System.out.println("A conta não pode ser fechada, pois ainda tem R$ " + getSaldo());
        } else if(getSaldo() < 0){
            System.out.println("A conta não pode ser fechada, pois voce possui uma divida de R$"+ getSaldo());
        } else{
            setStatus(false);
            System.out.println("A conta " + getNumConta() + " foi fechada com sucesso.");
        }
    }

    public void depositar(float valor){
        if(getStatus()){
            setSaldo(getSaldo() + valor);
        } else{
            System.out.println("É impossível depositar");
        }
    }

    public void sacar(float valor){
        if (getStatus()){
            if(getSaldo() > valor){
                setSaldo(getSaldo() - valor);
            }else {
                System.out.println("É impossível sacar, pois voce não possui saldo suficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal(){
        float valor = 0;
        if (getTipo().equals("CC")) {
            valor = 12;
        } else if (getTipo().equals("CP")) {
            valor = 20;
        }

        if(getStatus()){
            if(getSaldo() > valor){
                setSaldo(getSaldo() - valor);
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Impossível pagar");
        }
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
}
