import java.util.Scanner;

public class ExerciciosEntrada {
    public static void main(String[] args) {
        //Exercicio 1
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe Valor do 1 Produto: ");
        double v1 = sc.nextDouble();
        System.out.println("Informe Valor do 2 Produto: ");
        double v2 = sc.nextDouble();
        double valorFinal = v1+v2;

        System.out.println("\nValor Final é de R$"+valorFinal);

        //Exercicio 2
        System.out.println("Informe A altura");
        double p1 = sc.nextDouble();
        System.out.println("Informe A altura");
        double p2 = sc.nextDouble();
        double diferencaA=p1-p2;

        System.out.println("\nA diferença entre as alturas é de: " + diferencaA + " metros");

        //Exercicio 3
        System.out.println("Informe A base");
        double base = sc.nextDouble();
        System.out.println("Informe A altura");
        double altura = sc.nextDouble();
        double area = base*altura;
        double perimetro = 2*(base+area);

        System.out.println("\nÁrea: "+area+" Metros"+"\nPerimetro: "+perimetro+" Metros");

        //Exercicio 4
        System.out.println("Informe seu Nome");
        String primNome = sc.next();
        System.out.println("Informe seu Sobrenome");
        String sobreNome = sc.next();
        String nomeCompleto = primNome+" "+sobreNome;

        System.out.println("\nMeu Nome é " + nomeCompleto);


        //Exercicio 5

        System.out.println("Insira Seu Nome: ");
        String nome = sc.next();
        System.out.println("Insira Sua Idade: ");
        int idade = sc.nextInt();

        System.out.println("Seu nome é "+nome+" e sua idade é " + idade);
    }
}
