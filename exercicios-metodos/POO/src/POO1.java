public class POO1 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

        p1.nome = "Kevin";
        p1.dataNascimento = "26/08/2006";
        p1.sexo = 'M';
        p1.estadoCivil = "De rolo";

        System.out.println("O seu nome é : " + p1.nome);

        Pessoa p2 = new Pessoa();

        p2.nome = "Jão";
        p2.dataNascimento = " 15/01/2006";
        p2.sexo = 'F';
        p2.estadoCivil = " Solteiro ";

        System.out.println("O seu nome é : " + p2.nome);

    }
}
