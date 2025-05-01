public class Atendente extends Usuario {
    private double valorCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha);
        this.administrador = false;
        this.valorCaixa = 0.0;
    }

    public void receberPagamento(double valor) {
        valorCaixa += valor;
        System.out.println("Pagamento recebido: R$" + valor + ". Total no caixa: R$" + valorCaixa);
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado. Valor final: R$" + valorCaixa);
        valorCaixa = 0.0;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }
}
