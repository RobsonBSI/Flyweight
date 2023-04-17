public class Endereco {
    private String logradouro;
    private String bairro;

    public Endereco(String logradouro, String bairro) {
        this.logradouro = logradouro;
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }
}
