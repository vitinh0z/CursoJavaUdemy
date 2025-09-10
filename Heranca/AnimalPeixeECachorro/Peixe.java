package Heranca.AnimalPeixeECachorro;

public class Peixe extends Animal{

    private String tipoHabitate;

    public Peixe (){

    }

    public Peixe(String nome, double peso, String tipoHabitate) {
        super(nome, peso);
        this.tipoHabitate = tipoHabitate;
    }

    public String getTipohabitate() {
        return tipoHabitate;
    }

    public void setTipoHabitate (String tipoHabitate) {
        this.tipoHabitate = tipoHabitate;
    }

    @Override
    public String toString() {
        
        return super.toString() + " " + getTipohabitate();
    }

    
    
}
