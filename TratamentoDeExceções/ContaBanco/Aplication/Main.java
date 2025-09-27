package TratamentoDeExceções.ContaBanco.Aplication;

import java.util.Scanner;

import TratamentoDeExceções.ContaBanco.Aplication.Entities.Account;


public class Main {
    public static void main(String[] args) {
        


        Scanner read = new Scanner (System.in);
        

        System.out.println("Entre com numero da conta: ");
        int number = read.nextInt();

        read.nextLine();

        System.out.println("Entre com nome da conta: ");
        String name = read.nextLine();

        System.out.println("Gostaria de fazer um Saque ou Deposito | [1] - Saque\n[2] - Deposito\nOpção: ");
        int opcao = read.nextInt();

        System.out.println("Entre com Saldo Inicial: ");
        Double balance = read.nextDouble();

        System.out.println("Limite de saque: ");
        Double withdrawLimit = read.nextDouble();


        try {
            switch (opcao) {
                case 1:

                    System.out.println("Digite o valor do saque: ");
                    Double saque = read.nextDouble();

                    Account account = new Account(number, name, withdrawLimit, balance);

                    account.withdraw(saque);

                    System.out.println(account);
                    
                    break;

                case 2:

                    System.out.println("Digite o valor do deposito: ");
                    Double deposito = read.nextDouble();

                    Account account2 = new Account(number, name, withdrawLimit, balance);

                    account2.deposit(deposito);

                    System.out.println(account2);

                break;
            
                default:
                    break;
            }
        } catch (IllegalArgumentException e){

            System.out.println(e.getMessage());
        }

        



    }
}