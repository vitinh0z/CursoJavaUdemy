package ParamentConstructor;

public class Dog {

    private String nome;
    private String cor;

    public Dog (String nome, String cor){ // ----> construtor com parametro
        this.nome = nome;
        this.cor = cor;
    }


    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome (){
        return nome;
    }

    public void setCor (String cor){
        this.cor = cor;
    }

    public String getCor (){
        return cor;
    }

    public String toString (){
        return "Nome: " + getNome() + " | Cor: " + getCor();
    }






    
}
