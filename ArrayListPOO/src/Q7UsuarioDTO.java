public class Q7UsuarioDTO {
    private String nome;
    private String email;

    public Q7UsuarioDTO(Q7Usuario usuario) {

        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
    }

    @Override
    public String toString() {

        return "Nome: " + nome +
                ", Email: " + email;
    }
}
