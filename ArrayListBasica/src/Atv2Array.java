import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Atv2Array {
    public static void main(String[] args) {
        List<String> ListaElementos = new ArrayList<>();
        ListaElementos.add("Agua");
        ListaElementos.add("Fogo");
        ListaElementos.add("Terra");
        ListaElementos.add("Ar");
        ListaElementos.add("Relampago");
        Collections.reverse(ListaElementos);
        System.out.println(ListaElementos);
    }
}
