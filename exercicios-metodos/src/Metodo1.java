import java.util.Scanner;

public class Metodo1 {
    public static void main(String[] args) {

        System.out.println("Digite 1- Verão \n 2- Outono \n 3- Primavera \n 4- Inverno");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        switch (numero) {
            case 1:
                verao();
                break;
            case 2:
                outono();
                break;
            case 3:
                primavera();
                break;
            case 4:
                inverno();
                break;
            default:
                System.out.println("Numero invalido !");
        }

    }

    public static void verao() {
        System.out.println("Verão, está quente !");
    }

    public static void outono() {
        System.out.println("Outono, as folhas estão abrochando !");
    }

    public static void primavera() {
        System.out.println("Primavera, as folhas estão caindo !");
    }

    public static void inverno() {
        System.out.println("Inverno, está bem frio !");
    }
}

