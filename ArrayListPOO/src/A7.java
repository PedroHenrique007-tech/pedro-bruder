public class A7 {
    public static void main(String[] args) {

        Q7Usuario usuario =
                new Q7Usuario(
                        1,
                        "Pedro",
                        "pedro@gmail.com",
                        "123456",
                        "11111111111",
                        "Rua XV");

        Q7UsuarioDTO dto =
                new Q7UsuarioDTO(usuario);

        System.out.println(dto);
    }
}
