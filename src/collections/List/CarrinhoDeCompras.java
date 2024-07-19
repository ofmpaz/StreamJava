package collections.List;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Items> carrinho;
    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Items(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Items> itemsParaRemover = new ArrayList<>();
        for (Items item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(item);
            }
        }
        carrinho.removeAll(itemsParaRemover);
    }

        public void calcularValorTotal() {
            double valorTotal = 0.0;
            for (Items items : carrinho) {
                valorTotal = +items.getPreco() * items.getQuantidade();
            }
            System.out.println("O valor total das compras é: " + valorTotal);
        }

        public void exibirItems(){
            System.out.println(carrinho);
        }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Sabão", 12, 2);
        carrinho.calcularValorTotal();
        carrinho.exibirItems();
    }


}
