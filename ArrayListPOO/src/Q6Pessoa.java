public class Q6Pessoa {
    private String nome;
    private Q6Endereco endereco;

    public Q6Pessoa(String nome, Q6Endereco endereco) {

        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String toString() {

        return "Nome: " + nome +
                "\nEndereço: " + endereco;
    }
}
