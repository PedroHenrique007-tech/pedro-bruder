import java.util.ArrayList;
import java.util.List;

    public class Q4MateriaisConstrucao {

        private List<Q4Produto> listaProdutos;

        public Q4MateriaisConstrucao() {
            listaProdutos = new ArrayList<>();
        }

        public void adicionarProduto(Q4Produto produto) {
            listaProdutos.add(produto);
        }

        public Q4Produto obterMaisCaro(String marca) {

            Q4Produto maisCaro = null;

            for (Q4Produto p : listaProdutos) {

                if (p.getMarca().equalsIgnoreCase(marca)) {

                    if (maisCaro == null || p.getPreco() > maisCaro.getPreco()) {
                        maisCaro = p;
                    }
                }
            }

            return maisCaro;
        }

        public List<Q4Produto> obterPorFaixaDePreco(String marca, double x, double y) {

            List<Q4Produto> resultado = new ArrayList<>();

            for (Q4Produto p : listaProdutos) {

                if (p.getMarca().equalsIgnoreCase(marca)
                        && p.getPreco() >= x
                        && p.getPreco() <= y) {

                    resultado.add(p);
                }
            }

            return resultado;
        }
    }

