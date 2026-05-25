import java.time.LocalDate;

    public class ExConcessionaria {

        public static void main(String[] args) {

            Veiculo v1 = new Veiculo(
                    "Toyota",
                    "Corolla",
                    145000,
                    5,
                    LocalDate.of(2022, 5, 10)
            );

            Veiculo v2 = new Veiculo(
                    "Toyota",
                    "Hilux",
                    320000,
                    3,
                    LocalDate.of(2021, 8, 20)
            );

            Veiculo v3 = new Veiculo(
                    "Honda",
                    "Civic",
                    160000,
                    4,
                    LocalDate.of(2020, 3, 15)
            );

            Veiculo v4 = new Veiculo(
                    "Ford",
                    "Ranger",
                    280000,
                    2,
                    LocalDate.of(2019, 1, 5)
            );

            Concessionaria loja = new Concessionaria();

            loja.adicionarVeiculo(v1);
            loja.adicionarVeiculo(v2);
            loja.adicionarVeiculo(v3);
            loja.adicionarVeiculo(v4);

            // Veículo mais caro da Toyota
            System.out.println("VEÍCULO MAIS CARO DA TOYOTA");

            Veiculo caro = loja.buscarMaisCaro("Toyota");

            System.out.println(caro);

            // Veículos por faixa de preço
            System.out.println("\nVEÍCULOS TOYOTA ENTRE 100MIL E 200MIL");

            System.out.println(
                    loja.filtroPreco("Toyota", 100000, 200000)
            );

            // Veículo mais antigo
            System.out.println("\nVEÍCULO MAIS ANTIGO");

            System.out.println(loja.buscarMaisAntigo());

            // Venda
            System.out.println("\nVENDA DE VEÍCULO");

            if (v1.venderVeiculo(2)) {

                System.out.println("Venda realizada com sucesso.");
                System.out.println(v1);
            }

            // Reposição
            System.out.println("\nADIÇÃO DE ESTOQUE");

            v1.adicionarEstoque(3);

            System.out.println(v1);
        }
    }

