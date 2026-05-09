public class FloriculturaQ2 {

    private String nome;
    private double preco;
    private String cliente;

    public FloriculturaQ2(String nome, double preco, String cliente){
        setNome(nome);
        setPreco(preco);
        setCliente(cliente);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCliente() {
        return cliente;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Erro! Nome inválido.");
        }
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if(preco < 0){
            throw new IllegalArgumentException("Erro! O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public void setCliente(String cliente) {
        if(cliente == null || cliente.isEmpty()){
            throw new IllegalArgumentException("Erro! Cliente inválido.");
        }
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "nome= " + nome + ", preco= " + preco + ", cliente= " + cliente;
    }
}