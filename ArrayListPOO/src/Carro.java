import java.time.LocalDate;

public class Carro {

    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double preco;
    private LocalDate dataDeAquisicao;

    public Carro(String marca, String modelo, String placa, int ano, double preco, LocalDate dataDeAquisicao) {

        setMarca(marca);
        setModelo(modelo);
        setPlaca(placa);
        setAno(ano);
        setPreco(preco);

        this.dataDeAquisicao = dataDeAquisicao;
    }

    public double calcularDepreciacao(int anoFuturo) {

        if (anoFuturo <= 2026) {
            throw new IllegalArgumentException("Ano informado deve ser maior que 2026.");
        }

        double taxa;

        if (ano < 2016) {
            taxa = 0.07;
        } else {
            taxa = 0.05;
        }

        int anosDecorridos = anoFuturo - 2026;

        return preco * Math.pow(1 - taxa, anosDecorridos);
    }

    public double getPreco() {
        return preco;
    }

    public int getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {

        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Erro! marca informada não correspondente.");
        }

        this.marca = marca;
    }

    public void setModelo(String modelo) {

        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Erro! modelo informado não correspondente.");
        }

        this.modelo = modelo;
    }

    public void setPlaca(String placa) {

        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Erro! placa informada não correspondente.");
        }

        this.placa = placa;
    }

    public void setAno(int ano) {

        if (ano > 2026) {
            throw new IllegalArgumentException("Erro! ano informado de maneira errada.");
        }

        this.ano = ano;
    }

    public void setPreco(double preco) {

        if (preco <= 0) {
            throw new IllegalArgumentException("Erro! informe um preço válido.");
        }

        this.preco = preco;
    }

    @Override
    public String toString() {

        return "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nPlaca: " + placa +
                "\nAno: " + ano +
                "\nPreço: " + preco +
                "\nData de aquisição: " + dataDeAquisicao;
    }
}