import java.util.ArrayList;
import java.util.List;

public class Q9Familia {

    private List<Q9Pessoa> listaPessoas;

    public Q9Familia() {
        listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Q9Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    public Q9Pessoa encontrarPessoaMaisVelha() {

        Q9Pessoa maisVelha = null;

        for (Q9Pessoa p : listaPessoas) {

            if (maisVelha == null ||
                    p.getIdade() > maisVelha.getIdade()) {

                maisVelha = p;
            }
        }

        return maisVelha;
    }
}
