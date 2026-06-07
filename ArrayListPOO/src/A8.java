public class A8 {
    public static void main(String[] args) {

        Q8Camara camara = new Q8Camara();

        camara.adicionarVereador(
                new Q8Vereador("João", "ABC", 10, 8));

        camara.adicionarVereador(
                new Q8Vereador("Pedro", "ABC", 15, 12));

        camara.adicionarVereador(
                new Q8Vereador("Carlos", "XYZ", 20, 18));

        System.out.println("Acima da média:");

        for (Q8Vereador v : camara.obterAcimaDaMedia()) {
            System.out.println(v);
        }

        System.out.println("\nMelhor partido:");
        System.out.println(camara.melhorPartido());
    }
}
