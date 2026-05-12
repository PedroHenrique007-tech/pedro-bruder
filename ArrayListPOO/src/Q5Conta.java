public class Q5Conta {

    private String nomeTitular;
    private double saldo;

    public Q5Conta(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }
    }

    public void depositar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
        } else {
            saldo += valor;
            System.out.println("Depósito feito com sucesso!");
        }
    }

    public void transferir(Q5Conta destino, double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido para transferência.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência.");
        } else {
            saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência realizada com sucesso!");
        }
    }

    public double simularInvestimento(double valor, int meses) {

        double taxa = 0.01;

        return valor * Math.pow((1 + taxa), meses);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setSaldo(double saldo) {

        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo não pode ser negativo.");
        }

        this.saldo = saldo;
    }

    public void setNomeTitular(String nomeTitular) {

        if (nomeTitular == null) {
            throw new IllegalArgumentException("Nome é obrigatório.");
        }

        this.nomeTitular = nomeTitular;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}