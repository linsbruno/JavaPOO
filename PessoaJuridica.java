public class PessoaJuridica extends Pessoa {
    private final String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome + ", CNPJ: " + cnpj);
    }
}