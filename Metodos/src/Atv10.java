import java.util.Scanner;

public class Atv10 {

    public static boolean limite(int n, int max){
        return n <= max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o limite Máximo: ");
        int max = sc.nextInt();
        System.out.println("Informe Número: ");
        int n = sc.nextInt();
        if(limite(n, max)){
            System.out.println(n + " está dentro dos limites impostos");
        }else{
            System.out.println(n + " não está dentro dos limites impostos");
        }
    }
}