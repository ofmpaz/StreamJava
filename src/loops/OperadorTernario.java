package loops;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota = sc.nextInt();
        String resultado;

        resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <= 6 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
