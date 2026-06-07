import java.util.ArrayList;
import java.util.List;

public class Q12Loja {

    private List<Q12Notebook> listaDeProdutos;

    public Q12Loja() {
        listaDeProdutos = new ArrayList<Q12Notebook>();
    }

    public Q12Notebook obterProdutoPeloPatrimonio(String patrimonio) {

        if (patrimonio == null || patrimonio.length() != 7) {
            throw new IllegalArgumentException(" Patrimonio não corresponde ou não encontrado. ");
        }

        for (Q12Notebook n : listaDeProdutos) {
            if (n.getPatrimonio().equals(patrimonio)) {
                return n;
            }
        }

        return null;
    }

    public Q12Notebook obterProdutoMaisCaroAno(int ano) {

        Q12Notebook notebookMaisCaro = null;
        double maisCaroAno = 0;

        for (Q12Notebook n : listaDeProdutos) {

            if (n.getAno() == ano && n.getPreco() > maisCaroAno) {
                maisCaroAno = n.getPreco();
                notebookMaisCaro = n;
            }
        }

        return notebookMaisCaro;
    }

    public List<Q12Notebook> obterProdutoDaMesmaMarcaEntreValores(String marca, double precoMaximo, double precoMinimo) {

        List<Q12Notebook> obterProdutosMarcaPreco = new ArrayList<Q12Notebook>();

        for (Q12Notebook n : listaDeProdutos) {

            if (n.getMarca().equals(marca)
                    && n.getPreco() >= precoMinimo
                    && n.getPreco() <= precoMaximo) {

                obterProdutosMarcaPreco.add(n);
            }
        }

        return obterProdutosMarcaPreco;
    }

    public void adicionarProduto(Q12Notebook n) {
        listaDeProdutos.add(n);
    }

    public List<Q12Notebook> getListaDeProdutos() {
        return listaDeProdutos;
    }
}