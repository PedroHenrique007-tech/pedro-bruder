import java.time.LocalDate;

public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double preco;
    private LocalDate dataDeAquisicao;


    public Carro(String marca, String modelo, String placa, int ano ,double preco, LocalDate dataDeAquisicao) {
       setMarca(marca);
        setModelo(modelo);
        setPlaca(placa);
        setAno(ano);
        setPreco(preco);

    }

    public double depreciacao1(double valor, int ano) {
        if (ano < 2016) {
            System.out.println("Seu carro desvalorizou: " + taxa1);
        }
        double taxa1 = 0.07;
        return valor * Math.pow((1 + taxa1), ano);
    }
    public double depreciacao2(double valor, int ano) {
        if (ano > 2016) {
            System.out.println("Seu carro desvalorizou: " + taxa2);
        }
        double taxa2 = 0.05;
        return valor * Math.pow((1 + taxa2), ano);

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

    public int getAno() {return ano; }

    public double getPreco() {
        return preco;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Erro! Preencha o campo marca corretamente.");
        }
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Erro! Preencha o campo modelo corretamente.");
        }
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Erro! Preencha o campo placa corretamente.");
        }
        this.placa = placa;
    }

    public void setAno(int ano) {
        if (ano > 2026){
            throw new IllegalArgumentException("Ano não corresponde.");
        }
        this.ano = ano;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Erro! Numero invalido.");
        }
        this.preco = preco;
    }
@Override
    public String toString(){
    return "Marca: "+marca+"Modelo: "+modelo+"Placa: "+placa+"Ano: " +ano+ "Data de Aquisição : "+ dataDeAquisicao +"Preço: "+preco;
}
}
