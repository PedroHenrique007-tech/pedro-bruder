import java.util.Scanner;

public class Metodo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número desejado: ");
        int num = sc.nextInt();

        boolean resultado = inpPar(num);
        System.out.println("O número é par? " + resultado);
    }
    public static boolean inpPar(int num){
        return num % 2 == 0;
        }
    }

