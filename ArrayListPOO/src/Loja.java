import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Notebook> listaDeProdutos;

    public Loja() {
        listaDeProdutos = new ArrayList<Notebook>();
    }

    public Notebook obterProdutoPeloPatrimonio(String patrimonio) {

        if (patrimonio == null || patrimonio.length() != 7) {
            throw new IllegalArgumentException(" Patrimonio não corresponde ou não encontrado. ");
        }

        for (Notebook n : listaDeProdutos) {
            if (n.getPatrimonio().equals(patrimonio)) {
                return n;
            }
        }

        return null;
    }

    public Notebook obterProdutoMaisCaroAno(int ano) {

        Notebook notebookMaisCaro = null;
        double maisCaroAno = 0;

        for (Notebook n : listaDeProdutos) {

            if (n.getAno() == ano && n.getPreco() > maisCaroAno) {
                maisCaroAno = n.getPreco();
                notebookMaisCaro = n;
            }
        }

        return notebookMaisCaro;
    }

    public List<Notebook> obterProdutoDaMesmaMarcaEntreValores(String marca, double precoMaximo, double precoMinimo) {

        List<Notebook> obterProdutosMarcaPreco = new ArrayList<Notebook>();

        for (Notebook n : listaDeProdutos) {

            if (n.getMarca().equals(marca)
                    && n.getPreco() >= precoMinimo
                    && n.getPreco() <= precoMaximo) {

                obterProdutosMarcaPreco.add(n);
            }
        }

        return obterProdutosMarcaPreco;
    }

    public void adicionarProduto(Notebook n) {
        listaDeProdutos.add(n);
    }

    public List<Notebook> getListaDeProdutos() {
        return listaDeProdutos;
    }
}