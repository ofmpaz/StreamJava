package Stream;

import java.io.*;

public class TrabalhandoComBytes {

    public static void copiarArquivo() throws FileNotFoundException {

        File file = new File("C:\\Users\\Asus\\Desktop\\Stream\\StreamJava\\recomendacoes.copy.txt");
        String nomeArquivo = file.getName();
        //Abre o arquivo
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file.getName()));

        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-cpy2.txt");
        File fileCopy = new File(nomeArquivoCopy);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeArquivoCopy));
    }
}
