package Vetores.VetorDadosPessoais;

public class Pessoas {


    private double altura;
    private String genero;




    public Pessoas (double altura, String genero){
        this.genero = genero;
        this.altura = altura;

    }

    public void setAltura (double altura){
        this.altura = altura;
    }

    public double getAltura (){
        return altura;
    }

    public void setGenero (String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return genero;
    }

    


    
}
