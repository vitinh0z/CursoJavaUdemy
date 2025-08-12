package OrientaçãoAObjetos.Exercicios;

public class Funcionario {

    private String nome;
    private double salarioBruto;
    private double imposto;
    private double aumento;
    



    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome () {
        return nome;
    }

    public void setSalarioBruto (double salarioBruto){
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioBruto (){
        return salarioBruto;
    }

    public void setImposto (double imposto){
        this.imposto = imposto;
    }

    public double getImposto (){
        return imposto;
    }

    public void setAumento (double aumento) {
        this.aumento = aumento;
    }
    public double getAumento (){
        return aumento;
    }


    public double salarioLiquido (){
        return getSalarioBruto() - getImposto();

    }

    public double salarioFinal () {
        return salarioLiquido() + (salarioLiquido() * (getAumento()/100)) ;
    }

    public String toString (){
        return "Atualização: " + getNome() + " Salario Bruto " + getSalarioBruto() + " recebe aumento de: " + getAumento() + "\n | Salario Novo: " + salarioFinal();
    }
}

