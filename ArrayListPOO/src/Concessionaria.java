import java.time.LocalDate;
import java.util.List;

public class Concessionaria {

    public static void main(String[] args) {

        Revendedora loja = new Revendedora();

        Carro c1 = new Carro(
                "Volkswagen",
                "Gol",
                "FTX2A45",
                2010,
                21000,
                LocalDate.of(2024, 3, 14));

        Carro c2 = new Carro(
                "Chevrolet",
                "Onix",
                "JKM9B12",
                2015,
                38000,
                LocalDate.of(2024, 11, 29));

        Carro c3 = new Carro(
                "Honda",
                "Civic",
                "LPR4C67",
                2010,
                34000,
                LocalDate.of(2023, 6, 7));

        Carro c4 = new Carro(
                "Chevrolet",
                "Cruze",
                "QWE7D89",
                2019,
                79000,
                LocalDate.of(2025, 1, 18));

        Carro c5 = new Carro(
                "Volkswagen",
                "Polo",
                "ZTR1F23",
                2019,
                58000,
                LocalDate.of(2024, 8, 25));

        loja.adicionarCarro(c1);
        loja.adicionarCarro(c2);
        loja.adicionarCarro(c3);
        loja.adicionarCarro(c4);
        loja.adicionarCarro(c5);

        System.out.println("Carro pela placa:");
        System.out.println(loja.carroPlaca("ABC1234"));

        System.out.println("\nCarro mais caro do ano 2020:");
        System.out.println(loja.carroMaisCaroAno(2020));

        System.out.println("\nCarros Toyota entre 60000 e 100000:");

        List<Carro> carros =
                loja.carrosDaMarca("Toyota", 60000, 100000);

        for (Carro c : carros) {
            System.out.println(c);
            System.out.println();
        }

        System.out.println();
        System.out.println("Depreciação do Volkswagen em 2030:");
        System.out.println(c1.calcularDepreciacao(2030));
    }
}