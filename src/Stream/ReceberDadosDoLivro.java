package Stream;

import java.io.*;

public class ReceberDadosDoLivro {

    public static void recebeTecladoImprimirConsole() throws IOException {

        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();

        OutputStream os = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }
        while(!(line.isEmpty()));{
            bw.flush();

            br.close();
            br.close();
        }
    }

    public static void main(String[] args) throws IOException {

        recebeTecladoImprimirConsole();
    }
}
