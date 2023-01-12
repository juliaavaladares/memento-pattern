package main;

public class PedidoEstadoNegado implements PedidoEstado {
    private PedidoEstadoNegado() {
    };

    private static PedidoEstadoNegado instance = new PedidoEstadoNegado();

    public static PedidoEstadoNegado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pagamento do pedido negado";
    }

}
