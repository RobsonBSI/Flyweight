public class Cliente {
    private String nome;
    private Endereco endereco;
    public Cliente(String nomeCliente, Endereco endereco) {
        this.nome= nomeCliente;
        this.endereco=endereco;
    }

    public String obterCliente() {
        return "Cliente{" +
                "nome='" + this.nome + '\'' +
                ", logradouro='" + endereco.getLogradouro() + '\'' +
                ", bairro='" + endereco.getBairro() + '\'' +
                '}';
    }
}
