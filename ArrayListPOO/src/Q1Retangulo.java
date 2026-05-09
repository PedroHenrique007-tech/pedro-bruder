public class Q1Retangulo {

    private double largura;
    private double altura;

    public Q1Retangulo(double largura, double altura){
        setLargura(largura);
        setAltura(altura);
    }

    public double getLargura(){
        return largura;
    }

    public double getAltura(){
        return altura;
    }

    public void setLargura(double largura){
        if(largura <= 0){
            throw new IllegalArgumentException("A largura está invalida");
        }
        this.largura = largura;
    }

    public void setAltura(double altura){
        if(altura <= 0){
            throw new IllegalArgumentException("A altura está invalida");
        }
        this.altura = altura;
    }

    public double calcularArea(){
        return largura * altura;
    }

    public double calcularPerimetro(){
        return 2 * (largura + altura);
    }

    @Override
    public String toString(){
        return "largura: " + largura +
                ", altura: " + altura +
                ", area: " + calcularArea() +
                ", perimetro: " + calcularPerimetro();
    }
}