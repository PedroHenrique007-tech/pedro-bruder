
    import java.util.ArrayList;
import java.util.List;

    public class Materiais {
        List<Produtos> estoque;

        public Materiais(){
            estoque = new ArrayList<>();
        }

        public void addProduto( Produtos p){
            estoque.add(p);
        }

        public Produtos buscarMaiorPreco(String marca){
            Produtos maior = null;

            for (Produtos p : estoque){
                if (p.getMarca().equalsIgnoreCase(marca)){
                    if (maior == null || p.getPreco() > maior.getPreco()){
                        maior = p;
                    }
                }
            }
            return maior;
        }

        public List<Produtos> filtroPreco(String marca, double precoMin, double precoMax){
            List<Produtos> resultados = new ArrayList<>();

            for (Produtos p : estoque){
                if (p.getMarca().equalsIgnoreCase(marca) && p.getPreco() >= precoMin && p.getPreco() <= precoMax){
                    resultados.add(p);
                }
            }
            return resultados;
        }



    }

