package collections.set;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
        System.out.println(convidadoSet);
    }

    public void removerConvidadoPorCodigoConvite(int condigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == condigoConvite) {
                convidadoParaRemover = c;
                convidadoSet.remove(convidadoParaRemover);
                System.out.println("convidado removido com sucesso");
                break;
            } else {
                System.out.println("convidado não encontrado");
            }
        }
    }


    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        if(!convidadoSet.isEmpty()){
        for(Convidado c : convidadoSet) {
            System.out.println(c.getNome());
        }
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidado convidado = new ConjuntoConvidado();

        convidado.adicionarConvidado("Deise", 123);
        convidado.adicionarConvidado("Pedro", 123);
        convidado.adicionarConvidado("José", 798);
        convidado.adicionarConvidado("Amanda", 741);
        convidado.exibirConvidados();
        convidado.removerConvidadoPorCodigoConvite(123);


    }
}
