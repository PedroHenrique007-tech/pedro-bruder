import java.time.LocalDate;

public class Automovel {
    public static void main(String[] args) {

        Carro c1 = new Carro("Volkswagen", "Gol", "FTX2A45",
                2010, 21000,
                LocalDate.of(2024, 3, 14));

        Carro c2 = new Carro("Chevrolet", "Onix", "JKM9B12",
                2015, 38000,
                LocalDate.of(2024, 11, 14));

        Carro c3 = new Carro("Honda", "Civic", "LPR4C67",
                2010, 34000,
                LocalDate.of(2023, 6, 7));

        Carro c4 = new Carro("Chevrolet", "Cruze", "QWE7D89",
                2019, 79000,
                LocalDate.of(2025, 1, 18));

        Carro c5 = new Carro("Volkswagen", "Polo", "ZTR1F23",
                2019, 58000,
                LocalDate.of(2024, 8, 25));

        Revendedora rv = new Revendedora();

        rv.adicionar(c1);
        rv.adicionar(c2);
        rv.adicionar(c3);
        rv.adicionar(c4);
        rv.adicionar(c5);

        System.out.println(rv.obterCarroPorPlaca("dhsj82msk"));
        System.out.println(rv.obterCarroPorPlaca("FTX2A45"));

        System.out.println(rv.carroMaisCaroAno(2015));
        System.out.println(rv.carroMaisCaroAno(2019));

        System.out.println(rv.carrosMarca("Honda", 10000, 35000));
        System.out.println(rv.carrosMarca("Volkswagen", 20000, 30000));
    }
}