import java.util.Scanner;

public class ExerciciosEntrada {

    public static void main(String[] args) {

        //Exercicio 1 /
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Informe O Valor do 1 Produto");
        double v1 = sc1.nextDouble();
        System.out.println("Informe Valor do 2 Produto");
        double v2 = sc1.nextDouble();
        double valorFinal =v1+v2;

        System.out.println("O valor final é de R$ "+valorFinal);


        //Exercicio 2/

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Informe a Altura");
        double p1 = sc2.nextDouble();
        System.out.println("Informe a Altura");
        double p2 = sc2.nextDouble();
        double diferencaAltura = p1 - p2;

        System.out.println("A diferença de alura entre a pessoa 1 e a pessoa 2 é de : " + diferencaAltura + " metros ");

        //Exercicio 3/

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Informe a base");
        double base = sc3.nextDouble();
        System.out.println("Informe a altura");
        double altura = sc3.nextDouble();
        double area = base*altura;
        double perimetro = 2*(base+area);

        System.out.println("A area é de : "+area+ " e a do perimetro é de : "+perimetro);


        //Exercicio 4/

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Informe seu nome : ");
        String nome = sc4.next();
        System.out.println("Informe seu sobrenome");
        String sobreNome = sc4.next();
        String nomeCompleto = nome + " " +sobreNome;

        System.out.println(" Meu nome completo é : "+nomeCompleto);




    }
}