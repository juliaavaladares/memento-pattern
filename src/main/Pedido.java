package main;

import java.util.ArrayList;

public class Pedido {
    private PedidoEstado estado;
    private ArrayList<Produto> produtos; 
    private ArrayList<PedidoEstado> memento = new ArrayList<PedidoEstado>();

    public Pedido(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public ArrayList<PedidoEstado> getEstados() {
        return this.memento;
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

   

}