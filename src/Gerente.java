public class Gerente extends Usuario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
        this.administrador = true;
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatório financeiro gerado.");
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas como gerente...");
    }
}
