package collections.List;

import java.time.LocalDate;
import java.util.Locale;

public class Livro {

    private String autor;
    private int anoDePublicacao;
    private String titulo;

    public Livro(String autor, int anoDePublicacao, String titulo) {
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", anoDePublicacao=" + anoDePublicacao +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
