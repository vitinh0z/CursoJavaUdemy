package SubreposicaoSuperOverride;



public class Main {

    public static void main(String[] args) {
        

        Account acc1 = new Account(212, "Victor", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingAccount(2212, "Maria", 1000.0, 0.1);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());


        Account acc3 = new BussinesAccount(212, "BOb", 1000.0, 500.0);
        acc3.withdraw(200);
        System.out.println(acc3.getBalance());

    }
    
}
