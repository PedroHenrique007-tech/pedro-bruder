import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        System.out.println("Informe a Enstão \n1 - Primavera\n2 - Verão \n3 - Outono \n4 - Inverno");
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        switch (numero) {
            case 1:
                System.out.println(retornarprimavera());
                break;
            case 2:
                System.out.println(retornarverao());
                break;
            case 3:
                System.out.println(retornaroutono());
                break;
            case 4:
                System.out.println(retornarinverno());
                break;
            default:
                System.out.println("Numero Invalido!!");

        }
    }
    public static String retornarprimavera(){
        return "Flores estão desabrochando";

    }
    public static String retornarverao(){
        return "É Verão bora praia";
    }
    public static String retornaroutono(){
        return "Flor Cainda Bem vindo ao Outono";
    }
    public static String retornarinverno(){
        return "Esta Frio la fora, Bem vindo ao Inverno";
    }
}
