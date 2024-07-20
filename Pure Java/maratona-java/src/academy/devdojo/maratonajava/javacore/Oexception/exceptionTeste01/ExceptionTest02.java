package academy.devdojo.maratonajava.javacore.Oexception.exceptionTeste01;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            //nunca deixar esse bloco vazio e nunca colocar regra de negocio, pois o catch serve apenas para avisar
            e.printStackTrace();
            throw new RuntimeException("Problema a hroa de crair arquivo");
    }
}
}
