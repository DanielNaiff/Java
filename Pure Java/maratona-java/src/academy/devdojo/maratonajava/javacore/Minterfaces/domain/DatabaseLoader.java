package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carragendo dados do banco de dados");
    }
}
