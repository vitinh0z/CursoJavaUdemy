package Banco;

public class Conta {


    private String nome;
    private int numeroConta;
    private double saldo;

    



    public Conta(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
      
    }



    public String getNome (){
        return nome;
    }

     public void setNome (String nome){
        this.nome=nome;
    }
   


    public void depositoConta (double valor){ // ----> não retorna nada. Entõa não precisa do return
        saldo += valor;
    }


    public void setConta (int numeroConta){
        this.numeroConta = numeroConta;
    }

    public int getConta () {
        return  numeroConta;
    }


   public void saqueConta (double valor){ // ------> mesma coisa não precisa do return
    double taxa = 5.00;    
    saldo -= valor + taxa;
    }


    public String toString () {
        return String.format("Conta: %d | Nome: %s, | Saldo: %.2f", getConta(), getNome(), saldo );


    }

    
    
}
