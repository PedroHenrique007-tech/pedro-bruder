import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Maior: " + maior(vetor));
        System.out.println("Menor: " + menor(vetor));
        System.out.println("Media: " + media(vetor));
    }

    public static int maior(int vetor[]) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }

        }
        return maior;
    }

    public static int menor(int vetor[]) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }

        }
        return menor;
    }

    public static double media(int vetor[]) {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return (double) soma / vetor.length;
    }

}