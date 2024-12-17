package Stream;

import java.io.*;

public class TrabalhandoComIOObject {

    public static void serealizacao() throws IOException {
        Gato gato = new Gato("Jack", 12, "Preto, Branco e amarelo");
        File arquivo = new File("C:\\Users\\Asus\\Desktop\\Stream\\gato");
        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(arquivo));
        System.out.println("Arquivo criado com sucesso: " + arquivo.getAbsolutePath());
        obj.writeObject(gato);
        obj.close();
    }

    public static void desserializacao(String arquivo) throws IOException, ClassNotFoundException {
        InputStream input = new FileInputStream(arquivo);
        ObjectInputStream objInput = new ObjectInputStream(input);
        Gato objGato = (Gato) objInput.readObject();
        System.out.println("Nome: " + objGato.getNome());
        System.out.println("Cor: " + objGato.getCor());
        System.out.println("Idade: " + objGato.getIdade());
        System.out.println("Objeto: " + objGato);
        objInput.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serealizacao();
        desserializacao("C:\\Users\\Asus\\Desktop\\Stream\\gato");
    }
}
