package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import main.*;

public class PedidoTest {

    ArrayList<Produto> produtos = new ArrayList<Produto>();
    @BeforeAll
    void setUp(){
        Produto geladeira = new Produto("001", "geladeira");
        Produto fogao = new Produto("002", "fogao");

        produtos.add(geladeira);
        produtos.add(fogao);
    }

    @Test
    public void deveArmazenarEstados(){
        Pedido pedido = new Pedido(produtos);

        pedido.setEstado(PedidoEstadoFeito.getInstance());
        pedido.setEstado(PedidoEstadoPago.getInstance());
        
        assertEquals(2, pedido.getEstados().size());
    }

    @Test
    public void deveRetornarEstadoInicial(){
        Pedido pedido = new Pedido(produtos);

        pedido.setEstado(PedidoEstadoFeito.getInstance());
        pedido.setEstado(PedidoEstadoPago.getInstance());
        pedido.setEstado(PedidoEstadoNegado.getInstance());
        pedido.setEstado(PedidoEstadoPago.getInstance());

        pedido.restauraEstado(0);
        
        assertEquals(PedidoEstadoFeito.getInstance(), pedido.getEstado());
    }
    
    @Test
    public void deveRetornarEstadoAnterior(){
        Pedido pedido = new Pedido(produtos);

        pedido.setEstado(PedidoEstadoFeito.getInstance());
        pedido.setEstado(PedidoEstadoPago.getInstance());
        pedido.setEstado(PedidoEstadoNegado.getInstance());
        pedido.setEstado(PedidoEstadoPago.getInstance());

        pedido.restauraEstado(2);
        
        assertEquals(PedidoEstadoNegado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveRetornarExcecaoIndiceInvalido() {
        try {
            Pedido pedido = new Pedido(produtos);
            pedido.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
    
}
