package Heranca.ClasseSociais;

public class Miseravel extends Pessoa {


    public Miseravel (){

    }

    public Miseravel (String nome, Integer idade){
        super(nome, idade);
    
    }
    
    public void mendiga (){
        System.out.println("Me da 1 reallllll");
    }

    @Override
    public String toString() {
        
        return super.toString();
    }
    
}
