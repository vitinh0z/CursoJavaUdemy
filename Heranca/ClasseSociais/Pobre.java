package Heranca.ClasseSociais;

public class Pobre extends Pessoa {

    public Pobre (String nome, Integer idade){
        super(nome, idade);
    }




    public void trabalha (){
        System.out.println("Trabalhanod");
    }
    

    @Override
    public String toString() {
        
        return super.toString();
    }
}
