public class A11 {
    public static void main(String[] args) {

        Q11Departamento ti =
                new Q11Departamento("TI");

        Q11Funcionario f1 =
                new Q11Funcionario("Pedro");

        Q11Funcionario f2 =
                new Q11Funcionario("João");

        ti.adicionarFuncionario(f1);
        ti.adicionarFuncionario(f2);

        System.out.println("Funcionários:");

        for (Q11Funcionario f : ti.obterLista()) {
            System.out.println(f);
        }

        ti.removerFuncionario(f1);

        System.out.println("\nApós remoção:");

        for (Q11Funcionario f : ti.obterLista()) {
            System.out.println(f);
        }
    }
}
