package Listas.ListaDeTarefas;



public class Tarefa {


    private String titulo;
    private int id;
    private String opcao;  
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
        this.titulo = titulo;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
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
        "\nTítulo da Tarefa:\n%s\n\nDescrição da Tarefa:\n%s\n",
        getTitulo(),
        getDescricao()
    );
}


    

    
}
