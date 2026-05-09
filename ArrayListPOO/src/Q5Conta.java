public class Q5Conta {

    private String nomeTitular;
    private double saldo;

    public Q5Conta(String nomeTitular, double saldo){
        setNomeTitular(nomeTitular);
        setSaldo(saldo);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {

        if(nomeTitular == null || nomeTitular.isBlank()){
            throw new IllegalArgumentException("Erro! Preencha o campo.");
        }

        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {

        if(saldo < 0){
            throw new IllegalArgumentException("Erro! Saldo deve ser maior ou igual a 0.");
        }

        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "nomeTitular = " + nomeTitular +
                "\nsaldo = " + saldo;
    }
}