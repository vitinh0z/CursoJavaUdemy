public class FuncionariosTerceiros extends Funcionarios {

    private double salarioAdicional;

    public FuncionariosTerceiros (){

    }

    public FuncionariosTerceiros(String nome, Integer horas, double valorHora, double salarioAdicional) {
        super(nome, horas, valorHora);
        this.salarioAdicional = salarioAdicional;
    }

    public double getSalarioAdicional() {
        return salarioAdicional;
    }

    public void setSalarioAdicional(double salarioAdicional) {
        this.salarioAdicional = salarioAdicional;
    }

    @Override
    public double pagamento (){
       return super.pagamento() + salarioAdicional * 1.1;
    }



    
    
}
