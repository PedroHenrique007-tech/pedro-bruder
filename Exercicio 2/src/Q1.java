import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número de matrícula do funcionário: ");
        int matricula = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor recebido por hora: ");
        double valorHora = scanner.nextDouble();


        double salarioMensal = horasTrabalhadas * valorHora * 4;


        System.out.println("\nMatrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.printf("Salário Mensal: R$ %.2f\n", salarioMensal);


        scanner.close();
    }
}
