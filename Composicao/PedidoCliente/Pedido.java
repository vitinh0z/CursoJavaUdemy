package Composicao.PedidoCliente;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    
    private LocalTime moment;
    private StatusPedido status;

    private ItensPedido pedido;

    private Produto produto;

    private LocalTime hours;

    private List<ItensPedido> itensPedidos = new ArrayList<>();

    public Pedido(LocalTime moment, StatusPedido status, Produto produto) {
        this.moment = moment;
        this.status = status;
        this.produto = produto;
    }

    public ItensPedido getPedido() {
        return pedido;
    }



    public void setPedido(ItensPedido pedido) {
        this.pedido = pedido;
    }


    
    

    public LocalTime getMoment() {
        return moment;
    }


    public void setMoment(LocalTime moment) {
        this.moment = moment;
    }


    public StatusPedido getStatus() {
        return status;
    }


    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    

    public Produto getProduto() {
        return produto;
    }
    


    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    public void addItem (Produto produto){
        itensPedidos.add(pedido);
    }
    

    public double totalValue (){
        double soma = 0;

        for (ItensPedido itensPedido : itensPedidos) {
            System.out.println(itensPedido);
        }
    return soma;

    }


    public String toString (){

        StringBuilder sb = new StringBuilder();
        sb.append(moment + "\n");
        sb.append(status + "\n");
        for (ItensPedido itensPedido : itensPedidos) {
            sb.append(itensPedido.getQuantity());
            sb.append(itensPedido.getPrice());
            sb.append(itensPedido.getProduto());
        }

        return sb.toString();







    }
    
    
    


}
