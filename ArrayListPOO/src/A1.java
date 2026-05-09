public class A1 {

    public static void main(String[] args) {

        try {
            Q1Retangulo r1 = new Q1Retangulo(16, 32);
            Q1Retangulo r2 = new Q1Retangulo(7, 3);

            Q1ListaRetangulo lista = new Q1ListaRetangulo();

            lista.add(r1);
            lista.add(r2);

            lista.mostrarTodos();

            System.out.println("A maior area é: " + lista.maiorArea());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}