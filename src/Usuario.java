public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean administrador;
    protected boolean logado;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.logado = false;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public boolean isLogado() {
        return logado;
    }

    // Métodos comuns
    public void realizarLogin(String senha) {
        if (this.senha.equals(senha)) {
            this.logado = true;
            System.out.println(nome + " logado com sucesso.");
        } else {
            System.out.println("Senha incorreta.");
        }
    }

    public void realizarLogoff() {
        this.logado = false;
        System.out.println(nome + " fez logoff.");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("Dados atualizados com sucesso.");
    }

    public void alterarSenha(String senhaAtual, String novaSenha) {
        if (this.senha.equals(senhaAtual)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso.");
        } else {
            System.out.println("Senha atual incorreta.");
        }
    }
}
