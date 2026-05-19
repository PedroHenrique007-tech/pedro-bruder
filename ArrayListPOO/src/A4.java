public class A4 {
    public static void main(String[] args) {

        Q4MateriaisDeConstrucao loja = new Q4MateriaisDeConstrucao();

        Q4Produto p1 = new Q4Produto("Votoran", "Cimento CP2", 35.0, 10);
        Q4Produto p2 = new Q4Produto("Tramontina", "Pá", 50.0, 5);
        Q4Produto p3 = new Q4Produto("Tigre", "Cano PVC", 25.0, 20);

        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p3);

        // Teste venda
        p1.vender(3);

        // Mostrar todos
        System.out.println("Lista completa:");
        for(Q4Produto p : loja.obterLista()){
            System.out.println(p);
        }

        // Filtrar por preço
        System.out.println("\nProdutos acima de 30:");
        for(Q4Produto p : loja.obterPrecoMaior(30)){
            System.out.println(p);
        }
    }
}