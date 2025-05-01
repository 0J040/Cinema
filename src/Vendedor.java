public class Vendedor extends Usuario {
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
        this.administrador = false;
        this.quantidadeVendas = 0;
    }

    public void realizarVenda() {
        quantidadeVendas++;
        System.out.println("Venda realizada. Total de vendas: " + quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("Você realizou " + quantidadeVendas + " vendas.");
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }
}
