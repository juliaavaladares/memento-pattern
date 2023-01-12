package main;

public class PedidoEstadoConfirmado implements PedidoEstado {

    private PedidoEstadoConfirmado() {
    };

    private static PedidoEstadoConfirmado instance = new PedidoEstadoConfirmado();

    public static PedidoEstadoConfirmado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido Confirmado";
    }

}
