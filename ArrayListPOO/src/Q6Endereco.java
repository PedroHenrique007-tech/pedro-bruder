public class Q6Endereco {

    private String uf;
    private String cidade;
    private String cep;
    private String logradouro;
    private int numero;

    public Q6Endereco(String uf, String cidade, String cep,
                      String logradouro, int numero) {

        this.uf = uf;
        this.cidade = cidade;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    @Override
    public String toString() {

        return logradouro + ", " + numero +
                " - " + cidade +
                "/" + uf +
                " CEP: " + cep;
    }
}
