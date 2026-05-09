import java.util.ArrayList;
import java.util.List;

public class Q3SistemaDeAlunos {

    private List<Q3Aluno> listaAlunos;

    public Q3SistemaDeAlunos(){
        listaAlunos = new ArrayList<Q3Aluno>();
    }

    public List<Q3Aluno> obterAlunos(String curso, int idade, double media){

        List<Q3Aluno> listaPesquisaAlunos = new ArrayList<Q3Aluno>();
        for(Q3Aluno a : listaAlunos){
            if(a.getCurso().equalsIgnoreCase(curso) && a.getIdade() >= idade && a.getMedia() >= media){
                listaPesquisaAlunos.add(a);
            }
        }

        return listaPesquisaAlunos;
    }
    public Q3Aluno obterAluno(String matricula){
        for (Q3Aluno a : listaAlunos){
            if(a.getMatricula().equals(matricula)){
                return a;
            }
        }
        return null;
    }

    public void adicionarAluno(Q3Aluno a){
        listaAlunos.add(a);
    }
    public List<Q3Aluno> obterListaAlunos() {
        return listaAlunos;
    }
}
