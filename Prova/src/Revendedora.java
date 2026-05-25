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
        public Carro buscarPelaPlaca(String placa) {

            Carro DaPlaca = null;

            for (Carro c : estoque) {
                if (c.getPlaca().equalsIgnoreCase(placa)) {
                    if (DaPlaca == null) {

                        DaPlaca = c;
                    }
                }
            }

            return DaPlaca;
        }
    public Carro buscarMaiorPreco(String marca, double preco) {
        Carro maior = null;

        for (Carro c : estoque) {
            if (c.getMarca().equalsIgnoreCase(marca)) {
                if (maior == null || c.getPreco() > maior.getPreco()) {
                    maior = c;
                }
            }
        }
        return maior;
    }
    public Carro maisCaro(String marca, int ano) {

        Carro maisCaro = null;

        for (Carro v : estoque) {

            if (v.getMarca().equalsIgnoreCase(marca)) {

                if (maisCaro == null || v.getPreco() > maisCaro.getPreco()) {

                    maisCaro = v;
                }
            }
        }

        return maisCaro;
    }

    public Carro carrosDeUmaMarca(String marca, double preco) {
        Carro maior = null;

        for (Carro c : estoque) {
            if (c.getMarca().equalsIgnoreCase(marca)) {
                if (maior == null || c.getPreco() > maior.getPreco()) {
                    maior = c;
                }
            }
        }
        return maior;
    }

}
