import java.util.Scanner;
public class Exe1 {
    public static void main(String[] args) {
        //1
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Informe Numero da matricula: ");
        int matri = sc1.nextInt();
        System.out.println("Informe Seu Nome: ");
        String nome = sc1.next();
        System.out.println("Informe Salario por Hora : ");
        double salario = sc1.nextDouble();
        System.out.printf("N° da Matricula: %d Nome: %s\nSalario Mensal: %.2f",matri ,nome, (salario*40)*4);
    }
}