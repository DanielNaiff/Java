public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int menbro;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMenbro() {
        return menbro;
    }

    public void setMenbro(int menbro) {
        this.menbro = menbro;
    }
}
