package estruturaderepeticao;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

        args = new String[]{"olá, Boa tarde, Tudo bem?"};

        if (args.length > 0) {
            System.out.println("Argumento recebido: " + args[0]);
        } else {
            System.out.println("Nenhum argumento foi passado.");
        }
    }
}
