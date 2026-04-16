public class Atv5 {
    public static void main(String[] args) {
        Funcionario p1 = new Funcionario();
        Funcionario p2 = new Funcionario();

        p1.salario = 500;
        p1.salarioPorcentual(10);

        p2.salario = 500;
        p2.salarioPorcentual(10);

        System.out.println("ID 0" + p1.Identificacao(1)+" "+p1.nomeCompleto("Joao","Abreu")+  "\nSalario Anual: " + p1.salaAnual());
        System.out.println("ID 0" + p2.Identificacao(2)+" "+p2.nomeCompleto("Pedro","Henrique") +  "\nSalario Anual: " + p2.salaAnual());
    }
}
