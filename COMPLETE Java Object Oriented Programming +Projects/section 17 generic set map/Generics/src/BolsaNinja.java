import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    //inicializar array
    private List<T> ferramentas;

    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    //Colocar ferramentas na lista

    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    public void mostrarFerramenta(){
        for(T ferramenta: ferramentas){
            System.out.println(ferramenta);
        }
    }
}
