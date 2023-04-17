import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

class PedidoTest {
    @Test
    void deveRetornarAlunos() {
        Pedido pedido = new Pedido();
        pedido.CadastrarPedido("Gustavo", "Rua A n° 12", "Centro");
        pedido.CadastrarPedido("Francisca", "Rua A n° 12", "Centro");
        pedido.CadastrarPedido("Robson", "Rua B n° 112", "Manoel Honorio");
        pedido.CadastrarPedido("Julieta", "Rua C n° 212", "Linhares");

        List<String> saida = Arrays.asList(
                "Cliente{nome='Gustavo', logradouro='Rua A n° 12', bairro='Centro'}",
                "Cliente{nome='Francisca', logradouro='Rua A n° 12', bairro='Centro'}",
                "Cliente{nome='Robson', logradouro='Rua B n° 112', bairro='Manoel Honorio'}",
                "Cliente{nome='Julieta', logradouro='Rua C n° 212', bairro='Linhares'}");

        assertEquals(saida, pedido.obterClientes());
    }
}