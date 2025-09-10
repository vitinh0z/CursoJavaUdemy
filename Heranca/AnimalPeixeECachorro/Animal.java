package Heranca.AnimalPeixeECachorro;

public class Animal {

    private String nome;
    private double peso;
    
    public Animal () {

    }

    public Animal (String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return " " + getNome() + " " + getPeso() + " ";
    }

    

    
    
}
