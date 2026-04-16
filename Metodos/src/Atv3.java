import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe Número: ");
        int num = sc.nextInt();
        mostrarMetodo(num);
    }
    public static void mostrarMetodo(int numero){
        for (int i = 1; i <= 20; i++){
            System.out.println(numero + i);
        }
    }
}
