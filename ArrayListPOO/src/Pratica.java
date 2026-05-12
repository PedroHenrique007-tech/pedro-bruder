public class Pratica {
    private String marca;
    private String modelo;
    private double preco;
    private int quantidadeEmEstoque;

    public Pratica(String marca, String modelo, double preco, int quantidadeEmEstoque) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
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

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setMarca(String marca) {
        if(marca != null) {
            throw new IllegalArgumentException("Preencha a marca corretamente.");
        }
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        if(modelo != null) {
            throw new IllegalArgumentException("Preencha a modelo corretamente.");
        }
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        if(preco <= 0) {
            throw new IllegalArgumentException("Preço não correspondente.");
        }
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque <= 0) {
            throw new IllegalArgumentException("Estoque insuficiente.")
        }
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    @Override
    public String toString(){
        " Marca : " + marca +" Modelo: " + modelo + " Preco: " + preco + " Estoque " + quantidadeEmEstoque;
    }
}
