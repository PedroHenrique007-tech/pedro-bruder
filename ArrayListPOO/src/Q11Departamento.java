import java.util.ArrayList;
import java.util.List;

    public class Q11Departamento {

        private String nome;
        private List<Q11Funcionario> funcionarios;

        public Q11Departamento(String nome) {

            this.nome = nome;
            funcionarios = new ArrayList<>();
        }

        public void adicionarFuncionario(
                Q11Funcionario funcionario) {

            funcionarios.add(funcionario);

            funcionario.atribuirDepartamento(this);
        }

        public void removerFuncionario(
                Q11Funcionario funcionario) {

            funcionarios.remove(funcionario);

            funcionario.atribuirDepartamento(null);
        }

        public List<Q11Funcionario> obterLista() {
            return funcionarios;
        }
}
