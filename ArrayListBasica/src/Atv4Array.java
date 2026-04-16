import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atv4Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe Numero que deseja procurar");
        int n = sc.nextInt();
        List<Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(1);
        numeros.add(7);
        numeros.add(10);
        numeros.add(56);
        System.out.println("Índice["+numeros.indexOf(n)+"]");

    }
}
