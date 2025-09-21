package MetodosAbstratos.CalculoImposto;

public class Individual extends TaxPayer  {

    private Double healthExpenditures; 

    


    public Individual(String name, Double anualCome, Double healthExpenditures) {
        super(name, anualCome);
        this.healthExpenditures = healthExpenditures;
    }




    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
    
    @Override
    public Double tax() {

        if (getAnualCome() >= 2000.00){
            return getAnualCome() * 0.15;
        }

        else if (getAnualCome() >= 2000.00){
            return getAnualCome() * 0.25;

        }

        if (healthExpenditures > 0){
           return getAnualCome() - getHealthExpenditures();
        }
        else {
            return getAnualCome();
        }

    }
}
