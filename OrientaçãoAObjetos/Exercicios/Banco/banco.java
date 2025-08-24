package Banco;


import java.util.Scanner;

public class banco {
    
    public static void main(String[] args) {
        
    

    Scanner read = new Scanner (System.in);

    
       

    
    System.out.println("Entre com numero da conta: ");
    int numeroConta = read.nextInt();

    read.nextLine();

    System.out.println("Entre com nome: ");
    String nome = read.nextLine();

    System.out.println("Gostaria de realizar deposito inicial? s/n: ");
    String opcao = read.nextLine();
    char escolha = opcao.charAt(0);

    Conta conta = new Conta(nome, numeroConta);

    if (escolha == 's'){
        
        System.out.println("Entre com deposito inicial: ");
        double valor = read.nextDouble();  // armazenar na varivel valor
        conta.depositoConta(valor); // e dps colocar ela como paramentro do metodo deposito

        System.out.println(conta);

        
    }   


    




    

        System.out.println("Entre com valor de saque: ");
        double valor = read.nextDouble(); // armazenar na varivel valor

        conta.saqueConta(valor); // e dps colocar ela como paramentro do metodo deposito

        System.out.println(conta);
    

    
        




    
    





   

    




    }
}
