package Listas.ListaDeTarefas;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AdicionarTarefa {

    public static void adicionarTarefa(GerenciadorTarefas gerenciadorTarefas) {

        String continuarTarefa;

        List<Tarefa> list = new ArrayList<>();
        Scanner read = new Scanner(System.in);

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

            list.add(tarefa);

            System.out.println("\nAdicionar mais outra tarefa? s/n");
            continuarTarefa = read.nextLine();

        } while (continuarTarefa.equalsIgnoreCase("s"));

        for (Tarefa t : list) {

            System.out.println("-----------------------------");
            System.out.println(t);
        }

        Main.main(null);

    }

}
