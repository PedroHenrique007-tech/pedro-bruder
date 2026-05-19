public class Q5Conta {
    private String nomeTitular;
    private double saldo;

    public Q5Conta(String nomeTitular, double saldo){
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("O valor não é valido.");
        }else{
            saldo += valor;
            System.out.println("Saldo atual: "+ saldo);
        }
    }

    public void sacar (double valor){
            if(valor <= 0){
                System.out.println("O valor não é valido.");
            }else if(valor > saldo){
                System.out.println("O saldo insuficiente.");
            }else{
                saldo -= valor;
                System.out.println("Saque realizado com sucesso.");
            }

        }
        public void transferir (double valor, Q5Conta destino){
        if(valor <= 0){
            System.out.println("Valor não correspondente.");
        }   else if (valor > saldo){
            System.out.println("O saldo insuficiente.");
        }else {
               saldo -=valor;
               destino.saldo += valor;
               System.out.println("Transferencia realizada com sucesso.");
            }
        }
        public double simularInvestimento(double valor, int meses){
        double taxa = 0.01;
        return valor * Math.pow((1 + taxa),meses);
        }


    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeTitular(String nomeTitular) {
        if(nomeTitular == null || nomeTitular.isBlank()){
            throw new IllegalArgumentException("Preencha o nome correspondente.");
        }
        this.nomeTitular = nomeTitular;
    }

    public void setSaldo(double saldo) {
        if(saldo < 0){
            throw new IllegalArgumentException("Preencha o saldo correspondente, que não seja negativo.");
        }
        this.saldo = saldo;
    }
    @Override
    public String toString(){
        return "Nome: " + nomeTitular + ", Saldo: " + saldo;
    }
}