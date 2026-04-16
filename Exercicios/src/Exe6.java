import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa inicial em Kg: ");
        double massaInicial = scanner.nextDouble();

        double massa = massaInicial;
        int tempo = 0;

        while (massa >= 0.0005) {
            massa = massa / 2;
            tempo += 50;
        }

        System.out.println("\nMassa inicial: " + massaInicial + " Kg");
        System.out.println("Massa final: " + massa + " Kg");
        System.out.println("Tempo necessário: " + tempo + " segundos");

        scanner.close();
    }
}


