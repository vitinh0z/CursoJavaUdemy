package Listas.ListaDeTarefas;
import java.util.Date;


public class Tarefa {


    private int escolhaTarefa;
    private String titulo;
    private String descricao;
    private String editar;
    private int id;
    private String opcao;
    private Date data;    




    public Tarefa () {

    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String getEditar() {
        return editar;
    }


    public void setEditar(String editar) {
        this.editar = editar;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public Tarefa (int escolhaTarefa, String titulo){
        this.escolhaTarefa = escolhaTarefa;
        this.titulo = titulo;
    }

    public void setEscolhaTarefa(int escolhaTarefa){
        this.escolhaTarefa = escolhaTarefa;
    }

    public int getEscolhaTarefa (){
        return escolhaTarefa;
    }

    public void setTarefas (String tarefas){
        this.titulo = tarefas;
    }

    public String getTarefas (){
        return titulo;
    }

    public void setOpcao(String opcao){
        this.opcao = opcao;
    }

    public String getOpcao (){
        return opcao;
    }

    public boolean verificarDescricao (){
        if (getOpcao() == "s") {
            return false;
        }

        else if (getOpcao() == "n"){
            return false;
        }
        else {
            return true;
        }
    }

    
}
