import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        if (dia < 1 || dia > 31){
            System.out.println("Erro! Dia inválido.");
            return;
        }

        System.out.print("Digite o Mês: ");
        int mes = scanner.nextInt();

        if (mes < 1 || mes > 12){
            System.out.println("Erro! Mês inválido.");
            return;
        }

        System.out.print("Digite o Ano: ");
        int ano = scanner.nextInt();

        boolean bissexto = false;

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            bissexto = true;
        }

        int diasDoMes = 0;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasDoMes = 31;
                break;

            case 4: case 6: case 9: case 11:
                diasDoMes = 30;
                break;

            case 2:
                if (bissexto) {
                    diasDoMes=29;
                }else{
                    diasDoMes=28;
                }
                break;
        }
        if (dia <= diasDoMes) {

            System.out.println("Data válida");

        }else{

            System.out.println("Data inválida");
        }









    }
}
