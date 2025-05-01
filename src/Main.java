public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alice", "alice@empresa.com", "admin123");
        Vendedor vendedor = new Vendedor("Bruno", "bruno@empresa.com", "venda123");
        Atendente atendente = new Atendente("Carla", "carla@empresa.com", "atende123");

        gerente.realizarLogin("admin123");
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();
        gerente.realizarLogoff();

        vendedor.realizarLogin("venda123");
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        vendedor.alterarSenha("venda123", "novaSenha");
        vendedor.realizarLogoff();

        atendente.realizarLogin("atende123");
        atendente.receberPagamento(150.50);
        atendente.fecharCaixa();
        atendente.realizarLogoff();
    }
}
