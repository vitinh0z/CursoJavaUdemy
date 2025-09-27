package TratamentoDeExceções.ContaBanco.Aplication.Entities;

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
        this.withdrawLimit = withdrawLimit;
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
        if (amount > getWithdrawLimit()){
            throw new IllegalArgumentException("ERRO: O valor do saque excede o limite");
        }

        if (amount > getBalance()){
            throw new IllegalArgumentException("ERRO: Saldo Insuficiente");
        }

        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account Balance: " + getBalance() + " Number = " + getNumber() + ", Holder = " + getHolder();

    }

    

    
    
}
