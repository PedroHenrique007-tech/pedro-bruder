public class Ex4 {

    public static void main(String[] args) {

        Q4Produto p1 = new Q4Produto("Vonder", "Martelo", 50, 10);
        Q4Produto p2 = new Q4Produto("Bosch", "Regua", 20, 10);
        Q4Produto p3 = new Q4Produto("3M", "Trena", 30, 10);
        Q4Produto p4 = new Q4Produto("Makita", "Capacete", 80, 10);
        Q4Produto p5 = new Q4Produto("Vonder", "Nível", 20, 10);

        Q4MateriaisConstrucao m1 = new Q4MateriaisConstrucao();

        m1.adicionarProduto(p1);
        m1.adicionarProduto(p2);
        m1.adicionarProduto(p3);
        m1.adicionarProduto(p4);
        m1.adicionarProduto(p5);

        System.out.println(m1.obterProdutoMaisCaroMarca("Vonder"));

        System.out.println(m1.produtosMarcaEPreco("Vonder", 10, 40));

    }

}