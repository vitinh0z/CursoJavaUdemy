package UpcastingEDowncasting;
    

public class BussineAccount extends Account {

    private double loanLimit;


    public BussineAccount (){
        super();
    }


    public BussineAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }


    public double getLoanLimit() {
        return loanLimit;
    }


    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan (double amount){
        if (amount <= loanLimit){
            balance += amount;
        }

    }

    

    
}
