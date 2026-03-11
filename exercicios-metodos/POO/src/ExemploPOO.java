public class ExemploPOO {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();

        v1.modelo = "Honda City";
        v1.comprimento = 4.2;
        v1.passageiros = 5;
        v1.velMax= 190;
        v1.cor = "Vermelho";

        Veiculo v2 = new Veiculo();
        v2.modelo = "Volkswagen Gol";
        v2.comprimento = 3.9;
        v2.passageiros = 5;
        v2.velMax = 170;
        v2.cor = "Verde";

        if(v1.velMax > v2.velMax) {
            System.out.println("O " + v1.modelo + " é mais rapido. ");
        }else{
            System.out.println("O " + v2.modelo + " é mais rapido. ");
        }
    }
}
