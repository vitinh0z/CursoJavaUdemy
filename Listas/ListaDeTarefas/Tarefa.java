package Listas.ListaDeTarefas;
import java.util.Date;


public class Tarefa {


    private int escolhaTarefa;
    private String tarefas;
    private String descricao;
    private Date id;
    




    

    public Tarefa () {



    }



    public Tarefa (int escolhaTarefa, String tarefas){
        this.escolhaTarefa = escolhaTarefa;
        this.tarefas = tarefas;
    }

    public void setEscolhaTarefa(int escolhaTarefa){
        this.escolhaTarefa = escolhaTarefa;
    }

    public int getEscolhaTarefa (){
        return escolhaTarefa;
    }

    public void setTarefas (String tarefas){
        this.tarefas = tarefas;
    }

    public String getTarefas (){
        return tarefas;
    }


    
}
