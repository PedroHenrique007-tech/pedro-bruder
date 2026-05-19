public class A5 {

    public static void main(String[] args) {

        Q5SistemaBancario banco = new Q5SistemaBancario();

        Q5Conta c1 = new Q5Conta("João", 1000);
        Q5Conta c2 = new Q5Conta("Maria", 500);
        Q5Conta c3 = new Q5Conta("Carlos", 2000);

        banco.adicionarConta(c1);
        banco.adicionarConta(c2);
        banco.adicionarConta(c3);

        // Operações
        c1.depositar(200);

        c2.sacar(100);

        c1.transferir(300, c2);

        // Lista completa
        System.out.println("Lista de contas:");

        for (Q5Conta c : banco.obterLista()) {
            System.out.println(c);
        }

        // Contas com saldo maior que 1000
        System.out.println("\nContas com saldo maior que 1000:");

        for (Q5Conta c : banco.obterSaldoMaior(1000)) {
            System.out.println(c);
        }

        // Simulação de investimento
        double montante = c1.simularInvestimento(1000, 12);

        System.out.println("\nMontante após 12 meses: " + montante);
    }
}