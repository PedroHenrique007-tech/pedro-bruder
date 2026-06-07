import java.time.LocalDate;

public class Q12Notebook {

    private String marca;
    private String modelo;
    private String patrimonio;
    private int ano;
    private double preco;
    private LocalDate dataDeEntrada;

    public Q12Notebook(String marca, String modelo, String patrimonio, int ano, double preco,
                       LocalDate dataDeEntrada) {

        setMarca(marca);
        setModelo(modelo);
        setPatrimonio(patrimonio);
        setAno(ano);
        setPreco(preco);
        setDataDeEntrada(dataDeEntrada);
    }

    public double calculoDesvalorizacao(int anoEscolhido) {

        if (anoEscolhido <= LocalDate.now().getYear()) {
            throw new IllegalArgumentException(" Ano escolhido não corresponde a uma data valida. ");
        }

        int anos = anoEscolhido - LocalDate.now().getYear();

        double taxa = taxaParaDefinir();

        return preco * Math.pow(1 - taxa, anos);
    }

    private double taxaParaDefinir() {

        if (ano >= 2020) {
            return 0.06;
        }

        return 0.08;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public LocalDate getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setMarca(String marca) {

        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Marca invalida ");
        }

        this.marca = marca;
    }

    public void setModelo(String modelo) {

        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo invalido ");
        }

        this.modelo = modelo;
    }

    public void setPatrimonio(String patrimonio) {

        if (patrimonio == null || patrimonio.isBlank()) {
            throw new IllegalArgumentException("Patrimonio invalido ");
        }

        this.patrimonio = patrimonio;
    }

    public void setAno(int ano) {

        if (ano > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Ano invalido ");
        }

        this.ano = ano;
    }

    public void setPreco(double preco) {

        if (preco < 0) {
            throw new IllegalArgumentException("Preco invalido ");
        }

        this.preco = preco;
    }

    public void setDataDeEntrada(LocalDate dataDeEntrada) {

        if (dataDeEntrada.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data de entrada inválida");
        }

        this.dataDeEntrada = dataDeEntrada;
    }

    @Override
    public String toString() {
        return "Notebook : " +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", patrimonio='" + patrimonio + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                ", dataDeEntrada=" + dataDeEntrada;
    }
}