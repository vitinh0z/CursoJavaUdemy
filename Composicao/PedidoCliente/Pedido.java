package Composicao.PedidoCliente;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    
    // Formatter para a data no toString
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private StatusPedido status;
    
    // COMPOSIÇÃO: Pedido TEM-UM Cliente
    private Cliente cliente;
    
    // COMPOSIÇÃO: Pedido TEM-VÁRIOS ItensPedido
    private List<ItensPedido> itens = new ArrayList<>();

    public Pedido(Date moment, StatusPedido status, Cliente cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }
    
   
    public void addItem(ItensPedido item) {
        itens.add(item);
    }

    public void removeItem(ItensPedido item) {
        itens.remove(item);
    }
    
   
    public double total() {
        double soma = 0.0;
        for (ItensPedido item : itens) {
            soma += item.subTotal(); 
        }
        return soma;
    }

    // Getters e Setters
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItensPedido> getItens() {
        return itens;
    }
    
   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RESUMO DO PEDIDO:\n");
        sb.append("Momento do Pedido: " + sdf.format(moment) + "\n");
        sb.append("Status do Pedido: " + status + "\n");
        sb.append("Cliente: " + cliente.getName() + " (" + cliente.getEmail() + ")\n");
        sb.append("Itens do Pedido:\n");
        
        for (ItensPedido item : itens) {
            sb.append(item.getProduto().getNome() + ", ");
            sb.append("Preço: R$ " + String.format("%.2f", item.getPrice()) + ", ");
            sb.append("Quantidade: " + item.getQuantity() + ", ");
            sb.append("Subtotal: R$ " + String.format("%.2f", item.subTotal()) + "\n");
        }
        
        sb.append("Valor Total do Pedido: R$ " + String.format("%.2f", total()));
        return sb.toString();
    }
}