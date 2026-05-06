public class Conta {

    private String nomeTitular;
    private double saldo;

    public Conta( String nomeTitular, double saldo){
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        if( nomeTitular = null || nomeTitular.isBlank()){
            throw new IllegalArgumentException("Erro! Preencha o campo.");
        }
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo < 0 ){
            throw new IllegalArgumentException("Erro! Slado deve ser maior ou iual a ' 0 '. ");
        }
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "nomeTitular= " + nomeTitular + "\n saldo=" + saldo;
    }
}
