
    public class A4 {

        public static void main(String[] args) {

            Q4MateriaisConstrucao loja = new Q4MateriaisConstrucao();

            Q4Produto p1 = new Q4Produto("Votoran", "Cimento CP2", 40, 50);
            Q4Produto p2 = new Q4Produto("Votoran", "Cimento CP3", 45, 30);
            Q4Produto p3 = new Q4Produto("Tigre", "Cano PVC", 25, 100);

            loja.adicionarProduto(p1);
            loja.adicionarProduto(p2);
            loja.adicionarProduto(p3);

            p1.adicionarEstoque(20);

            p3.venderProduto(10);

            System.out.println("\nProduto mais caro da marca Votoran:");
            System.out.println(loja.obterMaisCaro("Votoran"));

            System.out.println("\nProdutos entre 30 e 50:");

            for (Q4Produto p : loja.obterPorFaixaDePreco("Votoran", 30, 50)) {
                System.out.println(p);
            }
        }
    }

