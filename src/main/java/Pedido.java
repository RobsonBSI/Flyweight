import java.util.List;

import java.util.ArrayList;
public class Pedido {
    private List<Cliente> clientePedido = new ArrayList<>();

    public void CadastrarPedido(String nomeCliente, String logradouro, String bairro) {
        Endereco endereco = EnderecoFactory.getEndereco(logradouro,bairro);
        Cliente cliente = new Cliente(nomeCliente, endereco);
        clientePedido.add(cliente);
    }

    public List<String> obterClientes() {
        List<String> saida = new ArrayList<String>();
        for (Cliente cliente : this.clientePedido) {
            saida.add(cliente.obterCliente());
        }
        return saida;
    }

}
