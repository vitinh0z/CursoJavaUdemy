package Heranca.CalculoInss;

public class Gerente extends Empregado{


    private String nomeGerencia;

    public Gerente () {
        
    }

    public Gerente(String nome, Integer idade, String sexo, double salario, String matricula, String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    public void setNomeGerencia (String nomeGerencia){
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia (){
        return nomeGerencia;
    }

    @Override
    public String toString() {
        
        return "GERENTE: " + super.toString() + " " + getNomeGerencia();
    }

    
    
}
