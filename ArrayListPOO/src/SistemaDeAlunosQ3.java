import java.util.ArrayList;
import java.util.List;

public class SistemaDeAlunosQ3 {

    private List<AlunoQ3> listaAlunos;

    public SistemaDeAlunosQ3(){
        listaAlunos = new ArrayList<AlunoQ3>();
    }

    public List<AlunoQ3> obterAlunos(String curso, int idade, double media){

        List<AlunoQ3> listaPesquisaAlunos = new ArrayList<AlunoQ3>();
        for(AlunoQ3 a : listaAlunos){
            if(a.getCurso().equalsIgnoreCase(curso) && a.getIdade() >= idade && a.getMedia() >= media){
                listaPesquisaAlunos.add(a);
            }
        }

        return listaPesquisaAlunos;
    }
    public AlunoQ3 obterAluno(String matricula){
        for (AlunoQ3 a : listaAlunos){
            if(a.getMatricula().equals(matricula)){
                return a;
            }
        }
        return null;
    }

    public void adicionarAluno(AlunoQ3 a){
        listaAlunos.add(a);
    }
    public List<AlunoQ3> obterListaAlunos() {
        return listaAlunos;
    }
}
