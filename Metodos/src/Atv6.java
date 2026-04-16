import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe Seu Nome: ");
        String nome = sc.next();
        System.out.println("Informe seu Sobrenome: ");
        String sobreNome = sc.next();
        System.out.println("Sobrenome de solteira de sua mãe: ");
        String mae = sc.next();
        System.out.println("Nome da Cidade onde Você nasceu: ");
        String cidade = sc.next();

        generateStarWarsName(nome,sobreNome,mae,cidade);
    }
    public static void generateStarWarsName(String nome, String sobreNome, String mae, String cidade){

        String nomeSW = sobreNome.substring(0,3) + nome.substring(0,2);
        String sobreNomeSW = mae.substring(0,2) + cidade.substring(0,3);
        String nomeCompleto = nomeSW + " " + sobreNomeSW;

        System.out.println("Nome do Personagem: "+ nomeCompleto);
    }
}
