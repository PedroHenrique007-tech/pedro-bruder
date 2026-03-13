import javax.security.sasl.SaslServer;

public class FuncionarioQuest {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();


        f1.nome = " Jão ";
        f1.sobreNome = "Abreu";
        f1.identificacao = 123;
        f1.salarioMensal = 1000.00;

        System.out.println(" O salario Anual do funcionario é de : "+f1.SalarioAnual());
        System.out.println(" O nome completo é : "+f1.NomeCompleto());
        System.out.println(" Seu aumento é de : "+f1.modificarSal());
    }
}
