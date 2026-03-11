import java.util.Scanner;

public class Metodo8 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a primeira nota : ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota : ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota : ");
        double nota3 = sc.nextDouble();

        double soma = (nota1 + nota2 + nota3 ) ;


        System.out.println("Sua média é : "+calcularMedia(soma) );
    }
    public static double calcularMedia(double soma){
        return soma/3;
    }
}
