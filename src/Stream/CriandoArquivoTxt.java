package Stream;

import java.io.*;
import java.util.Scanner;

public class CriandoArquivoTxt {

    public static void lerTecladoEscreverDocumento() throws IOException {

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendações de filmes: ");
        pw.flush();

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        File file = new File("recomendacoes.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file.getName()));

        do{
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = sc.nextLine();

        } while (!line.equalsIgnoreCase("fim"));

            pw.println(String.format("Arquivo %s foi criado com sucesso", file.getName()));
            pw.close();
            sc.close();
            bw.close();

        }

    public static void main(String[] args) throws IOException {

        lerTecladoEscreverDocumento();

    }
}

