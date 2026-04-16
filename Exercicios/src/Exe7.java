public class Exe7 {
    public static void main(String[] args) {

        int [] numero = {3 ,4 ,2 ,23 ,30 };

        int maior = numero[0];
        int menor = numero[0];
        int soma = 0;

        for (int i = 0; i < numero.length; i++) {

            soma += numero[i];

            if(numero[i] > maior){
                maior=numero[i];
            }
            if(numero[i] < menor){
                menor= numero[i];
            }
        }
            double media = (double)soma/ numero.length;

            System.out.println("O maior elemento é : "+maior);
            System.out.println(" O menor elemento é : "+menor);
            System.out.println("A média dos elementos exibidos é de : "+media);

    }
}
