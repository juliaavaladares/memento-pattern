package main;

public class PedidoEstadoEntregue implements PedidoEstado {
    private PedidoEstadoEntregue() {
    };

    private static PedidoEstadoEntregue instance = new PedidoEstadoEntregue();

    public static PedidoEstadoEntregue getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido Entregue";
    }
}
