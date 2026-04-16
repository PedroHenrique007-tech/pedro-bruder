public class Atv1 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Pedro");
        p1.setSexo('M');
        p1.setData("14/07/2006");
        p1.setEstadoCivil("Comprometido");

        System.out.println("O seu nome é: " + p1.getNome());

        Pessoa p2 = new Pessoa();
        p2.setNome("Yuri");
        p2.setSexo('M');
        p2.setData("19/09/2006");
        p2.setEstadoCivil("Futuro Casado");

        System.out.println("O seu nome é: " + p2.getNome());


    }
}
