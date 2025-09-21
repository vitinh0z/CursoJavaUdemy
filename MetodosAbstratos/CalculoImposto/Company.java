package MetodosAbstratos.CalculoImposto;

public class Company extends TaxPayer {

    private Integer quantidadeFuncionarios;


    public Company(){

    }

    public Company(String name, Double anualCome, Integer quantidadeFuncionarios) {
        super(name, anualCome);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    

    public Integer getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }


    @Override
    public Double tax() {
        if (quantidadeFuncionarios >= 10){
            return getAnualCome()  * 0.14;
        }
        else {
            return getAnualCome() * 0.16;
        }
        
    }
    
}
