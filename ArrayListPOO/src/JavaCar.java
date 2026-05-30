import java.time.LocalDate;

public class JavaCar {

    public static void main(String[] args) {

        Carro c1 = new Carro(
                "Volkswagen",
                "Gol",
                "FTX2A45",
                21000,
                1,
                LocalDate.of(2024, 3, 14)
        );

        Carro c2 = new Carro(
                "Chevrolet",
                "Onix",
                "JKM9B12",
                38000,
                1,
                LocalDate.of(2024, 11, 29)
        );

        Carro c3 = new Carro(
                "Honda",
                "Civic",
                "LPR4C67",
                34000,
                1,
                LocalDate.of(2023, 6, 7)
        );

        Carro c4 = new Carro(
                "Chevrolet",
                "Cruze",
                "QWE7D89",
                79000,
                1,
                LocalDate.of(2025, 1, 18)
        );

        Carro c5 = new Carro(
                "Volkswagen",
                "Polo",
                "ZTR1F23",
                58000,
                1,
                LocalDate.of(2024, 8, 25)
        );

        Revendedora rv = new Revendedora();

        rv.adicionarCarro(c1);
        rv.adicionarCarro(c2);
        rv.adicionarCarro(c3);
        rv.adicionarCarro(c4);
        rv.adicionarCarro(c5);

        System.out.println(rv.obterCarroPorPlaca("QWE7D89"));
        System.out.println(rv.carroMaisCaroAno(2024));
        System.out.println(rv.carrosMarca("Volkswagen", 10000, 35000));

    }
}