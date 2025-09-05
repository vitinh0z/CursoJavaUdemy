package Listas.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {

    Tarefa tarefa = new Tarefa();
    private List<Tarefa> list = new ArrayList<>();

    
    public boolean removerTarefa (int id){
    return list.removeIf(remover -> remover.getId() == id);
        
    }

    public Tarefa buscar (int id){
        for (Tarefa tarefa : list) {
            if (tarefa.getId() == id){
                return tarefa;
            }
        }
        return null;
    }


    public boolean editar (int id, String novoTitulo, String novaDescricao){
        Tarefa tarefa = buscar(id);
        if (tarefa != null){
            tarefa.setTitulo(novoTitulo);
            tarefa.setDescricao(novaDescricao);
            return true;
        }
        return false;
    }



    public void listarTarefas (){
        for (Tarefa tarefa : list) {
            System.out.println(tarefa);
        }
    }





    
}
