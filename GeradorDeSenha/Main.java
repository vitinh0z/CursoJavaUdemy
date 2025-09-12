package GeradorDeSenha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        System.out.println("----------- Gerador de Senha ---------- ");

        System.out.print("[1] - Gerar Senha\n[2] - Abrir Cofre\n[3] - Fechar Cofre\nOpção: ");
        int menu = read.nextInt();

        read.nextLine();

        GerarSenha gerarSenha = new GerarSenha();

        System.out.println(gerarSenha);

        switch (menu) {

            case 1:

                System.out.println("---- Gerar Senha ----");

                System.out.println("qual tamanho da senha: ");
                gerarSenha.setTamanho(read.nextInt());

                System.out.println("Deve conter Número?: (s/n)");
                char opcao = read.nextLine().charAt(0);
               
                System.out.println("Deve conter Minusculas?: (s/n)");
                opcao = read.nextLine().charAt(0);

                if (opcao == 's'){

                    gerarSenha.setIncluir_minusculas(true);

                }

                System.out.println("Deve conter Maiusculas?: (s/n)");
                opcao = read.nextLine().charAt(0);

                if (opcao == 's'){

                    gerarSenha.setIncluir_maiusculas(true);
                       
                }
                       
                System.out.println("Deve conter Números: (s/n)");
                opcao = read.nextLine().charAt(0);

                if (opcao == 's'){

                    gerarSenha.setIncluir_numeros(true);
                }

    
                System.out.println("Deve conter simbolos: (s/n)");
                opcao = read.nextLine().charAt(0);

                if (opcao == 's'){

                    gerarSenha.setIncluir_simbolos(true);
                }

                            


                System.out.println("Senha: " + gerarSenha.gerarSenha());

    
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
                System.out.println("Em implementação");
            break;

        }

        read.close();







    }
    
}
