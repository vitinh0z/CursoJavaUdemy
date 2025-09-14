package GeradorDeSenha;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GeradorDeSenha {

    public static void geradorDeSenha (GerarSenha gerarSenha, Scanner read) throws IOException {

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

                    if (!gerarSenha.isIncluir_minusculas() && !gerarSenha.isIncluir_maiusculas()
                            && !gerarSenha.isIncluir_numeros() && !gerarSenha.isIncluir_simbolos()) {
                        // ----> se não for nenhum dos dois imprimi essa mensagem;

                        System.out.println("Você deve escolher pelo menos um tipo de caractere para gerar a senha.");

                    } else {

                        String senhaGerada = gerarSenha.gerarSenha();

                        FileWriter arquivo = new FileWriter("senha.txt", true);
                        PrintWriter gravarArq = new PrintWriter(arquivo);

                        System.out.println("Onde será usada essa senha: ");
                        String legenda = read.nextLine();

                        gravarArq.printf(legenda + ": " + " " + senhaGerada + " \n");

                        arquivo.close();

                    }

        
    }
    
}
