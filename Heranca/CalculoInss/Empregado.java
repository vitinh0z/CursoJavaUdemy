package Heranca.CalculoInss;

public class Empregado extends Pessoa{

    private double salario;
    private String matricula;

    public Empregado () {

    }

    public Empregado(String nome, Integer idade, String sexo, double salario, String matricula) { // ----> tem que passar os atributos da mae como paramentro
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public void setSalario (double salario){
        this.salario = salario;
    }

    public double getSalario (){
        return salario;
    }

    public void setMatricula (String matricula){
        this.matricula = matricula;
    }

    public String getMatricula (){
        return matricula;
    }

    public double valorInss (){
        return getSalario() * 0.11;
    }

    @Override
    public String toString() {

        return "EMPREGADO: " + super.toString() + getSalario() + getMatricula();
    }

    


    
    
}
