public class ExemploPOO {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();

        v1.setModelo("Onix Cedan");
        v1.setComprimento(4.5);
        v1.setPassageiros(9);
        v1.setVelMax(195);
        v1.setCor("Vermelho Bordo");

        Veiculo v2 = new Veiculo();
        v2.setModelo("Palio");
        v2.setComprimento(3.5);
        v2.setPassageiros(6);
        v2.setVelMax(140);
        v2.setCor("Verelho");

        if (v1.getVelMax() > v2.getVelMax()){
            System.out.println("O " + v1.getModelo() + " é mais rápido que o "+ v2.getModelo());
        }else{
            System.out.println("O " + v2.getModelo() + " é mais rápido que o "+ v1.getModelo());
        }

    }
}
