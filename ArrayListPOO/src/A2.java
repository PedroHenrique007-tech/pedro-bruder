import java.util.List;

public class A2 {

    public static void main(String[] args) {

        Q2Floricultura flor1 = new Q2Floricultura("Tulipa", 5.50, "Ronaldo");
        Q2Floricultura flor2 = new Q2Floricultura("Rosas", 8.50, "Pedro");
        Q2Floricultura flor3 = new Q2Floricultura("Tulipa", 6.00, "João");

        Q2ListaFloricultura sistema = new Q2ListaFloricultura();

        sistema.addVenda(flor1);
        sistema.addVenda(flor2);
        sistema.addVenda(flor3);

        List<Q2Floricultura> compraRonaldo = sistema.buscarFlores("Pedro");

        System.out.println(compraRonaldo);
    }
}