public class Main {

    public static void main(String[] args) {

        NoSimples no1 = new NoSimples("Conteudo no1");

        NoSimples no2 = new NoSimples("Conteudo no2");

        no1.setProximoNo(no2);

        NoSimples no3 = new NoSimples("Conteudo no3");
        no2.setProximoNo(no3);

        System.out.println(no1.getProximoNo());
        System.out.println(no2.getProximoNo());
        System.out.println(no3.getProximoNo());
    }
}
