public class Funcionario {

    double salario;

    public int Identificacao(int id) {
        return id;
    }
    public void salarioPorcentual(double porcentual ){
        salario += salario*(porcentual/100);
    }

    public double salaAnual(){
        return (salario*12);
    }

    public String nomeCompleto(String nome, String sobreNome){
        return nome + " " + sobreNome;
    }
}





