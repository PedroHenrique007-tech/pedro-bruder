public class Atv8 {
    public static void main(String[] args) {
        Contribuinte c1 = new Contribuinte("Altherion Silva","14278596321","Reino de Valdoria",18500);
        Contribuinte c2 = new Contribuinte("Kael Draven Souza","38921465709","Terras Sombras de Nox",9200);
        Contribuinte c3 = new Contribuinte("Lyara Fernvale Costa","51790328466","Floresta de Elunaria",25750);
        Contribuinte c4 = new Contribuinte("Thorgar Pedraforte Alves","76811245930","Montanhas de Karak-Dum",32000);
        Contribuinte c5 = new Contribuinte("Seraphina Noctis Ribeiro","90466712855","Cidade Arcana de Velkyn",14300);
        Contribuinte listaContribuinte[] = {c1,c2,c3,c4,c5};

        for (int i = 0; i < 5; i++){
            System.out.println(listaContribuinte[i].toString());
        }
        double totalImpostoArrecado = 0;
        for (int i = 0; i < 5; i++){
            totalImpostoArrecado += listaContribuinte[i].impostoPagar();
        }
        System.out.println("Total Imposto: " + totalImpostoArrecado);
    }
}
