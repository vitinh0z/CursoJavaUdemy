package GeradorDeSenha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        System.out.println("----------- Gerador de Senha ---------- ");

        System.out.print("[1] - Gerar Senha\n[2] - Abrir Cofre\n[3] - Fechar Cofre\nOpção: ");
        int menu = read.nextInt();

        GerarSenha gerarSenha = new GerarSenha();

        System.out.println(gerarSenha);

        switch (menu) {
            case 1:

                System.out.println("---- Gerar Senha ----");
                System.out.println("Deve conter Número?: (s/n)");
                char opcao = read.nextLine().charAt(0);

                if (opcao.equals(){
                    
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
                System.out.println("Em implementação");
            break;

        }

        read.close();







    }
    
}
