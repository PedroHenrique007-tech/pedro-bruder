import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Atv5Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma Palavra: ");
        String entrada = sc.next().toLowerCase();

        List<Character> original = new ArrayList<>();
        for (int i = 0; i < entrada.length(); i++){
            original.add(entrada.charAt(i));
        }
        List<Character> invertida = new ArrayList<>(original);
        Collections.reverse(invertida);

        if(original.equals(invertida)){
            System.out.println("É um palíndormo");
        }else{
            System.out.println("Não é um palíndromo");
        }

    }
}
