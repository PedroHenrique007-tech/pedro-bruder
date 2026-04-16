public class Atv11 {
    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter");

        System.out.println(livro);

        livro.emprestar();
        System.out.println(livro);

        livro.devolver();
        System.out.println(livro);
    }
}
