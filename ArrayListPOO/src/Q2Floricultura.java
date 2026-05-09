public class Q2Floricultura {

    private String nomeFlor;
    private double precoFlor;
    private String nomeCliente;

    public Q2Floricultura(String nomeFlor, double precoFlor, String nomeCliente) {
        setNomeFlor(nomeFlor);
        setPrecoFlor(precoFlor);
        setNomeCliente(nomeCliente);
    }

    public String getNomeFlor() {
        return nomeFlor;
    }

    public void setNomeFlor(String nomeFlor) {

        if (nomeFlor == null || nomeFlor.isBlank()) {
            throw new IllegalArgumentException("Nome da flor inválido");
        }

        this.nomeFlor = nomeFlor;
    }

    public double getPrecoFlor() {
        return precoFlor;
    }

    public void setPrecoFlor(double precoFlor) {

        if (precoFlor <= 0) {
            throw new IllegalArgumentException("Preço inválido");
        }

        this.precoFlor = precoFlor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {

        if (nomeCliente == null || nomeCliente.isBlank()) {
            throw new IllegalArgumentException("Nome do cliente inválido");
        }

        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Flor: " + nomeFlor +
                " | Preço: R$ " + precoFlor +
                " | Cliente: " + nomeCliente;
    }
}