package TratamentoDeExceções.ContaBanco.Aplication.src.Entities;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account (){

    }

    public Account(Integer number, String holder, Double withdrawLimit, Double balance) {
        this.number = number;
        this.holder = holder;
        this.withdrawLimit = 100.00;
        this.balance = balance;
    }

    



    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw (Double amount){
        if (balance < 0){
            throw new IllegalArgumentException("ERRO: Saldo Negativo");
        }

        if (balance >= getWithdrawLimit()){
            throw new IllegalArgumentException("ERRO: Limite de saque feito");
        }
        
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account Balance: " + getBalance() + " Number = " + getNumber() + ", Holder = " + getHolder();

    }

    

    
    
}
