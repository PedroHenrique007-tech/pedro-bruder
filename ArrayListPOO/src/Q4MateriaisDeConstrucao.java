import java.util.ArrayList;
import java.util.List;

public class Q4MateriaisConstrucao {

    private List<Q4Produto> listaProdutos;

    public Q4MateriaisConstrucao() {
        listaProdutos = new ArrayList<>();
    }

    public void adicionarProduto(Q4Produto p) {
        listaProdutos.add(p);
    }

    public Q4Produto obterProdutoMaisCaroMarca(String marca) {

        Produto produtoMaisCaro = null;
        double maiorPreco = 0;

        for (Q4Produto p : listaProdutos) {
            if (p.getMarca().equals(marca) && p.getPreco() > maiorPreco) {
                maiorPreco = p.getPreco();
                produtoMaisCaro = p;
            }
        }

        return produtoMaisCaro;

    }

    public List<Q4Produto> produtosMarcaEPreco(String marca, double precoMin, double precoMax) {

        List<Q4Produto> listaRetorno = new ArrayList<Q4Produto>();

        for (Q4Produto p : listaProdutos) {
            if (p.getMarca().equals(marca) && p.getPreco() > precoMin && p.getPreco() < precoMax) {
                listaRetorno.add(p);
            }
        }

        return listaRetorno;

    }

}