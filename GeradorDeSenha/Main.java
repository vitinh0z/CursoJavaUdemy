package GeradorDeSenha;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner read = new Scanner(System.in);
        GerarSenha gerarSenha = new GerarSenha();
        
        System.out.println("----------- Gerador de Senha ---------- ");

        
        System.out.print("[1] - Gerar Senha\n[2] - Abrir Cofre\n[3] - Fechar Cofre\n[4] - Sair\nOpção: ");
        int menu = read.nextInt();

        read.nextLine(); 

        switch (menu) {
            case 1:
                System.out.println("---- Gerar Senha ----");

                System.out.print("Qual o tamanho da senha: ");
                int tamanho = read.nextInt();
                read.nextLine(); 

                gerarSenha.setTamanho(tamanho);

                System.out.print("Deve conter letras minúsculas? (s/n): ");
                char opcao = read.nextLine().charAt(0);
                if (opcao == 's' || opcao == 'S') {
                    gerarSenha.setIncluir_minusculas(true);
                }

                System.out.print("Deve conter letras maiúsculas? (s/n): ");
                opcao = read.nextLine().charAt(0);
                if (opcao == 's' || opcao == 'S') {
                    gerarSenha.setIncluir_maiusculas(true);
                }

                System.out.print("Deve conter números? (s/n): ");
                opcao = read.nextLine().charAt(0);
                if (opcao == 's' || opcao == 'S') {
                    gerarSenha.setIncluir_numeros(true);
                }

                System.out.print("Deve conter símbolos? (s/n): ");
                opcao = read.nextLine().charAt(0);
                if (opcao == 's' || opcao == 'S') {
                    gerarSenha.setIncluir_simbolos(true);
                }

               
                if (!gerarSenha.isIncluir_minusculas() && !gerarSenha.isIncluir_maiusculas() && !gerarSenha.isIncluir_numeros() && !gerarSenha.isIncluir_simbolos()) {
                    // ----> se não for nenhum dos dois imprimi essa mensagem;
                    
                    System.out.println("Você deve escolher pelo menos um tipo de caractere para gerar a senha.");
                    
                } else {


                    

                    String senhaGerada = gerarSenha.gerarSenha();

                    
                    FileWriter arquivo = new FileWriter("senha.txt");
                    PrintWriter gravarArq = new PrintWriter(arquivo);


                    System.out.println("Onde será usada essa senha: ");
                    String legenda = read.nextLine();


                    gravarArq.printf(legenda + " " + senhaGerada);

                   
                    

                    arquivo.close();


                }

                break;

            case 2:
                System.out.println("Abrir Cofre");
             
                break;

            case 3:
                System.out.println("Fechar cofre");
               
                break;

            case 4:
                System.out.println("Saindo....");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

        read.close();
    }
}