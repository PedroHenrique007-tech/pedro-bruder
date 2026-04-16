public class Atv12 {
    public static void main(String[] args) {
        InteiroPositivo objeto1 = new InteiroPositivo(12);
        InteiroPositivo objeto2 = new InteiroPositivo(5);

        System.out.println("--- Dados do Objeto 1 ---");
        System.out.println(objeto1.toString());

        int resMulti = objeto1.multiplicar(objeto2);

        System.out.println("\n--- Multiplicação ---");
        System.out.println(objeto1.getValor() + " x " + objeto2.getValor() + " = " + resMulti);
    }
}
