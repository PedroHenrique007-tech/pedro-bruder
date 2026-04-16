public class Atv7 {
    public static void main(String[] args) {


        Aeronave a1 = new Aeronave("Prime", 250, 2500, 250, 25);
        Aeronave a2 = new Aeronave("Etheria", 600, 6000, 600, 60);
        Aeronave a3 = new Aeronave("Alfa", 1000, 10000, 1000, 100);
        Aeronave a4 = new Aeronave("Hino",2000,20000,2000,20);
        Aeronave aeronave[] = {
            a1, a2, a3, a4
        };



        Aeronave maior = aeronave[0];
        Aeronave tempoAr = aeronave[0];
        Aeronave MaiorDistancia = aeronave[0];
        for (int i = 0; i < aeronave.length; i++) {
            if (aeronave[i].getPassageiros() > maior.getPassageiros()) {
                maior = aeronave[i];
            }


            if (aeronave[i].tempoAr() > tempoAr.getPassageiros()) {
                tempoAr = aeronave[i];
            }


            if (aeronave[i].distancia() > MaiorDistancia.getPassageiros()) {
                MaiorDistancia = aeronave[i];
            }
        }

        System.out.println("Leva maior numero de passageiro: " + maior.getModelo());
        System.out.println("Fica mais tempo no ar: " + tempoAr.getModelo());
        System.out.println("Maior Distancia: " + MaiorDistancia.getModelo());

    }
}