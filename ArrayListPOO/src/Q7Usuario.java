public class Q7Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String endereco;

    public Q7Usuario(int id, String nome,
                     String email,
                     String senha,
                     String cpf,
                     String endereco) {

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
