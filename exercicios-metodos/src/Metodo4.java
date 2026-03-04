
public class Metodo4 {

    public static void main(String[] args) {
        int vetor[]= { 8, 7, 16, -3, 0};
        maior(vetor);
        menor(vetor);
        media(vetor);
    }

    public static void maior(int[] vetor) {
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.printf("O maior valor é: %d\n", maior);
    }

    public static void menor(int[] vetor) {
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.printf("O menor valor é: %d\n", menor);
    }

    public static void media(int vetor[]) {
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        double media = soma / vetor.length;

        System.out.printf("A média final é: %.2f\n", media);
    }
}


