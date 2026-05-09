import java.util.ArrayList;
import java.util.List;

public class Q2ListaFloricultura {

    private List<Q2Floricultura> historicoVendas = new ArrayList<>();

    public List<Q2Floricultura> historico() {
        return historicoVendas;
    }

    public void addVenda(Q2Floricultura venda) {
        historicoVendas.add(venda);
    }

    public List<Q2Floricultura> buscarFlores(String nomeCliente) {

        List<Q2Floricultura> floresCliente = new ArrayList<>();

        for (Q2Floricultura venda : historicoVendas) {

            if (venda.getNomeCliente().equalsIgnoreCase(nomeCliente)) {
                floresCliente.add(venda);
            }
        }

        return floresCliente;
    }
}