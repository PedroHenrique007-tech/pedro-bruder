public class ProdutoQ4 {

    private String marca;
    private String modelo;
    private double preco;
    private int estoqueQuantidade;

    public ProdutoQ4(String marca, String modelo, double preco, int estoqueQuantidade){
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.estoqueQuantidade = estoqueQuantidade;
    }

    public void adicionarItens(int quantidade) {
        if (quantidade > 0) {
            estoqueQuantidade += quantidade;
            System.out.println("Adicionado " + quantidade + " itens ao estoque.");
        } else {
            System.out.println("Erro! Quantia inválida.");
        }
    }

    public void vender(int quantidade){
        if (quantidade <= 0){
            System.out.println("Quantidade inválida para venda.");
        } else if (quantidade > estoqueQuantidade) {
            System.out.println("Estoque insuficiente.");
        } else {
            estoqueQuantidade -= quantidade;
            System.out.println("Venda realizada: " + quantidade + " itens.");
        }
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoqueQuantidade() {
        return estoqueQuantidade;
    }

    public void setModelo(String modelo) {
        if (modelo == null){
            throw new IllegalArgumentException("Campo obrigatório.");
        }
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        if (marca == null){
            throw new IllegalArgumentException("Campo obrigatório.");
        }
        this.marca = marca;
    }

    public void setPreco(double preco) {
        if (preco <= 0 ){
            throw new IllegalArgumentException("Preço deve ser maior que 0.");
        }
        this.preco = preco;
    }

    public void setEstoqueQuantidade(int estoqueQuantidade) {
        if (estoqueQuantidade < 0 ){
            throw new IllegalArgumentException("Estoque não pode ser negativo.");
        }
        this.estoqueQuantidade = estoqueQuantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoqueQuantidade +
                '}';
    }
}