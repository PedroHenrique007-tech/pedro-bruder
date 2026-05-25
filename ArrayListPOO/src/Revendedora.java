import java.util.ArrayList;
import java.util.List;

public class Revendedora {

    private List<Carro> estoque;

    public Revendedora() {
        estoque = new ArrayList<>();
    }

    public void adicionarCarro(Carro c) {
        estoque.add(c);
    }

    public Carro carroPlaca(String placa) {

        for (Carro c : estoque) {

            if (c.getPlaca().equalsIgnoreCase(placa)) {
                return c;
            }
        }

        return null;
    }

    public Carro carroMaisCaroAno(int ano) {

        Carro maisCaro = null;

        for (Carro c : estoque) {

            if (c.getAno() == ano) {

                if (maisCaro == null || c.getPreco() > maisCaro.getPreco()) {
                    maisCaro = c;
                }
            }
        }

        return maisCaro;
    }

    public List<Carro> carrosDaMarca(String marca, double precoMin, double precoMax) {

        List<Carro> resultado = new ArrayList<>();

        for (Carro c : estoque) {

            if (c.getMarca().equalsIgnoreCase(marca)
                    && c.getPreco() >= precoMin
                    && c.getPreco() <= precoMax) {

                resultado.add(c);
            }
        }

        return resultado;
    }
}