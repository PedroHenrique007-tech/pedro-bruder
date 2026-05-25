
    public class Produtos {
        private String Marca;
        private String Modelo;
        private double Preco;
        private int quantidadeEstoque;

        @Override
        public String toString() {
            return String.format("PRODUTO [%s] | Marca: %s | Preço: R$ %.2f | Estoque: %d unidades",
                    Modelo, Marca, Preco, quantidadeEstoque);
        }

        public Produtos(String marca, String modelo, double preco, int quantidadeEstoque) {
            setMarca(marca);
            setModelo(modelo);
            setPreco(preco);
            setQuantidadeEstoque(quantidadeEstoque);
        }

        public void addEstoque(int quantidade) {
            if (quantidade > 0) {
                this.quantidadeEstoque += quantidade;
            }
        }

        public boolean vender(int quantidade) {
            if (quantidade > 0 && quantidade <= this.quantidadeEstoque) {
                this.quantidadeEstoque -= quantidade;
                return true;
            }
            return false;
        }

        public String getMarca() { return Marca; }
        public String getModelo() { return Modelo; }
        public double getPreco() { return Preco; }
        public int getQuantidadeEstoque() { return quantidadeEstoque; }

        public void setMarca(String marca) {
            if (marca == null || marca.isBlank()){
                throw new IllegalArgumentException("Marca Invalida");
            }else{
                Marca = marca;
            }

        }
        public void setModelo(String modelo) {
            if (modelo == null || modelo.isBlank()){
                throw new IllegalArgumentException("Modelo Invalida");
            }else{
                Modelo = modelo;
            }

        }
        public void setPreco(double preco) {
            if (preco <= 0){
                throw new IllegalArgumentException("Preço invalido");
            }else{
                Preco = preco;
            }
        }
        public void setQuantidadeEstoque(int quantidadeEstoque) {
            if (quantidadeEstoque < 0){
                throw new IllegalArgumentException("Quantidae invalido");
            }else{
                this.quantidadeEstoque = quantidadeEstoque;
            }

        }
    }

