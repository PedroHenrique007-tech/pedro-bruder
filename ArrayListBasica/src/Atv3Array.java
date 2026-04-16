import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Atv3Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ListaNumeros = new ArrayList<>();

        System.out.println("Informe Numero: ");
        int n = sc.nextInt();
        ListaNumeros.add(n);
        while ( n != 0){
            n = sc.nextInt();
            if (n != 0) {
                ListaNumeros.add(n);
            }
        }
        double soma = 0;
        for(int i = 0; i < ListaNumeros.size();i++){
            soma += ListaNumeros.get(i);
        }
        double media = soma / ListaNumeros.size();
        System.out.println("Media: "+media + "\nMaior: "+ Collections.max(ListaNumeros)+"\nMenor: "+Collections.min(ListaNumeros));
    }
}
