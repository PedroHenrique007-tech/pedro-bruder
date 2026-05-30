import java.time.LocalDate;

public class Carro {

    private String marca;
    private String modelo;
    private String placa;
    private double preco;
    private int quantidadeEstoque;
    private LocalDate anoFabricacao;

    public Carro(String marca, String modelo, String placa,
                 double preco, int quantidadeEstoque,
                 LocalDate anoFabricacao) {

        setMarca(marca);
        setModelo(modelo);
        setPlaca(placa);
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
        setAnoFabricacao(anoFabricacao);
    }

    public double depreciacaoAno(int anoFuturo) {

        double taxa;

        if (anoFabricacao.getYear() < 2016) {
            taxa = 0.07;
        } else {
            taxa = 0.05;
        }
        if (anoFuturo <= 2026){
            throw new IllegalArgumentException("Erro! ano esperado deve ser maior que 2026");  }

        int anos = anoFuturo - 2026;

        return preco * Math.pow(1 - taxa, anos);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public LocalDate getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setMarca(String marca) {

        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Marca inválida");
        }

        this.marca = marca;
    }

    public void setModelo(String modelo) {

        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo inválido");
        }

        this.modelo = modelo;
    }

    public void setPlaca(String placa) {

        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Placa inválida");
        }

        this.placa = placa;
    }

    public void setPreco(double preco) {

        if (preco <= 0) {
            throw new IllegalArgumentException("Preço inválido");
        }

        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {

        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }

        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setAnoFabricacao(LocalDate anoFabricacao) {

        if (anoFabricacao == null || anoFabricacao.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Ano inválido");
        }

        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {

        return String.format(
                "VEÍCULO [%s] | Marca: %s | Placa: %s | Preço: R$ %.2f | Estoque: %d | Fabricação: %s",
                modelo,
                marca,
                placa,
                preco,
                quantidadeEstoque,
                anoFabricacao
        );
    }
}