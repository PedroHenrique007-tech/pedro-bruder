import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Nome do Vendedor: \n");
        String nome = scanner.nextLine();

        System.out.print("Digite o Salario fixo do Vendedor: \n");
        double salarioFixo = scanner.nextDouble();

    System.out.print("Qual a Quantia de Vendas Feitas: \n");
    double vendasMensal = scanner.nextDouble();

    double taxa = vendasMensal* 0.15;
    double salarioTotal = taxa+salarioFixo;

        System.out.println(" -- Dados do Funcionário -- \n");
    System.out.println("Vendedor : \n"+nome);
    System.out.println("Salario Fixo: \n"+salarioFixo);
    System.out.println("Total de Vendas do Mês em Comissão: \n"+taxa);
    System.out.printf("Valor Total Ha Receber : R$ %.2f\n",salarioTotal);



    }
}
