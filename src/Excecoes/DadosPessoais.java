package Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class DadosPessoais {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String primeiroNome = sc.next();

        System.out.println("Digite seu sobrenome:");
        String segundoNome = sc.next();

        System.out.println("Qual sua idade?");
        String idadeInput = sc.next();

        System.out.println("Qual sua altura?");
        String alturaInput = sc.next();

        try {
            Integer idade = Integer.parseInt(idadeInput);
            double altura = Double.parseDouble(alturaInput);

            System.out.println("Idade: " + idade + ", Altura: " + altura);

        } catch (NumberFormatException e) {
            if (!idadeInput.matches("\\d+")) {
                System.out.println("Campo idade precisa ser numérico.");
            } else if (!alturaInput.matches("\\d+(\\.\\d+)?")) {
                System.out.println("Campo altura precisa ser numérico e separado por ponto.");
            }
        }

        sc.close();
    }
}
