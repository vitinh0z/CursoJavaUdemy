package GeradorDeSenha;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int menu;

        Scanner read = new Scanner(System.in);
        GerarSenha gerarSenha = new GerarSenha();

        System.out.println("----------- Gerador de Senha ---------- ");

        do {

            System.out.print("[1] - Gerar Senha\n[2] - Abrir Cofre\n[3] - Fechar Cofre\n[4] - Sair\nOpção: ");
            menu = read.nextInt();

            read.nextLine();

            switch (menu) {
                case 1:

                    GeradorDeSenha.geradorDeSenha(gerarSenha, read);

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

        } while (menu != 4);

        read.close();
    }
}