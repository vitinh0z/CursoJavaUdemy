package Listas.ListaDeTarefas;
import java.util.Scanner;

public class AdicionarTarefa {

    public static void adicionarTarefa(GerenciadorTarefas gerenciadorTarefas, Scanner read) {

        String continuarTarefa;


        int id = 0;
        do {

            Tarefa tarefa = new Tarefa();

            boolean tituloValido = false;

            do {
                try {

                    System.out.println("\nTitulo da tarefa");
                    tarefa.setTitulo(read.nextLine());
                    id++;
                    tituloValido = true;

                    tarefa.setId(id);

                } catch (IllegalArgumentException e) {

                    System.out.println(e.getMessage());

                }

            } while (tituloValido == false);

            System.out.println("\nGostaria de colocar uma descrição para tarefa? s/n");
            String opcao = read.nextLine();

            if (opcao.equals("s")) {

                boolean descricaoValida = false;
                do {

                    try {

                        System.out.println("\nDescrição");
                        tarefa.setDescricao(read.nextLine());
                        descricaoValida = true;

                    } catch (IllegalArgumentException e) {

                        System.out.println(e.getMessage());

                    }

                } while (!descricaoValida);
            }

            else {

                tarefa.setDescricao("Sem Descrição");
            }

            gerenciadorTarefas.getList().add(tarefa);

            System.out.println("\nAdicionar mais outra tarefa? s/n");
            continuarTarefa = read.nextLine();

        } while (continuarTarefa.equalsIgnoreCase("s"));
        for (Tarefa t : gerenciadorTarefas.getList()) {

            System.out.println("-----------------------------");
            System.out.println(t);
        }


    }

}
