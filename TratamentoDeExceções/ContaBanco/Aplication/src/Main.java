package TratamentoDeExceções.ContaBanco.Aplication.src;

import TratamentoDeExceções.ContaBanco.Aplication.src.Entities;

import java.util.Scanner;

import Heranca.Exemplo.Account;

public class Main {
    public static void main(String[] args) {
        


        Scanner read = new Scanner (System.in);
        

        System.out.println("Entre com nome da conta: ");
        int number = read.nextInt();

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

                    Account account = new Account(number, name, balance);

                    account.withdraw(saque);

                    System.out.println(account);
                    
                    break;

                case 2:

                    System.out.println("Digite o valor do deposito: ");
                    Double deposito = read.nextDouble();

                     = new Account(number, name, balance);

                    account.deposit(deposito);

                    System.out.println(account);



                break;
            
                default:
                    break;
            }
        } catch (IllegalArgumentException e){

            System.out.println(e.getMessage());
        }

        



    }
}