public class Avt9 {
    public static void main(String[] args) {
        Carro carro = new Carro(20);
        double acelerar = carro.acelerar(10);
        double reduzir = carro.reduzir(5);
        System.out.println("Acelerar: "+ acelerar +"\nReduzir: "+reduzir);
    }

}
