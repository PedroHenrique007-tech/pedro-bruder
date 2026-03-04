import java.util.Scanner;

public class Metodo2 {

    public static void main(String[] args) {
        System.out.println("Digite o nome do amigo : ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        if(nome.equals("kevin")){
            kevin();
        }else if(nome.equals("jao")){
            jao();
        }else if(nome.equals("yuri")) {
            yuri();
        }else if(nome.equals("edu")) {
            edu();
        }else if(nome.equals("romero")) {
            romero();
        }
    }

    public static void kevin(){
        System.out.println(" O nome dele é Kevin ! \n Ele tem 19 anos de idade \n Ele é estudante do curso de desenvolvimeto de sistemas. ");
    }
    public static void jao(){
        System.out.println(" O nome dele é João ! \n Ele tem 20 anos de idade \n Ele é estudante do curso de desenvolvimeto de sistemas. ");
    }
    public static void edu(){
        System.out.println(" O nome dele é Eduardo ! \n Ele tem 21 anos de idade \n Ele é estudante do curso de desenvolvimeto de sistemas. ");
    }
    public static void yuri(){
        System.out.println(" O nome dele é Yuri ! \n Ele tem 19 anos de idade \n Ele é estudante do curso de desenvolvimeto de sistemas. ");
    }
    public static void romero(){
        System.out.println(" O nome dele é Romero ! \n Ele tem 17 anos de idade \n Ele é estudante do curso de desenvolvimeto de sistemas. ");
    }







}
