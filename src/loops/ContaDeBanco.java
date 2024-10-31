package loops;

public class ContaDeBanco {

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if(valorSolicitado <= saldo){
            saldo -= valorSolicitado;
            System.out.println("Saldo atual: " + saldo);
        }else if(valorSolicitado > saldo){
            System.out.println("Adicionando crédito especial");
            saldo = 100;
            saldo -= valorSolicitado;
            System.out.println("Saldo atualizado: " + saldo);
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
}
