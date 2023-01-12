package main;

public class PedidoEstadoPago implements PedidoEstado {
    private PedidoEstadoPago() {
    };

    private static PedidoEstadoPago instance = new PedidoEstadoPago();

    public static PedidoEstadoPago getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido Feito";
    }


}
