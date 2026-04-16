public class InteiroPositivo {
    private int n;

    public InteiroPositivo(int n) {
        setValor(n);
    }

    // a) Método setValor com consistência para garantir inteiro positivo
    public void setValor(int n) {
        if (n >= 1) {
            this.n = n;
        } else {
            throw new IllegalArgumentException("Erro: O valor deve ser um inteiro positivo!");
        }
    }

    public int getValor() {
        return n;
    }

    // b) Método para retornar o número X multiplicado por outro objeto de InteiroPositivo
    public int multiplicar(InteiroPositivo outroN ) {
        return this.n * outroN.getValor();
    }

    // c) Método para calcular o fatorial de X
    public long calcularFatorial() {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // d) Método para identificar os divisores inteiros de X e a quantidade
    public String Divisores() {
        String divisoresLista = "";
        int quantidade = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisoresLista += i + (i == n ? "" : ", ");
                quantidade++;
            }
        }
        return "Divisores: [" + divisoresLista + "] | Quantidade: " + quantidade;
    }

    // e) Método para calcular a série de Fibonacci formada por X elementos
    public String calcularFibonacci() {
        String serie = "";
        int a = 1;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            serie += a + (i < n ? ", " : "");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return serie;
    }

    @Override
    public String toString() {
        return "Número: " + n + "\n" +
                "Fatorial: " + calcularFatorial() + "\n" +
                Divisores() + "\n" +
                "Série Fibonacci: " + calcularFibonacci();
    }
}
