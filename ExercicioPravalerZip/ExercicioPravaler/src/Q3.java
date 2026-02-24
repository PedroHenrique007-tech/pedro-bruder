import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua Altura em Metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu Peso em Quilogramas: ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura*altura);
        System.out.printf(" Seu IMC é : %.2f\n",imc);

        if (imc < 18.5){
            System.out.println("Classificação: Magreza");
        }
        else if ( imc<= 24.9){
            System.out.println("Classificação: Saudável");
        }
        else if (imc <= 29.9){
            System.out.println("Classificação: Sobrepeso");
        }
        else if ( imc <= 34.9){
            System.out.println("Classificação: Obesidade Grau 1");
        }
        else if ( imc <= 39.9){
            System.out.println("Classificação: Obesidade Grau 2");
        }
        else {
            System.out.println("Classificação: Obesidade Grau 3");
        }





    }
}
