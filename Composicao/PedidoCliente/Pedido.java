package Composicao.PedidoCliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    
    private Date moment;
    private StatusPedido status;

    private Produto produto;

    private List<Produto> produtos = new ArrayList<>();


    public Pedido(Date moment, StatusPedido status, Produto produto) {
        this.moment = moment;
        this.status = status;
        this.produto = produto;
    }


    public Date getMoment() {
        return moment;
    }


    public void setMoment(Date moment) {
        this.moment = moment;
    }


    public StatusPedido getStatus() {
        return status;
    }


    public void setStatus(StatusPedido status) {
        this.status = status;
    }


    public List<Produto> getProdutos() {
        return produtos;
    }

    


    public Produto getProduto() {
        return produto;
    }


    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    public void addItem (Produto produto){
        produtos.add(produto);
    }
    
    public void removeItem (Produto produto){
        produtos.remove(produto);
    }

    public double totalValue (){
        double soma = 0;

        for (Produto produto : produtos) {
            soma += produto.getPrice();
        }
    return soma;

    }
    
    
    


}
