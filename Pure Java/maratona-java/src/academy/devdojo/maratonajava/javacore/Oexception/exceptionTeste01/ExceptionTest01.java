package academy.devdojo.maratonajava.javacore.Oexception.exceptionTeste01;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {

    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            //nunca deixar esse bloco vazio e nunca colocar regra de negocio, pois o catch serve apenas para avisar
            e.printStackTrace();
        }
    }
}
