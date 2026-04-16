import java.util.Scanner;

public class Atv8 {
    public static double mediaAritimetica(double soma){
        return soma/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Informe a "+ i +"° Nota: ");
            double nota = sc.nextDouble();
            soma += nota;
        }
        System.out.printf("A media é %.2f", mediaAritimetica(soma));
    }
}
