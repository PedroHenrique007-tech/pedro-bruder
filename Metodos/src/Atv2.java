import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do Seu Amigo:");
        String nome = sc.next();
        if (nome.equalsIgnoreCase("pedro")){
            pedro();
        } else if (nome.equalsIgnoreCase("joao")) {
            joao();
        } else if (nome.equalsIgnoreCase("romero")) {
            romero();
        } else if (nome.equalsIgnoreCase("yuri")) {
            yuri();
        }else if (nome.equalsIgnoreCase("Edu")){
            edu();
        }else{
            System.out.println("Amigo não encontrado!!");
        }

    }
    public static void pedro(){
        System.out.println("O nome dele(a) é Pedro\nEle(a) tem 19 anos\nEle(a) é estudante de desenvolvimento de sistemas");
    }
    public static void joao(){
        System.out.println("O nome dele(a) é João\nEle(a) tem 20 anos\nEle(a) é estudante de desenvolvimento de sistemas");
    }
    public static void romero(){
        System.out.println("O nome dele(a) é Romero\nEle(a) tem 17 anos\nEle(a) é estudante de desenvolvimento de sistemas");
    }
    public static void yuri(){
        System.out.println("O nome dele(a) é Yuri\nEle(a) tem 19 anos\nEle(a) é estudante de desenvolvimento de sistemas");
    }
    public static void edu(){
        System.out.println("O nome dele(a) é Edu\nEle(a) tem 21 anos\nEle(a) é estudante de desenvolvimento de sistemas");
    }
}
