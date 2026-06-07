
    import java.time.LocalDate;

    public class Q13Veiculo {

        private String marca;
        private String modelo;
        private double preco;
        private int quantidadeEstoque;
        private LocalDate anoFabricacao;

        public Q13Veiculo(String marca, String modelo, double preco,
                          int quantidadeEstoque, LocalDate anoFabricacao) {

            setMarca(marca);
            setModelo(modelo);
            setPreco(preco);
            setQuantidadeEstoque(quantidadeEstoque);
            setAnoFabricacao(anoFabricacao);
        }

        // Adicionar veículos ao estoque
        public void adicionarEstoque(int quantidade) {

            if (quantidade > 0) {
                quantidadeEstoque += quantidade;
            }
        }

        // Vender veículo
        public boolean venderVeiculo(int quantidade) {

            if (quantidade > 0 && quantidade <= quantidadeEstoque) {

                quantidadeEstoque -= quantidade;
                return true;
            }

            return false;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidadeEstoque() {
            return quantidadeEstoque;
        }

        public LocalDate getAnoFabricacao() {
            return anoFabricacao;
        }

        public void setMarca(String marca) {

            if (marca == null || marca.isBlank()) {
                throw new IllegalArgumentException("Marca inválida");
            }

            this.marca = marca;
        }

        public void setModelo(String modelo) {

            if (modelo == null || modelo.isBlank()) {
                throw new IllegalArgumentException("Modelo inválido");
            }

            this.modelo = modelo;
        }

        public void setPreco(double preco) {

            if (preco <= 0) {
                throw new IllegalArgumentException("Preço inválido");
            }

            this.preco = preco;
        }

        public void setQuantidadeEstoque(int quantidadeEstoque) {

            if (quantidadeEstoque < 0) {
                throw new IllegalArgumentException("Quantidade inválida");
            }

            this.quantidadeEstoque = quantidadeEstoque;
        }

        public void setAnoFabricacao(LocalDate anoFabricacao) {

            if (anoFabricacao == null || anoFabricacao.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Ano inválido");
            }

            this.anoFabricacao = anoFabricacao;
        }

        @Override
        public String toString() {

            return String.format(
                    "VEÍCULO [%s] | Marca: %s | Preço: R$ %.2f | Estoque: %d | Fabricação: %s",
                    modelo,
                    marca,
                    preco,
                    quantidadeEstoque,
                    anoFabricacao
            );
        }
    }

