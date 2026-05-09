import java.util.ArrayList;
import java.util.List;

public class Q4MateriaisDeConstrucao {

    private List<Q4Produto> listaProduto;

    public Q4MateriaisDeConstrucao(){
        listaProduto = new ArrayList<>();
    }

    public void adicionarProduto(Q4Produto produto){
        listaProduto.add(produto);
    }

    public List<Q4Produto> obterLista(){
        return listaProduto;
    }

    public List<Q4Produto> obterPrecoMaior(double maiorPreco){
        List<Q4Produto> resultado = new ArrayList<>();

        for(Q4Produto p : listaProduto){
            if(p.getPreco() > maiorPreco){
                resultado.add(p);
            }
        }
        return resultado;
    }
}