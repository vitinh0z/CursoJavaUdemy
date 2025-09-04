package Listas.ListaDeTarefas;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AdicionarTarefa {

    public static void adicionarTarefa () {

        
        String continuarTarefa;

        List<Tarefa> list = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        
        int id = 0;
        do{
            Tarefa tarefa = new Tarefa();

            
            

            System.out.println("\nTitulo da tarefa");
            tarefa.setTitulo(read.nextLine()); 
            id++;
            tarefa.setId(id);

            
            

                    
            System.out.println("\nGostaria de colocar uma descrição para tarefa? s/n");
            String opcao = read.nextLine();
                    

            if (opcao.equals("s")){

                System.out.println("\nDescrição");
                tarefa.setDescricao(read.nextLine());
                list.add(tarefa);
            }

                
            else {

                tarefa.setDescricao("Sem Descrição");
            }

            System.out.println("\nAdicionar mais outra tarefa? s/n");
            continuarTarefa = read.nextLine();

            list.add(tarefa);

        } while (continuarTarefa.equals("s"));

        for (Tarefa t : list){

            System.out.println("-----------------------------");
            System.out.println(t);
        }

            
        
    }
    
}
