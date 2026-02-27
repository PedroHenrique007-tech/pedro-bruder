import java.util.Scanner;

public class Metodo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero desejado : ");
        int numero = sc.nextInt();
        calculoFim(numero);


    }

    public static void calculoFim(int num) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(num + i );


        }

    }
}

