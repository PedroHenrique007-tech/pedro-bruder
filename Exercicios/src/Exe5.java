import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        double altura;

        int qtd = 0;
        double somaAltura = 0;

        double maiorAltura = 0;
        double menorAltura = 0;
        int numMaisAlto = 0;
        int numMaisBaixo = 0;

        System.out.print("Digite o número da inscrição (0 para encerrar): ");
        numero = scanner.nextInt();

        while (numero != 0) {

            System.out.print("Digite a altura do atleta: ");
            altura = scanner.nextDouble();

            if (qtd == 0) {
                maiorAltura = altura;
                menorAltura = altura;
                numMaisAlto = numero;
                numMaisBaixo = numero;
            } else {

                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    numMaisAlto = numero;
                }

                if (altura < menorAltura) {
                    menorAltura = altura;
                    numMaisBaixo = numero;
                }
            }

            somaAltura += altura;
            qtd++;

            System.out.print("Digite o número da inscrição (0 para encerrar): ");
            numero = scanner.nextInt();
        }

        if (qtd > 0) {

            double media = somaAltura / qtd;

            System.out.println("\nQuantidade de atletas: " + qtd);
            System.out.println("Mais alto -> Inscrição: " + numMaisAlto +
                    " | Altura: " + maiorAltura);
            System.out.println("Mais baixo -> Inscrição: " + numMaisBaixo +
                    " | Altura: " + menorAltura);
            System.out.printf("Altura média: %.2f\n", media);

        } else {
            System.out.println("Nenhum atleta foi cadastrado.");
        }

        scanner.close();
    }
}