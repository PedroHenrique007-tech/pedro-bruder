public class A10 {
    public static void main(String[] args) {

        Q10Pais brasil = new Q10Pais("Brasil");
        Q10Pais argentina = new Q10Pais("Argentina");
        Q10Pais paraguai = new Q10Pais("Paraguai");

        brasil.adicionarPaisDeFronteira(argentina);
        brasil.adicionarPaisDeFronteira(paraguai);

        System.out.println(
                brasil.fazFronteira(argentina));

        System.out.println(
                brasil.obterFronteirasIguais(argentina));
    }
}
