package Listas.ListaDeTarefas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();
        int menu;
 
        System.out.println("\n--------- Lista de Tarefas -------------\n");
        
        do {
        System.out.print("[1] - Criar nova tarefa\n[2] - Editar Tarefa\n[3] - Excluir Tarefa\n[4] - Sair\nOpção: ");
        menu = read.nextInt();

        read.nextLine();

        
            switch (menu) {
                case 1:

                    AdicionarTarefa.adicionarTarefa(gerenciadorTarefas, read);
                
                break;

                case 2 :

                    EditarTarefa.editarTarefa(gerenciadorTarefas, read);

                break;

                case 3:

                    ExcluirTarefa.excluir(gerenciadorTarefas, read);

                break;

                case 4:

                    System.out.println("Saindo...");

                break;
        
                default:

                    System.out.println("Opcao Invalida");

                break;

            }

        } while (menu != 4);

        read.close();

    }

    
    
}
