package Heranca.CalculoInss;

public class Vendedor extends Empregado{

    private double valorVenda;
    private Integer qntVendas;

    public Vendedor (){

    }

    public Vendedor(String nome, Integer idade, String sexo, double salario, String matricula, double valorVenda,Integer qntVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVenda = valorVenda;
        this.qntVendas = qntVendas;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Integer getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(Integer qntVendas) {
        this.qntVendas = qntVendas;
    }

    @Override
    public String toString() {
        
        return super.toString() + " " + getQntVendas() + " " + getValorVenda();
    }

    









}