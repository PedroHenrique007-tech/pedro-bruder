import java.util.ArrayList;
import java.util.List;
public class Q10Pais {

    private String nome;
    private List<Q10Pais> fronteiras;

    public Q10Pais(String nome) {

        this.nome = nome;
        fronteiras = new ArrayList<>();
    }

    public void adicionarPaisDeFronteira(Q10Pais pais) {

        fronteiras.add(pais);
        pais.fronteiras.add(this);
    }

    public boolean fazFronteira(Q10Pais pais) {

        return fronteiras.contains(pais);
    }

    public List<Q10Pais> obterFronteirasIguais(Q10Pais pais) {

        List<Q10Pais> resultado = new ArrayList<>();

        for (Q10Pais p : fronteiras) {

            if (pais.fronteiras.contains(p)) {
                resultado.add(p);
            }
        }

        return resultado;
    }

    @Override
    public String toString() {
        return nome;
    }

}
