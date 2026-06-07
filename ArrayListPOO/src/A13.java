import java.time.LocalDate;

public class A13 {

    public static void main(String[] args) {

        Q13Revendedora revendedora =
                new Q13Revendedora();

        Q13Veiculo v1 =
                new Q13Veiculo(
                        "Honda",
                        "CG 160",
                        18000,
                        10,
                        LocalDate.of(2024, 5, 10));

        Q13Veiculo v2 =
                new Q13Veiculo(
                        "Honda",
                        "Biz 125",
                        15000,
                        8,
                        LocalDate.of(2023, 8, 15));

        Q13Veiculo v3 =
                new Q13Veiculo(
                        "Yamaha",
                        "Factor 150",
                        17000,
                        5,
                        LocalDate.of(2024, 1, 20));

        revendedora.adicionarVeiculo(v1);
        revendedora.adicionarVeiculo(v2);
        revendedora.adicionarVeiculo(v3);

        System.out.println("Lista de veículos:");

        for (Q13Veiculo v : revendedora.getListaVeiculos()) {
            System.out.println(v);
        }

        System.out.println("\nVeículo mais caro da Honda:");

        System.out.println(
                revendedora.obterMaisCaro("Honda")
        );

        System.out.println("\nVeículos Honda entre R$ 14.000 e R$ 19.000:");

        for (Q13Veiculo v :
                revendedora.listarVeiculosMarcaEPreco(
                        "Honda",
                        14000,
                        19000)) {

            System.out.println(v);
        }

        System.out.println("\nVenda de 2 unidades:");

        if (v1.venderVeiculo(2)) {
            System.out.println("Venda realizada.");
        } else {
            System.out.println("Venda não realizada.");
        }

        System.out.println(v1);

        System.out.println("\nAdicionando 5 unidades ao estoque:");

        v1.adicionarEstoque(5);

        System.out.println(v1);
    }
}