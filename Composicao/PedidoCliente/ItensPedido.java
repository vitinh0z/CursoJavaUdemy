package Composicao.PedidoCliente;

import java.util.ArrayList;
import java.util.List;

class ItensPedido {

    private Integer quantity;
    private double price;
    
    private Produto produto;
   

    public ItensPedido (){

    }



    public ItensPedido(Integer quantity, double price, Produto produto) {
        this.quantity = quantity;
        this.price = price;
        this.produto = produto;
    }



    public Integer getQuantity() {
        return quantity;
    }



    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }



    public double getPrice() {
        return price;
    }



    public void setPrice(double price) {
        this.price = price;
    }



    public Produto getProduto() {
        return produto;
    }



    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double subTotal (){
        return price * quantity;
    }

    
    

    






}