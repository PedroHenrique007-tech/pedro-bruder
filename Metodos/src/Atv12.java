import java.util.Scanner;

public class Atv12 {

    public static char parImpar(String palavra){
        int tamanho = palavra.length();
        if (tamanho % 2 == 0){
            return palavra.charAt(0);
        }else{
            return palavra.charAt(1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.next();
        System.out.println("Caractere: " + parImpar(palavra));
    }
}
