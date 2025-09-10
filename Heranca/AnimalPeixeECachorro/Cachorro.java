package Heranca.AnimalPeixeECachorro;

public class Cachorro extends Animal {

    private String raca;

    public Cachorro (){



    }

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    public String getTipoHabitate() {
        return raca;
    }

    public void setTipoHabitate(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getTipoHabitate();
    }

    
    
}
