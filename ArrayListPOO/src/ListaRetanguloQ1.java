import java.util.ArrayList;

public class ListaRetanguloQ1 {

    private ArrayList<RetanguloQ1> lista;

    public ListaRetanguloQ1(){
        lista = new ArrayList<>();
    }

    public void add(RetanguloQ1 r){
        lista.add(r);
    }

    public void mostrarTodos(){
        for (RetanguloQ1 r : lista){
            System.out.println(r);
        }
    }

    public RetanguloQ1 maiorArea(){

        if (lista.isEmpty()) {
            throw new IllegalStateException("Lista vazia");
        }

        RetanguloQ1 maior = lista.get(0);

        for (RetanguloQ1 r : lista){
            if (r.calcularArea() > maior.calcularArea()){
                maior = r;
            }
        }
        return maior;
    }
}