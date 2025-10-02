import java.time.LocalDate;

public class Pedido {
    private int numero;
    private LocalDate data;
    private double valorTotal;
    private Cliente cliente;
    private Vendedor vendedor;

    public Pedido(int numero, double valorTotal, Cliente cliente, Vendedor vendedor) {
        this.numero = numero;
        this.data = LocalDate.now();
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.vendedor = vendedor;

        cliente.adicionarPedido(this);
        vendedor.emitirPedido(this);
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
}
