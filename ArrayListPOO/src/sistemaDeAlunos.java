import java.util.ArrayList;
import java.util.List;

public class sistemaDeAlunos {

    private List<aluno> listaAlunos;

    public sistemaDeAlunos(){
        listaAlunos = new ArrayList<aluno>();
    }

    public List<aluno> obterAlunos(String curso, int idade, double media){

        List<aluno> listaPesquisaAlunos = new ArrayList<aluno>();
        for(aluno a : listaAlunos){
            if(a.getCurso().equalsIgnoreCase(curso) && a.getIdade() >= idade && a.getMedia() >= media){
                listaPesquisaAlunos.add(a);
            }
        }

        return listaPesquisaAlunos;
    }
    public aluno obterAluno(String matricula){
        for (aluno a : listaAlunos){
            if(a.getMatricula().equals(matricula)){
                return a;
            }
        }
        return null;
    }

    public void adicionarAluno(aluno a){
        listaAlunos.add(a);
    }
    public List<aluno> obterListaAlunos() {
        return listaAlunos;
    }
}
