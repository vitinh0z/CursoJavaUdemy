package BancoCorrecao;


import java.util.Scanner;

public class banco {

    public static void main(String[] args) {
        
    

        Scanner read = new Scanner (System.in);

    
        Conta conta;

    
        System.out.println("Entre com numero da conta: ");
        int numeroConta = read.nextInt();

        read.nextLine();

        System.out.println("Entre com nome: ");
        String nome = read.nextLine();

        System.out.println("Gostaria de realizar deposito inicial? s/n: ");
        String opcao = read.nextLine();
        char escolha = opcao.charAt(0);

     

        if (escolha == 's'){
        
            System.out.println("Entre com deposito inicial: ");
            double depositoConta = read.nextDouble();  // armazenar na varivel valor
            conta = new Conta(nome, numeroConta, depositoConta);// e dps colocar ela como paramentro do metodo deposito
            System.out.println(conta);

        
        }   

        else {

            conta = new Conta(nome, numeroConta); // cria com os valores 0
            
            
        }

        System.out.println();
        System.out.println("Informação da conta: ");
        System.out.println(conta);

        System.out.println();

        System.out.println("Entre com o valor do deposito: ");
        double valor = read.nextDouble();
        conta.depositoConta(valor);

        System.out.println("Valor atualizada da conta: ");
        System.out.println(conta);

        System.out.println("Entre com valor de saque: ");
        valor = read.nextDouble(); // armazenar na varivel valor

        conta.saqueConta(valor); // e dps colocar ela como paramentro do metodo deposito

        System.out.println(conta);
    

    
        




    
    





   

    




    }
}
