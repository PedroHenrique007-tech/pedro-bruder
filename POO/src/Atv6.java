public class Atv6 {
        public static void main(String[] args) {
           Mercado[] mercados = new Mercado[3];

            //Unidade Blumenau
            mercados[0] = new Mercado();
            mercados[0].setNome("MercadoBlu");
            mercados[0].setMaca(500);
            mercados[0].setPrecoM(5);
            mercados[0].setLaranja(500);
            mercados[0].setPrecoL(5);

            //Unidade Joinvile
            mercados[1] = new Mercado();
            mercados[1].setNome("MercadoJVL");
            mercados[1].setMaca(300);
            mercados[1].setPrecoM(5);
            mercados[1].setLaranja(300);
            mercados[1].setPrecoL(5);

            //Unidade Florianopolis
            mercados[2] = new Mercado();
            mercados[2].setNome("MercadoFlor");
            mercados[2].setMaca(200);
            mercados[2].setPrecoM(5);
            mercados[2].setLaranja(200);
            mercados[2].setPrecoL(5);

            double maiorMacas = 0;
            String mercadoMacas = "";

            for(int i = 0; i < mercados.length; i++){
                double receita = mercados[i].getMaca() * mercados[i].getPrecoM();

                if(receita > maiorMacas){
                    maiorMacas = receita;
                    mercadoMacas = mercados[i].getNome();
                }
            }

            System.out.println("Maior receita com maçãs: " + mercadoMacas);

            double menorLaranja = Double.MAX_VALUE;
            String mercadoLaranja = "";

            for(int i = 0; i < mercados.length; i++){
                double receita = mercados[i].getLaranja() * mercados[i].getPrecoL();

                if(receita < menorLaranja){
                    menorLaranja = receita;
                    mercadoLaranja = mercados[i].getNome();
                }

            }
            System.out.println("Menor receita com Laranjas: " + mercadoLaranja);

            double totalMacas = 0;
            double totalLaranja = 0;

            for (int i = 0; i < mercados.length; i++){
                totalMacas += mercados[i].getMaca() * mercados[i].getPrecoM();
                totalLaranja += mercados[i].getLaranja() * mercados[i].getPrecoL();
            }

            if (totalMacas > totalLaranja){
                System.out.println("A Franquia vendeu mais Maças");
            }else {
                System.out.println("A Franquia vendeu mais Laranjas");
            }

        }
}
