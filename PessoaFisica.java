public class PessoaFisica extends Pessoa {
    private final String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome + ", CPF: " + cpf);
    }
}

