import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Vendedor {
    private String nome;
    private String matricula;
    private List<Pedido> pedidosEmitidos;

    public Vendedor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.pedidosEmitidos = new ArrayList<>();
    }

    public void emitirPedido(Pedido pedido) {
        this.pedidosEmitidos.add(pedido);
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public List<Pedido> getPedidosEmitidos() {
        return Collections.unmodifiableList(pedidosEmitidos);
    }
}
