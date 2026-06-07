import java.util.ArrayList;
import java.util.List;

    public class Q8Camara {

        private List<Q8Vereador> listaVereadores;

        public Q8Camara() {
            listaVereadores = new ArrayList<>();
        }

        public void adicionarVereador(Q8Vereador vereador) {
            listaVereadores.add(vereador);
        }

        public double obterMediaDesempenho() {

            double soma = 0;

            for (Q8Vereador v : listaVereadores) {
                soma += v.obterDesempenho();
            }

            return soma / listaVereadores.size();
        }

        public List<Q8Vereador> obterAcimaDaMedia() {

            List<Q8Vereador> resultado = new ArrayList<>();

            double media = obterMediaDesempenho();

            for (Q8Vereador v : listaVereadores) {

                if (v.obterDesempenho() > media) {
                    resultado.add(v);
                }
            }

            return resultado;
        }

        public String melhorPartido() {

            String melhorPartido = "";
            double melhorMedia = 0;

            for (Q8Vereador v : listaVereadores) {

                String partidoAtual = v.getPartido();

                double soma = 0;
                int contador = 0;

                for (Q8Vereador vereador : listaVereadores) {

                    if (vereador.getPartido().equals(partidoAtual)) {

                        soma += vereador.obterDesempenho();
                        contador++;
                    }
                }

                double media = soma / contador;

                if (media > melhorMedia) {
                    melhorMedia = media;
                    melhorPartido = partidoAtual;
                }
            }

            return melhorPartido;
        }
}
