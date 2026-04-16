import java.util.Scanner;
public class Atv1 {
    public static void main(String[] args) {
        System.out.println("Informe a Enstão \n1 - Primavera\n2 - Verão \n3 - Outono \n4 - Inverno");
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        switch (numero) {
            case 1:
                primavera();
                break;
            case 2:
                verao();
                break;
            case 3:
                outono();
                break;
            case 4:
                inverno();
                break;
            default:
                System.out.println("Numero Invalido!!");

        }
    }
    public static void primavera() {
        System.out.println("Flores estão desabrochando");
    }
    public static void verao() {
        System.out.println("É Verão bora praia");

    }
    public static void  outono(){
        System.out.println("Flor Cainda Bem vindo ao Outono");
    }
    public static void inverno(){
        System.out.println("Esta Frio la fora, Bem vindo ao Inverno");
    }
}


