    package Listas.ListaDeTarefas;

    import java.util.Scanner;

    public class EditarTarefa {

        public static void editarTarefa(GerenciadorTarefas gerenciadorTarefas, Scanner read) {

            
            System.out.println("Digite o id da tarefa que gostaria de editar: ");
            int id = read.nextInt();

            read.nextLine();
            
            System.out.println("Digite o novo titulo: ");
            String novoTitulo = read.nextLine();

            System.out.println("Digite a nova descrição: ");
            String novaDescricao = read.nextLine();
            
            gerenciadorTarefas.editar(id, novoTitulo, novaDescricao);


            for (Tarefa t : gerenciadorTarefas.getList()) {
                System.out.println(t);
                
            }










            
        }
        
    }
