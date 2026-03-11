import java.util.Scanner;

public class Metodo10 {
    public static boolean limite(int max, int num ){
        if(num<= max){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o limite maximo: ");
        int max = sc.nextInt();
        System.out.println("Informe o número: ");
        int num = sc.nextInt();
        if(limite(num,max)){
            System.out.println(num+ " : Não está dentro dos limites impostos. ");
        }else{
            System.out.println(num+ " : Está dentro dos limites impostos. ");
        }
    }
}
