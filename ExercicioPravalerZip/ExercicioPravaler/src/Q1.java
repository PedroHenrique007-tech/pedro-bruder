import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

    System.out.print("Digite qual o número da Matrícula: ");
    int matricula = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Digite o nome do Funcionário: ");
    String nome = scanner.nextLine();

    System.out.print("Digite a quantia de horas trabalhadas por semana: ");
    double horasTrabalhadas = scanner.nextDouble();

    System.out.print("Digite o valor recebido por hora: ");
    double recebidoHora = scanner.nextDouble();

    double salarioMensal = horasTrabalhadas *4* recebidoHora;

        System.out.println(" -- Dados do Funcionário -- \n");
        System.out.println("Matrícula do Funcionário: \n" + matricula);
        System.out.println("Nome do Funcionário: \n" + nome);
        System.out.printf("Salário Mensal: R$ %.2f\n", salarioMensal);



    }
}
