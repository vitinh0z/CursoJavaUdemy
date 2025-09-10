package Heranca.ClasseSociais;

public class Rica extends Pessoa {

    private double dinheiro;

    public Rica (){

    }

    public Rica(String nome, Integer idade, double dinheiro) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public void setDinheiro (double dinheiro){
        this.dinheiro = dinheiro;
    }

    public double getDinheiro (){
        return dinheiro;
    }

    public void fazComprar (){
        System.out.println("Fazendo comprar queridas");
    }

    @Override
    public String toString() {
        
        return super.toString();
    }

    
}
