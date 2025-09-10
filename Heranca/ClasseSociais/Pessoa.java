package Heranca.ClasseSociais;

public class Pessoa {

    private String nome;
    private Integer idade;

    public Pessoa (){

    }

    public Pessoa (String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome () {
        return nome;
    }

    public void setIdade (Integer idade){
        this.idade = idade;
    }

    public Integer getIdade (){
        return idade;
    }

    public void pessoa (){
        System.out.println("Pessoa");
    }

    @Override
    public String toString() {
        return "Pessoa = " + getNome() + "Idade= " + getIdade();
    }

    
        
    }
    
