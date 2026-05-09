public class Atividade1 {

    public static void main(String[] args) {

        try {
            RetanguloQ1 r1 = new RetanguloQ1(16, 32);
            RetanguloQ1 r2 = new RetanguloQ1(7, 3);

            ListaRetanguloQ1 lista = new ListaRetanguloQ1();

            lista.add(r1);
            lista.add(r2);

            lista.mostrarTodos();

            System.out.println("A maior area é: " + lista.maiorArea());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}