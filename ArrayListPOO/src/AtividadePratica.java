public class AtividadePratica {

    public static void main(String[] args) {

        LojaEletronica loja = new LojaEletronica();

        ProdutoEletronico p1 =
                new ProdutoEletronico("Nike", "Sem lingua", 330.00, 10);

        ProdutoEletronico p2 =
                new ProdutoEletronico("Adidas", "Sem cardaço", 293.70, 26);

        ProdutoEletronico p3 =
                new ProdutoEletronico("Hocks", "Com lingua", 540.00, 6);

        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p3);

        p1.setPreco(1200);

        p2.venderProduto(5);

        p3.adicionarProduto(10);

        System.out.println("Todos os produtos:");

        for (ProdutoEletronico p : loja.obterLista()) {
            System.out.println(p);
        }

        System.out.println("\nProdutos acima de 300:");

        for (ProdutoEletronico p : loja.produtosAcimaDoPreco(300)) {
            System.out.println(p);
        }
    }
}