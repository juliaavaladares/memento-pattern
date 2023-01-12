package main;

public class PedidoEstadoEnviado implements PedidoEstado {
    private PedidoEstadoEnviado() {
    };

    private static PedidoEstadoEnviado instance = new PedidoEstadoEnviado();

    public static PedidoEstadoEnviado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido Enviado";
    }

}
