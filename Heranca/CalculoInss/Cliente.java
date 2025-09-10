package Heranca.CalculoInss;

public class Cliente extends Pessoa {

    private double valorDivida;
    private int anoNascimento;


    public Cliente () {

    }


    public Cliente(String nome, Integer idade, String sexo, double valorDivida, int anoNascimento) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }


    public double getValorDivida() {
        return valorDivida;
    }


    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }


    public int getAnoNascimento() {
        return anoNascimento;
    }


    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
       
        return super.toString() + " " + getAnoNascimento() + " " + getValorDivida();
        
    }



    
}
