import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número base: ");
        int base = sc.nextInt();

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        numeroProximo(base, num1, num2);
    }
    public static void numeroProximo(int base, int num1, int num2){
        int distanciaNum1 = (base - num1);
        int distanciaNum2 = (base - num2);
        if (distanciaNum1 < distanciaNum2){
            System.out.println(num1 + " é a mais proxima da base "+ base);
        }else if (distanciaNum2 < distanciaNum1){
            System.out.println(num2 + " é a mais proxima da base "+ base);
        }else{
            System.out.println("Ambas são Igualmente proximas da base " + base);
        }
    }
}
