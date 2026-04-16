import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe Peso: ");
        double massa = sc.nextDouble();
        System.out.println("Informe Altura: ");
        double altura = sc.nextDouble();
        double IMC = massa/(altura*altura);

        System.out.printf("IMC: %.2f\n",IMC);
        if (IMC < 18.5){
            System.out.println("Magreza");
        } else if (IMC >= 18.5 || IMC <= 24.9) {
            System.out.println("Saudável");
        } else if (IMC >= 25.0 || IMC <= 29.9 ) {
            System.out.println("Sobrepeso");
        } else if (IMC >= 30.0 || IMC <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (IMC >= 35.0 || IMC <= 39.9) {
            System.out.println("Obesidade Grau II");
        }else{
            System.out.println("Obesidade Grau III");
        }
    }
}
