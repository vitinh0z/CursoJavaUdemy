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


        do {

            System.out.println("Gostaria de colocar uma descrição para tarefa? s/n");
            tarefa.setOpcao(read.nextLine());
            

            if (tarefa.getOpcao() == "s"){

                System.out.println("Descrição");
                System.out.println("");
                tarefa.setTarefas(read.nextLine());
                list.add(tarefa);
            }

            else if (tarefa.getOpcao() == "n") {
                System.out.println("Sem descrição da tarefa");
                list.add(tarefa);
            }

            else {
                System.out.println("opcão Invalida ");
            }

        } while (tarefa.verificarDescricao() == true);
            

       
            

        

    }


    
}
