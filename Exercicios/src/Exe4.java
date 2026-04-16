import java.time.YearMonth;
import java.util.Scanner;
public class Exe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe Dia:");
        int dia = sc.nextInt();
        if (dia <1 || dia > 31){
            System.out.println("Erro Dia Invalido!!");
        }else {
            System.out.println("Informe Mês:");
            int mes = sc.nextInt();
            if (mes <1 || mes>12){
                System.out.println("Erro Mês Invalido!!");
            }else{
                System.out.println("Informe Ano:");
                int ano = sc.nextInt();

                YearMonth data = YearMonth.of(ano,mes);
                if (data.isLeapYear()){
                    System.out.println("Data Valida!!");
                }else{
                    System.out.println("Data Invalida!!");
                }
            }


        }

    }

}
