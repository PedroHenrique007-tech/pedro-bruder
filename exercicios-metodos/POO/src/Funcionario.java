public class Funcionario {

    int identificacao;
    String nome;
    String sobreNome;
    double salarioMensal;

    public String NomeCompleto(){
        return nome+ " " +sobreNome;
    }
    public double SalarioAnual(){
        return salarioMensal*12;
    }
    public void modificarSal(double percentual){
        double aumento = salarioMensal * (percentual / 100);
        salarioMensal = salarioMensal + aumento;
    }
}
