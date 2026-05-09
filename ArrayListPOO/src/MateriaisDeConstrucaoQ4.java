import java.util.ArrayList;
import java.util.List;

public class MateriaisDeConstrucaoQ4 {

    private List<ProdutoQ4> listaProduto;

    public MateriaisDeConstrucaoQ4(){
        listaProduto = new ArrayList<>();
    }

    public void adicionarProduto(ProdutoQ4 produto){
        listaProduto.add(produto);
    }

    public List<ProdutoQ4> obterLista(){
        return listaProduto;
    }

    public List<ProdutoQ4> obterPrecoMaior(double maiorPreco){
        List<ProdutoQ4> resultado = new ArrayList<>();

        for(ProdutoQ4 p : listaProduto){
            if(p.getPreco() > maiorPreco){
                resultado.add(p);
            }
        }
        return resultado;
    }
}