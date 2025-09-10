package Listas.ListaDeTarefas;



public class Tarefa {


    private String titulo;
    private int id; 
    private String descricao;


    public Tarefa () {

    }

    
    public Tarefa (String descricao){
        this.descricao = descricao;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        if (titulo.isEmpty()){
            throw new IllegalArgumentException("Nome da tarefa não pode ser vazio");
        }
        this.titulo = titulo;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        if (descricao.isEmpty()){
            throw new IllegalArgumentException("Deve conter descrição");
        }
        this.descricao = descricao;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return String.format(
        "\nID:\n%d\nTítulo da Tarefa:\n%s\n\nDescrição da Tarefa:\n%s\n",
        getId(),
        getTitulo(),
        getDescricao());
    }


    
}
