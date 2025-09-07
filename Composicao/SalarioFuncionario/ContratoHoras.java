package Composicao.SalarioFuncionario;

import java.util.Date;

public class ContratoHoras {


    private Date data;
    private double valorHora;
    private Integer horas;


    public ContratoHoras (){

    }

    public ContratoHoras (Date data, double valorHora, Integer horas){
        this.data = data;
        this.horas = horas;
        this.valorHora = horas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double valorTotal (){
        return getValorHora() * getHoras();
    }
    
    
    
}
