import java.util.ArrayList;
import java.util.List;

public class LojaEletronica {

    private List<ProdutoEletronico> listaProdutos;

    public LojaEletronica() {
        listaProdutos = new ArrayList<>();
    }

    public void adicionarProduto(ProdutoEletronico produto) {
        listaProdutos.add(produto);
    }

    public List<ProdutoEletronico> obterLista() {
        return listaProdutos;
    }

    public List<ProdutoEletronico> produtosAcimaDoPreco(double preco) {

        List<ProdutoEletronico> resultado = new ArrayList<>();

        for (ProdutoEletronico p : listaProdutos) {

            if (p.getPreco() > preco) {
                resultado.add(p);
            }
        }

        return resultado;
    }
}