package Listas.ListaDeTarefas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class ExcluirTarefa {
    public static void excluir ( GerenciadorTarefas gerenciadorTarefas) {

        
        Tarefa tarefa = new Tarefa();
        List<Tarefa> list = new ArrayList<>();

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o ID da tarefa que gostaria de excluir: ");
        int id = read.nextInt();

        if (gerenciadorTarefas.removerTarefa(tarefa.getId())){
            System.out.printf("\nTarefa do ID: %d REMOVIDA\n", id);
        }
        else {
            System.out.println("ID não encontrado");
        }

        gerenciadorTarefas.listarTarefas();

        




        
    }
}
