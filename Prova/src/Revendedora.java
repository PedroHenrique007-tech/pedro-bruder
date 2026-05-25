import java.util.ArrayList;
import java.util.List;

public class Revendedora {

    private List<Carro> listaCarro;

    public Revendedora() {
        listaCarro = new ArrayList<>();
    }

    public void adicionar(Carro c) {
        listaCarro.add(c);
    }

    public Carro obterCarroPorPlaca(String placa) {

        Carro placaCarro = null;

        for (Carro c : listaCarro) {
            if (c.getPlaca().equals(placa)) {
                placaCarro = c;
            }
        }

        return placaCarro;
    }

    public Carro carroMaisCaroAno(int ano) {

        Carro carroMaisCaro = null;
        double maisCaro = 0;

        for (Carro c : listaCarro) {

            if (c.getAno() == ano && maisCaro < c.getPreco()) {

                c.depreciacao(c.getPreco(), ano);

                maisCaro = c.getPreco();
                carroMaisCaro = c;
            }
        }

        return carroMaisCaro;
    }

    public List<Carro> carrosMarca(String marca,
                                   double precoMin,
                                   double precoMax) {

        List<Carro> listaRetorno = new ArrayList<>();

        for (Carro c : listaCarro) {

            if (c.getMarca().equals(marca)
                    && c.getPreco() > precoMin
                    && c.getPreco() < precoMax) {

                listaRetorno.add(c);
            }
        }

        return listaRetorno;
    }
}