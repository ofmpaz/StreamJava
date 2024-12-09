package Stream;

import java.io.*;
import java.util.Scanner;

public class TrabalhadoComDataIO {

    public static void inculirProduto() throws IOException {

        File arquivo = new File("C:\\Users\\Asus\\Documents\\peca-de-roupa.bin");

        PrintStream ps = new PrintStream(System.out);
        ps.flush();

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(arquivo));


        Scanner sc = new Scanner(System.in);
        ps.println("Nome da peça:");
        String nomeDaPeca = sc.nextLine();
        dos.writeUTF(nomeDaPeca);

        ps.println("Tamanho da peça (P/M/G/U):");
        char tamanhoDaPeca = sc.nextLine().charAt(0);
        dos.writeChar(tamanhoDaPeca);

        ps.println("Quantidade de peças:");
        int quantidadeDePecas = sc.nextInt();
        sc.nextLine(); // Limpa o buffer
        dos.writeInt(quantidadeDePecas);

        ps.println("Preço unitário:");
        double precoUnitario = sc.nextDouble();
        sc.nextLine(); // Limpa o buffer
        dos.writeDouble(precoUnitario);

        lerArquivo(arquivo.getPath());

    }

    public static void lerArquivo(String caminhoArquivo) throws IOException {

        File arquivoParaLer = new File(caminhoArquivo);

        DataInputStream dis = new DataInputStream(new FileInputStream(arquivoParaLer.getPath()));


        String nome = dis.readUTF();
        char tamanho = dis.readChar();
        int quantidade = dis.readInt();
        double preco = dis.readDouble();

        System.out.printf("\nNome.................: %s\n", nome);
        System.out.printf("\nTamaho.................: %s\n", tamanho);
        System.out.printf("\nQuantidade.................: %s\n", quantidade);
        System.out.printf("\nPreço.................: %s\n", preco);
        System.out.printf("\nTotal do valor das peças.................: %s\n" + (quantidade * preco));

    }

    public static void main(String[] args) throws IOException {

        inculirProduto();
    }
}
