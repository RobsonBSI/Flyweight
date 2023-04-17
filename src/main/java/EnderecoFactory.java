
import java.util.HashMap;
import java.util.Map;
public class EnderecoFactory {
    private static Map<String, Endereco> enderecos = new HashMap<>();

    public static Endereco getEndereco(String logradouro, String bairro) {
        Endereco endereco = enderecos.get(logradouro);
        if ( endereco == null) {
            endereco = new Endereco(logradouro, bairro);
            enderecos.put(logradouro,endereco);
        }
        return endereco;
    }

    public static int getTotalEndereco() {
        return enderecos.size();
    }

}
