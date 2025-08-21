package DefaultConstructor;

public class Cat {

    private String nome;
    private int idade;


    public Cat(){
        this.nome = "Desconhecido"; 
        this.idade = 0; 
    }


    public String getNome (){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public int getIdade (){
        return idade;
    }

    public void setIdade (int idade){
        this.idade = idade;
    }


    public String toString(){
        return "O nome do Gato é: " + getNome () + " E tem " + getIdade() + " Anos";
    }


    
}
