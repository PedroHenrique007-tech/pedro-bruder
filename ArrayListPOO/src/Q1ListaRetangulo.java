import java.util.ArrayList;

public class Q1ListaRetangulo {

    private ArrayList<Q1Retangulo> lista;

    public Q1ListaRetangulo(){
        lista = new ArrayList<>();
    }

    public void add(Q1Retangulo r){
        lista.add(r);
    }

    public void mostrarTodos(){
        for (Q1Retangulo r : lista){
            System.out.println(r);
        }
    }

    public Q1Retangulo maiorArea(){

        if (lista.isEmpty()) {
            throw new IllegalStateException("Lista vazia");
        }

        Q1Retangulo maior = lista.get(0);

        for (Q1Retangulo r : lista){
            if (r.calcularArea() > maior.calcularArea()){
                maior = r;
            }
        }
        return maior;
    }
}