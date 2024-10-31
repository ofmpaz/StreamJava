public class NoSimples<T> {

    private T conteudo;
    private NoSimples proximoNo;

    public NoSimples(T conteudo){
        this. proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoSimples getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoSimples proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "NoSimples{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
