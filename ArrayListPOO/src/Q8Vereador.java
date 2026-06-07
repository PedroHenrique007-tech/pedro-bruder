public class Q8Vereador {
    private String nome;
    private String partido;
    private int projetosApresentados;
    private int projetosAprovados;

    public Q8Vereador(String nome, String partido,
                      int projetosApresentados,
                      int projetosAprovados) {

        this.nome = nome;
        this.partido = partido;
        this.projetosApresentados = projetosApresentados;
        this.projetosAprovados = projetosAprovados;
    }

    public double obterPorcentagemAprovacao() {

        if (projetosApresentados == 0) {
            return 0;
        }

        return ((double) projetosAprovados / projetosApresentados) * 100;
    }

    public double obterIndiceTrabalho() {

        if (projetosApresentados >= 1 && projetosApresentados <= 5) {
            return 0.80;
        } else if (projetosApresentados <= 10) {
            return 1.00;
        } else if (projetosApresentados <= 17) {
            return 1.08;
        } else {
            return 1.22;
        }
    }

    public double obterDesempenho() {

        if (projetosApresentados == 0) {
            return 0;
        }

        return ((double) projetosAprovados / projetosApresentados)
                * obterIndiceTrabalho();
    }

    public String getPartido() {
        return partido;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Partido: " + partido +
                ", Desempenho: " + obterDesempenho();
    }
}
