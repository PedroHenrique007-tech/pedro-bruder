public class Q9Pessoa {
    private String nome;
    private int idade;

    public Q9Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Idade: " + idade;
    }
}
