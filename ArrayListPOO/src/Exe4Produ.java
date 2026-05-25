import java.util.List;
    public class Exe4Produ {
        public static void main(String[] args) {


            Produtos m1 = new Produtos("Votorantim", "Cimento CP-II 50kg", 38.90, 100);
            Produtos m2 = new Produtos("Votorantim", "Argamassa AC-III", 25.50, 200);
            Produtos m3 = new Produtos("Tigre", "Tubo PVC 100mm 6m", 95.00, 40);
            Produtos m4 = new Produtos("Tigre", "Joelho 90 graus 40mm", 4.50, 150);
            Produtos m5 = new Produtos("Gerdau", "Vergalhão CA-50 10mm", 115.00, 60);
            Produtos m6 = new Produtos("Gerdau", "Prego com Cabeça 1kg", 18.00, 80);

            Materiais loja = new Materiais();
            loja.addProduto(m1);
            loja.addProduto(m2);
            loja.addProduto(m3);
            loja.addProduto(m4);
            loja.addProduto(m5);
            loja.addProduto(m6);


            System.out.println("PRODUTO MAIS CARO (GERDAU)");
            Produtos caro = loja.buscarMaiorPreco("Gerdau");
            System.out.println(caro);

            System.out.println("\nPRODUTOS VOTORANTIM (R$ 20 - R$ 40)");
            System.out.println(loja.filtroPreco("Votorantim", 20.0, 40.0));

            System.out.println("\n OPERAÇÃO DE VENDA");
            if (caro.vender(10)) {
                System.out.println("Venda de 10 unidades realizada com sucesso.");
                System.out.println("Novo status: " + caro);
            }

            System.out.println("\n REPOSIÇÃO DE ESTOQUE");
            System.out.println("Cimento Atual: " + m1.getQuantidadeEstoque() + " unidades.");
            m1.addEstoque(50);
            System.out.println("Cimento Adicionado: " + m1.getQuantidadeEstoque() + " unidades.");
            System.out.println("Ficha completa: " + m1);

        }
    }


