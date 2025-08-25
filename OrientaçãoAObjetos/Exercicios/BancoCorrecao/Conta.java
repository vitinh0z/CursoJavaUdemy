package OrientaçãoAObjetos.Exercicios.BancoCorrecao;

public class Conta {


    private String nome;
    private int numeroConta;
    private double saldo;

    



    public Conta(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
      
    }

    



    public Conta(String nome, int numeroConta, double InicioSaldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        depositoConta(InicioSaldo); //
    }





    public String getNome (){
        return nome;
    }

    public void setNome (String nome){
        this.nome=nome;
    }
   

    public int getConta () { // -----> valor da conta não muda, por tanto deve usar apenas o get. Se pudesse mudar, daria pra usar set
    return  numeroConta;
    }


    public double getSaldo (){ // ------> so muda se tiver saque ou deposito
        return saldo;
    }


    public void depositoConta (double valor){ // ----> não retorna nada. Entõa não precisa do return
        saldo += valor;
    }



    public void saqueConta (double valor){ // ------> mesma coisa não precisa do return
    double taxa = 5.00;    
    saldo -= valor + taxa;
    }


    public String toString () {
        return String.format("Conta: %d | Nome: %s, | Saldo: %.2f", getConta(), getNome(), saldo );


    }

    
    
}
