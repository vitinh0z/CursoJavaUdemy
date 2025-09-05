package Listas.ListaDeTarefas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

         GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();


        System.out.println("\n--------- Lista de Tarefas -------------\n");

        System.out.print("[1] - Criar nova tarefa\n[2] - Editar Tarefa\n[3] - Excluir Tarefa\nOpção: ");
        int menu = read.nextInt();

        read.nextLine();


        switch (menu) {
            case 1:

                AdicionarTarefa.adicionarTarefa(gerenciadorTarefas);
                
            break;

            case 2 :
                ExcluirTarefa.excluir(gerenciadorTarefas);
            break;

            case 3:
                System.out.println("em implementação");
            break;
        
        default:
            System.out.println("Opcao Invalida");
        break;
        }

        read.close();
        


    }


    
}
