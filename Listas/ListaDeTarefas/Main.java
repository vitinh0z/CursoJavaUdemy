package Listas.ListaDeTarefas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String continuar;
        
        Scanner read = new Scanner(System.in);
        List<Tarefa> list = new ArrayList<>();

        System.out.println("\n--------- Lista de Tarefas -------------\n");

        System.out.println("[1] - Criar nova tarefa\n[2] - Editar Tarefa\n[3] - Excluir Tarefa");
        int menu = read.nextInt();

        read.nextLine();


        switch (menu) {
            case 1:

                do  {
                    Tarefa tarefa = new Tarefa();

        

                    System.out.println("\nTitulo da tarefa");
                    tarefa.setTitulo(read.nextLine());


                    
                    System.out.println("Gostaria de colocar uma descrição para tarefa? s/n");
                    String opcao = read.nextLine();
                    

                    if (opcao.equals("s")){

                        System.out.println("Descrição:\n");
                        tarefa.setDescricao(read.nextLine());
                        list.add(tarefa);
                    }

                
                    else {
                        tarefa.setDescricao("Sem Descrição");
                    }

                    System.out.println("Adicionar mais outra tarefa? s/n");
                    continuar = read.nextLine();


                } while (continuar.equals("s"));

                for (Tarefa t : list){
                    System.out.println("-----------------------------");
                    System.out.println(t);
                }

            break;

            case 2 :
                System.out.println("em implementação");
            break;

            case 3:
                System.out.println("em implementação");
            break;
        
        default:
            System.out.println("Opcao Invalida");
        break;
        }
        


    }


    
}
