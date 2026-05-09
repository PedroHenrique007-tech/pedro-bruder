import java.util.ArrayList;

public class ListaFloriculturaQ2 {

    private ArrayList<FloriculturaQ2> lista;

    public ListaFloriculturaQ2(){
        lista = new ArrayList<>();
    }

    public void add(FloriculturaQ2 f){
        lista.add(f);
    }

    public void mostrarTodos(){
        for(FloriculturaQ2 f : lista){
            System.out.println(f);
        }
    }

    public ArrayList<FloriculturaQ2> buscarPorCliente(String nomeCliente){

        if(nomeCliente == null || nomeCliente.isEmpty()){
            throw new IllegalArgumentException("Nome do cliente inválido");
        }

        ArrayList<FloriculturaQ2> resultado = new ArrayList<>();

        for(FloriculturaQ2 f : lista){
            if(f.getCliente().equalsIgnoreCase(nomeCliente)){
                resultado.add(f);
            }
        }

        return resultado;
    }
}