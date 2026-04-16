public class Exe8 {

        public static void main(String[] args) {

            int[][] matriz = {
                    {210, 3, 399900},
                    {160, 3, 329900},
                    {240, 3, 369000},
                    {141, 2, 232000},
                    {300, 4, 539900},
                    {198, 4, 299900},
                    {153, 3, 314900},
                    {142, 3, 199000},
                    {138, 3, 212000},
                    {149, 3, 242500},
                    {194, 4, 240000},
                    {200, 3, 347000},
                    {189, 3, 330000},
                    {447, 5, 699900},
                    {126, 3, 259900}
            };

            double somaPrecos = 0;

            for (int i = 0; i < matriz.length; i++) {
                somaPrecos += matriz[i][2];
            }

            double mediaPrecos = somaPrecos / matriz.length;
            System.out.println("a) Média dos preços: R$ " + mediaPrecos);



            int menorTamanho = matriz[0][0];
            int precoMenorCasa = matriz[0][2];

            for (int i = 1; i < matriz.length; i++) {
                if (matriz[i][0] < menorTamanho) {
                    menorTamanho = matriz[i][0];
                    precoMenorCasa = matriz[i][2];
                }
            }

            System.out.println("b) Preço da menor casa: R$ " + precoMenorCasa);


            int maxQuartos = matriz[0][1];
            int minQuartos = matriz[0][1];

            int tamanhoMax = matriz[0][0];
            int tamanhoMin = matriz[0][0];

            for (int i = 1; i < matriz.length; i++) {

                if (matriz[i][1] > maxQuartos) {
                    maxQuartos = matriz[i][1];
                    tamanhoMax = matriz[i][0];
                }

                if (matriz[i][1] < minQuartos) {
                    minQuartos = matriz[i][1];
                    tamanhoMin = matriz[i][0];
                }
            }

            int diferenca = Math.abs(tamanhoMax - tamanhoMin);
            System.out.println("c) Diferença de tamanho: " + diferenca + " m²");


            double somaTamanho = 0;
            int contador = 0;

            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][2] > 300000) {
                    somaTamanho += matriz[i][0];
                    contador++;
                }
            }

            if (contador > 0) {
                double mediaTamanho = somaTamanho / contador;
                System.out.println("d) Média do tamanho (preço > 300000): " + mediaTamanho + " m²");
            } else {
                System.out.println("d) Nenhuma casa acima de 300000.");
            }
        }
    }