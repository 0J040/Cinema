public class CinemaApp {
    public static void main(String[] args) {
        Ingresso ingressoComum = new Ingresso(20.0, "Matrix", true);
        MeiaEntrada meia = new MeiaEntrada(20.0, "Matrix", false);
        IngressoFamilia familia = new IngressoFamilia(20.0, "Matrix", true, 4);

        System.out.println(ingressoComum.getDescricao() + " | Valor: R$" + ingressoComum.getValorReal());
        System.out.println(meia.getDescricao() + " | Valor: R$" + meia.getValorReal());
        System.out.println(familia.getDescricao() + " | Valor: R$" + familia.getValorReal());
    }
}
