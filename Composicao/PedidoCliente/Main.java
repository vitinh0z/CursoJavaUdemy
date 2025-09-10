package Composicao.PedidoCliente;

import java.text.ParseException;
import java.util.Date; // Usaremos Date aqui
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner read = new Scanner(System.in);
        
        // DADOS DO CLIENTE:
        System.out.println("Entre com os dados do cliente:");
        System.out.print("Nome: ");
        String name = read.nextLine();

        System.out.print("Email: ");
        String email = read.nextLine();

        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
        String birthDate = read.nextLine();

        // Cria o objeto Cliente:
        Cliente cliente = new Cliente(name, email, birthDate);
        
        System.out.println("\n--- DADOS DO PEDIDO ---");
        System.out.print("Status do Pedido (Ex: PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED): ");
        // valueOf() converte a String para o enum correspondente:
        StatusPedido status = StatusPedido.valueOf(read.nextLine()); 
        
        // Cria o objeto Pedido, associando o cliente e o status:
        Pedido pedido = new Pedido(new Date(), status, cliente);
        
        
        System.out.print("Quantos itens para este pedido? ");
        int n = read.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("\nDados do item #" + i + ":");
            read.nextLine(); 
            
            System.out.print("Nome do Produto: ");
            String nomeProduto = read.nextLine();
            
            System.out.print("Preço do Produto: ");
            double precoProduto = read.nextDouble();
            
            System.out.print("Quantidade: ");
            int quantidadeProduto = read.nextInt();
            
            // Cria o objeto Produto:
            Produto produto = new Produto(nomeProduto, precoProduto);
            
            // Cria o item do pedido, com o produto, quantidade e preço:
            ItensPedido item = new ItensPedido(quantidadeProduto, precoProduto, produto);
            
            // Adiciona o item ao pedido
            pedido.addItem(item);
        }
        
        read.close();

       
        System.out.println("\n-----------------------------");
        System.out.println(pedido); // Chama o método toString() do Pedido
    }
}