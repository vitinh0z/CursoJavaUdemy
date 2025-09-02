package Listas.ListaDeTarefas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        System.out.println("\n--------- Lista de Tarefas -------------\n");

        
        Tarefa tarefa = new Tarefa("Sem descrição");

        List<Tarefa> list = new ArrayList<>();

        System.out.println("\nTitulo da tarefa");
        System.out.println("");
        tarefa.setTitulo(read.nextLine());


        
        do  {
            
            System.out.println("Gostaria de colocar uma descrição para tarefa? s/n");
            tarefa.setOpcao(read.nextLine());
            

            if (tarefa.getOpcao().equals("s")){

                System.out.println("Descrição:\n");
                System.out.println("");
                tarefa.setTarefas(read.nextLine());
                list.add(tarefa);

                for (Tarefa x : list){
                    System.out.println(x.toString());
                }
            }

           
            else if (tarefa.getOpcao().equals("n")) {
                list.add(tarefa);
                 
                



                for (Tarefa x: list){
                    System.out.println(x.toString());
                }
            }

            else {
                System.out.println("opcão Invalida ");
                
            }

        } while (tarefa.verificarDescricao() == false);


            

       
            

        

    }


    
}
