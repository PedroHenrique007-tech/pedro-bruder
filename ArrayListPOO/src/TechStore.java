import java.time.LocalDate;

public class TechStore {

    public static void main(String[] args) {

        Notebook n1 = new Notebook("Dell", "Inspiron 15", "NB12345", 2018, 3500,
                LocalDate.of(2025, 3, 15));

        Notebook n2 = new Notebook("Lenovo", "IdeaPad 3", "NB67890", 2021, 4200,
                LocalDate.of(2026, 1, 10));

        Notebook n3 = new Notebook("Acer", "Aspire 5", "NB54321", 2017, 3000,
                LocalDate.of(2024, 8, 22));

        Notebook n4 = new Notebook("Samsung", "Book", "NB11223", 2022, 5800,
                LocalDate.of(2025, 12, 5));

        Notebook n5 = new Notebook("Dell", "Vostro", "NB99887", 2021, 4900,
                LocalDate.of(2025, 9, 18));

        Loja loja = new Loja();

        loja.adicionarProduto(n1);
        loja.adicionarProduto(n2);
        loja.adicionarProduto(n3);
        loja.adicionarProduto(n4);
        loja.adicionarProduto(n5);

        System.out.println(loja.obterProdutoPeloPatrimonio("NB54321"));

        System.out.println(loja.obterProdutoMaisCaroAno(2021) + "\n");

        System.out.println(loja.obterProdutoDaMesmaMarcaEntreValores("Dell", 4000, 3000));

        System.out.println();

        System.out.println(n1.calculoDesvalorizacao(2030)+ "    Desvalorização");
    }
}