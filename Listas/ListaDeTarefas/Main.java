package Listas.ListaDeTarefas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        System.out.println("--------- Lista de Tarefas ------------- ");

        
        Tarefa tarefa = new Tarefa();

        List<Tarefa> list = new ArrayList<>();

        System.out.println("Titulo");
        System.out.println("");
        tarefa.setTitulo(read.nextLine());

        boolean verificarDescricao = false;

        do {
            System.out.println("Gostaria de colocar uma descrição para tarefa? s/n");
            char op = read.nextLine().charAt(0);
            verificarDescricao = true;

            switch (Character.toLowerCase(op)) {

                case 's':
                    System.out.println("Descrição");
                    System.out.println("");
                    tarefa.setTarefas(read.nextLine());
                    list.add(tarefa);  
                break;

                case 'n':
                    list.add(tarefa);
                break;

                default:
                    System.out.println("Opção Invalida");
                break;
            }

        } while (verificarDescricao == false);

    }
    
}
