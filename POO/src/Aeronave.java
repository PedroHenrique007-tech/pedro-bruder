public class Aeronave {
    private String modelo;
    private int passageiros;
    private double velocidadeMaxima;
    private double capacidadeCombustivel;
    private  double queimaCombustivelMin;

    public Aeronave(String modelo, int passageiros, double velocidadeMaxima, double capacidadeCombustivel, double queimaCombustivelMin) {
        setModelo(modelo);
        setPassageiros(passageiros);
        setVelocidadeMaxima(velocidadeMaxima);
        setCapacidadeCombustivel(capacidadeCombustivel);
        setQueimaCombustivelMin(queimaCombustivelMin);
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            System.out.println("Erro Modelo Invalido");
        }else {
            this.modelo = modelo;
        }
    }

    public void setPassageiros(int passageiros) {
        if (passageiros < 0){
            System.out.println("Erro Numero de passageiros Invalido");
        }else {
            this.passageiros = passageiros;
        }
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if (velocidadeMaxima <= 0){
            System.out.println("Erro Velocidade Maxima invalida");
        }else {
            this.velocidadeMaxima = velocidadeMaxima;
        }
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        if (capacidadeCombustivel <= 0){
            System.out.println("Erro Capacidade de Combustivel invalida");
        }else{
            this.capacidadeCombustivel = capacidadeCombustivel;
        }
    }

    public void setQueimaCombustivelMin(double queimaCombustivelMin) {
        if (queimaCombustivelMin <= 0){
            System.out.println("Erro Queima de Combustivel Min Invalida");
        }else {
            this.queimaCombustivelMin = queimaCombustivelMin;
        }
    }

    public double tempoAr(){
          return capacidadeCombustivel/queimaCombustivelMin;
    }
    public double distancia(){
        return velocidadeMaxima*tempoAr();
    }

    public String getModelo() {
        return modelo;
    }

    public int getPassageiros() {
        return passageiros;
    }
}
