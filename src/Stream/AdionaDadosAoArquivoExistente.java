package Stream;

import java.io.*;

public class AdionaDadosAoArquivoExistente {

    public static void copiarArquivo() throws IOException {

        File file = new File("C:\\Users\\Asus\\Desktop\\Código\\Dio--trilha--java\\recomendacoes.txt");
        //BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));

        String nomeArquivo = file.getName();
        /*Reader reader = new FileReader(nomeArquivo);
        BufferedReader buffere = new BufferedReader(reader);*/

        // Padrão decorator
        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        String line = br.readLine();
        
        String nomeCopy = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat(".copy.txt");
        File copy = new File(nomeCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(copy.getName()));

        do{
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();

        } while(!(line == null));

        System.out.printf("Arquivo \"%s\" copiado com sucesso! %n", file.getName());
        System.out.printf("Arquivo \"%s\" Copia criado com sucesso com sucesso! %n☺", copy.getName());

        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("Recomende 3 livros");
        printWriter.flush();

        adicionarInformacaoNoArquivo(copy.getName());

        printWriter.println("Ok, arquivo alterado" );

        br.close();
        bw.close();
        printWriter.close();


    }

    public static void adicionarInformacaoNoArquivo(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(!(line.equalsIgnoreCase("fim")));

        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
         copiarArquivo();

    }
}
