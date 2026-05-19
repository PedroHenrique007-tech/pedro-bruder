public class ProdutoEletronico {

    private String marca;
    private String modelo;
    private double preco;
    private int quantiaEstoque;

    public ProdutoEletronico(String marca, String modelo, double preco, int quantiaEstoque) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quantiaEstoque = quantiaEstoque;
    }

    public void adicionarProduto(int quantidade) {

        if (quantidade > 0) {
            quantiaEstoque += quantidade;
            System.out.println("Adicionado " + quantidade + " itens ao estoque.");
        } else {
            System.out.println("Erro! Quantia inválida para ser adicionada.");
        }
    }

    public void venderProduto(int quantidade) {

        if (quantidade <= 0) {
            System.out.println("Erro! Quantia inválida.");
        } else if (quantidade > quantiaEstoque) {
            System.out.println("Estoque insuficiente.");
        } else {
            quantiaEstoque -= quantidade;
            System.out.println("Venda realizada.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantiaEstoque() {
        return quantiaEstoque;
    }

    public void setMarca(String marca) {

        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Preencha o campo corretamente.");
        }

        this.marca = marca;
    }

    public void setModelo(String modelo) {

        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Preencha o campo corretamente.");
        }

        this.modelo = modelo;
    }

    public void setPreco(double preco) {

        if (preco <= 0) {
            throw new IllegalArgumentException("Preço inválido.");
        }

        this.preco = preco;
    }

    public void setQuantiaEstoque(int quantiaEstoque) {

        if (quantiaEstoque < 0) {
            throw new IllegalArgumentException("Estoque inválido.");
        }

        this.quantiaEstoque = quantiaEstoque;
    }

    @Override
    public String toString() {

        return "ProdutoEletronico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", quantiaEstoque=" + quantiaEstoque +
                '}';
    }
}