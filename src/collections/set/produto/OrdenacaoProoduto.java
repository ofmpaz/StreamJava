package collections.set.produto;

import java.util.HashSet;
import java.util.Set;

public class OrdenacaoProoduto {

    private Set<Produto> produtoSet;

    public OrdenacaoProoduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, int quantidade, int codigo, double preco) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public void exibirProdutoPorNome(String nome) {
        Set<Produto> produtoPorNome = new HashSet<>();
        for (Produto p : produtoSet) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                produtoPorNome.add(p);
                System.out.println(produtoPorNome);
            }
        }
    }

    public void exibirProdutoPorPreco(double preco) {
        Set<Produto> produtoPorPreco = new HashSet<>();
        for (Produto p : produtoSet) {
            if (p.getPreco() == preco) {
                produtoPorPreco.add(p);
            }
        }
        System.out.println(produtoPorPreco);
    }

    public void exibirProdutos(){
        System.out.println(produtoSet);
    }

    public static void main(String[] args) {

        OrdenacaoProoduto p = new OrdenacaoProoduto();
        p.adicionarProduto("Sabão", 2, 1, 6.99);
        p.adicionarProduto("Kiboa", 1, 2, 10.00);
        p.adicionarProduto("Shampoo", 3, 5, 20.52);
        p.adicionarProduto("Creme de pentear", 1, 7, 8.99);
        p.exibirProdutoPorNome("Kiboa");
        p.exibirProdutos();


    }
}
