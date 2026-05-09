public class Atividade4 {
    public static void main(String[] args) {

        MateriaisDeConstrucaoQ4 loja = new MateriaisDeConstrucaoQ4();

        ProdutoQ4 p1 = new ProdutoQ4("Votoran", "Cimento CP2", 35.0, 10);
        ProdutoQ4 p2 = new ProdutoQ4("Tramontina", "Pá", 50.0, 5);
        ProdutoQ4 p3 = new ProdutoQ4("Tigre", "Cano PVC", 25.0, 20);

        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p3);

        // Teste venda
        p1.vender(3);

        // Mostrar todos
        System.out.println("Lista completa:");
        for(ProdutoQ4 p : loja.obterLista()){
            System.out.println(p);
        }

        // Filtrar por preço
        System.out.println("\nProdutos acima de 30:");
        for(ProdutoQ4 p : loja.obterPrecoMaior(30)){
            System.out.println(p);
        }
    }
}