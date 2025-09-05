package Listas.ListaDeTarefas;
import java.util.Scanner;



public class ExcluirTarefa {
    public static void excluir ( GerenciadorTarefas gerenciadorTarefas) {


        Scanner read = new Scanner(System.in);

        System.out.println("Digite o ID da tarefa que gostaria de excluir: ");
        int id = read.nextInt();

        if (gerenciadorTarefas.removerTarefa(id)){
            System.out.printf("\nTarefa do ID: %d REMOVIDA\n", id);
        }
        else {
            System.out.println("ID não encontrado");
        }

        gerenciadorTarefas.listarTarefas();
        
    }
}
