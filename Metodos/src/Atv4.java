import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        maior(vetor);
        menor(vetor);
        media(vetor);
    }

    public static void maior(int vetor[]) {
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("Maior: " + maior);
    }

    public static void menor(int vetor[]) {
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("Menor: " + menor);
    }

    public static void media(int vetor[]) {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = (double) soma / vetor.length;
        System.out.println("Media: " + media);
    }
}