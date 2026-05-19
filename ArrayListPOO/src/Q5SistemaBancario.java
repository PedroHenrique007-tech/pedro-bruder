import java.util.ArrayList;
import java.util.List;

public class Q5SistemaBancario {

private List<Q5Conta> listaContas;

public Q5SistemaBancario(){
 listaContas = new ArrayList<>();
}
public void adicionarConta(Q5Conta conta){
    listaContas.add(conta);
}
public List<Q5Conta> obterLista(){
    return listaContas;
}
public List<Q5Conta> obterSaldoMaior(double saldoMinimo){
    List<Q5Conta> resultado = new ArrayList<>();
    for (Q5Conta c: listaContas){
        if(c.getSaldo() > saldoMinimo){
            resultado.add(c);
        }
    }
    return resultado;
}
}