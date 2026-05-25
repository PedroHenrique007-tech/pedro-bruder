
    import java.util.ArrayList;
import java.util.List;

    public class Concessionaria {

        private List<Veiculo> estoque;

        public Concessionaria() {

            estoque = new ArrayList<>();
        }

        // Adicionar veículo
        public void adicionarVeiculo(Veiculo v) {

            estoque.add(v);
        }

        // Veículo mais caro de uma marca
        public Veiculo buscarMaisCaro(String marca) {

            Veiculo maisCaro = null;

            for (Veiculo v : estoque) {

                if (v.getMarca().equalsIgnoreCase(marca)) {

                    if (maisCaro == null || v.getPreco() > maisCaro.getPreco()) {

                        maisCaro = v;
                    }
                }
            }

            return maisCaro;
        }

        // Veículos em faixa de preço
        public List<Veiculo> filtroPreco(String marca,
                                         double precoMin,
                                         double precoMax) {

            List<Veiculo> resultado = new ArrayList<>();

            for (Veiculo v : estoque) {

                if (v.getMarca().equalsIgnoreCase(marca)
                        && v.getPreco() >= precoMin
                        && v.getPreco() <= precoMax) {

                    resultado.add(v);
                }
            }

            return resultado;
        }

        // Veículo mais antigo
        public Veiculo buscarMaisAntigo() {

            Veiculo maisAntigo = null;

            for (Veiculo v : estoque) {

                if (maisAntigo == null
                        || v.getAnoFabricacao().isBefore(maisAntigo.getAnoFabricacao())) {

                    maisAntigo = v;
                }
            }

            return maisAntigo;
        }
    }

