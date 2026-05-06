import java.util.ArrayList;
import java.util.List;

public class MateriaisDeConstrucao {

    private List<Produto> listaProduto;

    public MateriaisDeConstrucao(){
        listaProduto = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        listaProduto.add(produto);
    }

    public List<Produto> obterLista(){
        return listaProduto;
    }

    public List<Produto> obterPrecoMaior(double maiorPreco){
        List<Produto> resultado = new ArrayList<>();

        for(Produto p : listaProduto){
            if(p.getPreco() > maiorPreco){
                resultado.add(p);
            }
        }
        return resultado;
    }
}