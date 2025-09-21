package MetodosAbstratos.CalculoImposto;

public abstract class TaxPayer {


    private String name;
    private Double anualCome;

    public TaxPayer(){

    }

    public TaxPayer(String name, Double anualCome) {
        this.name = name;
        this.anualCome = anualCome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualCome() {
        return anualCome;
    }

    public void setAnualCome(Double anualCome) {
        this.anualCome = anualCome;
    }

    public abstract Double tax();
    
}
