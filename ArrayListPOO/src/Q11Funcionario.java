public class Q11Funcionario {

    private String nome;
    private Q11Departamento departamento;

    public Q11Funcionario(String nome) {
        this.nome = nome;
    }

    public void atribuirDepartamento(
            Q11Departamento departamento) {

        this.departamento = departamento;
    }

    @Override
    public String toString() {

        return "Funcionário: " + nome;
    }
}
