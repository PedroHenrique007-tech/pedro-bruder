
    public class Q4Produto {

        private String marca;
        private String modelo;
        private double preco;
        private int quantidadeEstoque;

        public Q4Produto(String marca, String modelo, double preco, int quantidadeEstoque) {
            this.marca = marca;
            this.modelo = modelo;
            this.preco = preco;
            this.quantidadeEstoque = quantidadeEstoque;
        }

        public void adicionarEstoque(int quantidade) {

            if (quantidade <= 0) {
                System.out.println("Quantidade inválida.");
            } else {
                quantidadeEstoque += quantidade;
                System.out.println("Estoque atualizado.");
            }
        }

        public void venderProduto(int quantidade) {

            if (quantidade <= 0) {
                System.out.println("Quantidade inválida.");
            } else if (quantidade > quantidadeEstoque) {
                System.out.println("Estoque insuficiente.");
            } else {
                quantidadeEstoque -= quantidade;
                System.out.println("Venda realizada com sucesso.");
            }
        }

        public String getMarca() {
            return marca;
        }

        public double getPreco() {
            return preco;
        }

        @Override
        public String toString() {
            return "Marca: " + marca +
                    ", Modelo: " + modelo +
                    ", Preço: " + preco +
                    ", Estoque: " + quantidadeEstoque;
        }
    }

