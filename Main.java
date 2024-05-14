public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Fulano", "123.456.789-10");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa ABC", "12.345.678/0001-90");

        pessoaFisica.imprimirDetalhes();
        pessoaJuridica.imprimirDetalhes();
    }
}