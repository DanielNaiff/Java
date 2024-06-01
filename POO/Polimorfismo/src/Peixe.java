public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover(){
        System.out.println("nadando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo alga");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de peixe");
    }

    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
