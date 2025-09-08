package Composicao.PedidoCliente;

import java.text.ParseException;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        
        Scanner read = new Scanner(System.in);
        LocalTime momentoPedido = LocalTime.now();

        
        System.out.println("Digite o nome: ");
        String name = read.nextLine();

        System.out.println("Digite o email: ");
        String email = read.nextLine();

        System.out.println("Digite data de nascimento");
        String birthDate = read.nextLine();


        Cliente cliente = new Cliente(name, email, birthDate);

        System.out.println("Digite status: ");
        String statusProduct = read.nextLine();

        System.out.println("Digite a quantidade de produtos");
        int quantidade = read.nextInt();
        
        read.nextLine();
        
        for (int i = 0; i<quantidade; i++){
            System.out.printf("Entre com %d", i+1);

            System.out.printf("Entre com nome: ");
            String nomeProduto = read.nextLine();
            System.out.println("Digite a quantidade: ");
            int quantidadeProduto = read.nextInt();
            System.out.println("Preço do produto: ");
            double precoProduto = read.nextDouble();

            Produto produto = new Produto(nomeProduto, precoProduto);
            ItensPedido itensPedido = new ItensPedido(quantidadeProduto, precoProduto, produto);

             System.out.println(itensPedido);

        }
        

            

            
            System.out.println();



      
      







    }
    
}
