import java.util.Scanner;

public class Metodo5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o numero base : ");
        int base = input.nextInt();

        System.out.println("Insira o primeiro numero : ");
        int num1 = input.nextInt();

        System.out.println("Insira o segundo numero : ");
        int num2 = input.nextInt();

        maisProximo (base, num1, num2 ) ;

    }
    public static void maisProximo(int base, int num1, int num2){
        int distancia1 (base - num1);
        int distancia2 (base - num2);

        if(distancia1 < distancia2){
            System.out.println(num1+ "esta mais perto de "+ base);
        }
        else if ()
    }
}
