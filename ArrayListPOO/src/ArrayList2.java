import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

    private List<Floricultura> ListFloricultura;

    public ArrayList2(){
        ListFloricultura = new ArrayList<>();
    }

    public void adicionarFloricultura(Floricultura f){
        ListFloricultura.add(f);
    }

    public List<Floricultura> obterLista(){
        return ListFloricultura;
    }

    public List<Floricultura> obterFloresPorCliente(String nomeCliente){
        List<Floricultura> resultado = new ArrayList<>();

        for(Floricultura f : ListFloricultura){
            if(f.getCliente().equalsIgnoreCase(nomeCliente)){
                resultado.add(f);
            }
        }

        return resultado;
    }
}