public class A6 {
    public static void main(String[] args) {

        Q6Endereco e1 =
                new Q6Endereco(
                        "SC",
                        "Blumenau",
                        "89000-000",
                        "Rua XV",
                        100);

        Q6Pessoa p1 =
                new Q6Pessoa("Pedro", e1);

        System.out.println(p1);
    }
}
