package Entidades;

import Entidades.Enum.OrderStatus;

public class OrderItem {

    private Integer quantidade;
    private Double preco;
    private Produto produto;

    public OrderItem(){

    }

    public OrderItem (Integer quantidade,Double preco,Produto produto){
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }
    public OrderItem (Integer quantidade){
        this.quantidade = quantidade;
    }

    public Double getPreco(){
        return preco;
    }

    public void setPrice(Double preco){
        this.preco = preco;
    }


    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double subTotal() {
        return this.quantidade * this.preco;
    }

    public String toString() {
        return produto.getNome()
                + ", $"
                + String.format("%.2f", preco)
                + ", Quantidade: "
                + quantidade +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
