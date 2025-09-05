package Listas.ListaDeTarefas;

import java.util.Scanner;

public class EditarTarefa {

    public static void editarTarefa(GerenciadorTarefas gerenciadorTarefas) {


        Scanner read = new Scanner(System.in);


        System.out.println("Digite o id da tarefa que gostaria de editar: ");
        int id = read.nextInt();

        System.out.println("Digite o novo titulo: ");
        String novoTitulo = read.nextLine();

        System.out.println("Digite a nova descrição: ");
        String novaDescricao = read.nextLine();

        gerenciadorTarefas.editar(id, novoTitulo, novaDescricao);










        
    }
    
}
