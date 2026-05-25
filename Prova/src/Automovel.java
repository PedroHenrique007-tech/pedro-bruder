import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Automovel {
    public static void main(String[] args) {

        Carro c1 = new Carro("Volkswagen", "Gol", "FTX2A45", 2010, 21.000, LocalDate.of(2024,03,14);
        Carro c2 = new Carro("Chevrolet", "Onix", "JKM9B12", 2015, 38.000, LocalDate.of(2024,11,14);
        Carro c3 = new Carro("Honda", "Civic", "LPR4C67", 2010, 34.000, LocalDate.of(2023,06,07);
        Carro c4 = new Carro("Chevrolet", "Cruze", "QWE7D89", 2019, 79.000, LocalDate.of(2025,01,18);
        Carro c5 = new Carro("Volkswagen", "Polo", "ZTR1F23", 2019, 58.000, LocalDate.of(2024,08,25);


        Revendedora loja = new Revendedora();

        loja.adicionarCarro(c1);
        loja.adicionarCarro(c2);
        loja.adicionarCarro(c3);
        loja.adicionarCarro(c4);
        loja.adicionarCarro(c5);


        System.out.println("Carro MAIS CARO (2010)");
        Carro caro = loja.maisCaro("Volkswagen", 2010);
        System.out.println("O Carro mais caro de 2010 da marca Volkswagen.");

        System.out.println("\nVEÍCULOS Volkswagen ENTRE 20MIL E 40MIL");

        System.out.println(
                loja.buscarMaiorPreco("Volkswagen", 20000, 40000)
        );

       Carro = new c1 placa ("FTX2A45");

        System.out.println("A placa do carro é: ");


    }
}

