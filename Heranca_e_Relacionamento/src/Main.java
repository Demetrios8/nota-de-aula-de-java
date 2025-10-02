public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistema Hospitalar ---");

        ClinicoGeral drHouse = new ClinicoGeral("Dr. Gregory House", "CRM/SP 12345");
        Cirurgiao drGrey = new Cirurgiao("Dr. Meredith Grey", "CRM/RJ 67890", "Neurocirurgia");

        System.out.println(drHouse);
        System.out.println("Ação: " + drHouse.examinarPaciente());
        System.out.println("Ação: " + drHouse.prescreverTratamentoGeral());
        System.out.println(); // Linha em branco para separar

        System.out.println(drGrey);
        System.out.println("Ação: " + drGrey.examinarPaciente());
        System.out.println("Ação: " + drGrey.realizarCirurgia());

        System.out.println("\n--------------------------------\n");

        System.out.println("--- Sistema de Vendas ---");

        Cliente clienteJoao = new Cliente("João da Silva", "111.222.333-44");
        Vendedor vendedorCarlos = new Vendedor("Carlos Andrade", "MAT-9876");

        Pedido pedido1 = new Pedido(101, 150.75, clienteJoao, vendedorCarlos);
        Pedido pedido2 = new Pedido(102, 99.90, clienteJoao, vendedorCarlos);

        System.out.println("Cliente: " + clienteJoao.getNome());
        System.out.println("CPF: " + clienteJoao.getCpf());
        System.out.println("Total de pedidos do cliente: " + clienteJoao.getPedidos().size());
        System.out.println();

        System.out.println("Vendedor: " + vendedorCarlos.getNome());
        System.out.println("Matrícula: " + vendedorCarlos.getMatricula());
        System.out.println("Total de pedidos emitidos pelo vendedor: " + vendedorCarlos.getPedidosEmitidos().size());
        System.out.println();

        System.out.println("Detalhes do Pedido Nº " + pedido1.getNumero());
        System.out.println("Data: " + pedido1.getData());
        System.out.println("Valor: R$ " + pedido1.getValorTotal());
        System.out.println("Emitido para: " + pedido1.getCliente().getNome());
        System.out.println("Emitido por: " + pedido1.getVendedor().getNome());

    }
}