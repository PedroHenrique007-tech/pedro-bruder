public class Atividade4 {
    public static void main(String[] args) {

        MateriaisDeConstrucao loja = new MateriaisDeConstrucao();

        Produto p1 = new Produto("Votoran", "Cimento CP2", 35.0, 10);
        Produto p2 = new Produto("Tramontina", "Pá", 50.0, 5);
        Produto p3 = new Produto("Tigre", "Cano PVC", 25.0, 20);

        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p3);

        // Teste venda
        p1.vender(3);

        // Mostrar todos
        System.out.println("Lista completa:");
        for(Produto p : loja.obterLista()){
            System.out.println(p);
        }

        // Filtrar por preço
        System.out.println("\nProdutos acima de 30:");
        for(Produto p : loja.obterPrecoMaior(30)){
            System.out.println(p);
        }
    }
}