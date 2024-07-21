package collections.set.agendamento;

import java.util.Objects;

public class Contato {

    private String nome;
    private int numemoTelefone;

    public Contato(String nome, int numemoTelefone) {
        this.nome = nome;
        this.numemoTelefone = numemoTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getNumemoTelefone() {
        return numemoTelefone;
    }

    public void setNumemoTelefone(int numemoTelefone) {
        this.numemoTelefone = numemoTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Contato {" +
                "\n    Nome: '" + nome + '\'' +
                "\n    Número de Telefone: " + numemoTelefone +
                "\n}";
    }
}
