import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        //Exercicio 1/
        double v1 = 2.5;
        double v2 = 2.5;
        double valorFinal = v1+v2;
         
        System.out.println("\nValor Final é de R$"+valorFinal);

        //Exercicio 2/
        double p1 = 1.5;
        double p2 = 1.25;
        double diferencaA=p1-p2;

        System.out.println("\nA diferença entre as alturas é de: " + diferencaA + " metros");

        //Exercicio 3/
        double base = 2.0;
        double altura = 2.0;
        double area = base*altura;
        double perimetro = 2*(base+area);

        System.out.println("\nÁrea: "+area+" Metros"+"\nPerimetro: "+perimetro+" Metros");

        //Exercicio 4/
                String nome = "Kevin";
        String sobreNome = "Nervis";
        String nomeCompleto = nome+" "+sobreNome;

        System.out.println("\nMeu Nome é " + nomeCompleto);

        //Exercicio 5/

                Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu nome");
        String nome1 = sc.next();
        System.out.println("Seu Nome é "+nome1);


    }
}