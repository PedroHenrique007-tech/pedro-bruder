import java.util.ArrayList;
import java.util.List;

public class Q13Revendedora {

    private List<Q13Veiculo> listaVeiculos;

    public Q13Revendedora() {
        listaVeiculos = new ArrayList<Q13Veiculo>();
    }

    // Veículo mais caro de uma marca
    public Q13Veiculo obterMaisCaro(String marca) {

        Q13Veiculo maisCaro = null;
        double precoMaisCaro = 0;

        for (Q13Veiculo v : listaVeiculos) {

            if (v.getMarca().equalsIgnoreCase(marca)
                    && v.getPreco() > precoMaisCaro) {

                precoMaisCaro = v.getPreco();
                maisCaro = v;
            }
        }

        return maisCaro;
    }

    // Veículos da marca dentro da faixa de preço
    public List<Q13Veiculo> listarVeiculosMarcaEPreco(
            String marca,
            double precoMinimo,
            double precoMaximo) {

        List<Q13Veiculo> resultado =
                new ArrayList<Q13Veiculo>();

        for (Q13Veiculo v : listaVeiculos) {

            if (v.getMarca().equalsIgnoreCase(marca)
                    && v.getPreco() >= precoMinimo
                    && v.getPreco() <= precoMaximo) {

                resultado.add(v);
            }
        }

        return resultado;
    }

    public void adicionarVeiculo(Q13Veiculo v) {
        listaVeiculos.add(v);
    }

    public List<Q13Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }
}