public class Carro {
    private double velocidadeCarro;

    public Carro(double velocidadeCarro) {
        setVelocidadeCarro(velocidadeCarro);
    }

    public void setVelocidadeCarro(double velocidadeCarro) {
        this.velocidadeCarro = velocidadeCarro;
    }
    public double acelerar(double valor){
        double resuladoAcelerar = 0;
        if (valor >= 0 && valor < 20){
            resuladoAcelerar = velocidadeCarro + valor;
        } else {
            throw  new IllegalArgumentException("Velocidade inválida para acelerar!");
        }
        return resuladoAcelerar;
    }

    public double reduzir(double valor){
        double resultadoReduzir = 0;
        if (valor >= 0 && valor < 30){
            resultadoReduzir = velocidadeCarro - valor;
        } else {
            throw  new IllegalArgumentException("Velocidade inválida para acelerar!");
        }
        return resultadoReduzir;
    }
}
