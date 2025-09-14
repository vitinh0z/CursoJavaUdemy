package MetodosFinal;

public class SavingAccountPlus extends SavingAccount {

    @Override
    public void withdraw (double amount){ // ---> não pode ser sobreposto
        balance -= amount + 2.0;
    }

    
}
