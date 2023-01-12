package main;

public class PedidoEstadoFeito implements PedidoEstado {

    private PedidoEstadoFeito() {
    };

    private static PedidoEstadoFeito instance = new PedidoEstadoFeito();

    public static PedidoEstadoFeito getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido Feito";
    }

}
