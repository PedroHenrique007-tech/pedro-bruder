import java.util.Scanner;
public class Exe2 {
    public static void main(String[] args) {
        //2
        System.out.println("Informe Nome Vendedor: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        System.out.println("Valor de Vendas: ");
        double venda = sc.nextDouble();
        double salario = 100.0;
        double total = (venda*0.15)+salario;
        System.out.printf("Nome: %s\nSalário: %.2f",nome,total);

    }
}
