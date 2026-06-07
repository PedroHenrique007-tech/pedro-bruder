public class A9 {
    public static void main(String[] args) {

        Q9Familia familia = new Q9Familia();

        familia.adicionarPessoa(
                new Q9Pessoa("João", 20));

        familia.adicionarPessoa(
                new Q9Pessoa("Pedro", 45));

        familia.adicionarPessoa(
                new Q9Pessoa("Maria", 32));

        System.out.println(
                familia.encontrarPessoaMaisVelha());
    }
}
